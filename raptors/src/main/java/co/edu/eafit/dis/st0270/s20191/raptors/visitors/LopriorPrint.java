package co.edu.eafit.dis.st0270.s20191.raptors.visitors;

import co.edu.eafit.dis.st0270.s20191.raptors.abs.Loprior;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.LopriorRoot;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.Name;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.Negation;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.LopriorNode;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.And;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.Or;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.Predicate;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.Cond;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.Exist;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.ForAll;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.Functor;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.Bicond;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.Variable;

public class LopriorPrint implements LopriorVisitor {

    private String res = null;

    public LopriorPrint() {
    }

    public String getResult() {
        return res;
    }

    private String getLeftResult(LopriorNode loprior) {

        Loprior left = loprior.getLeftChild();
        LopriorPrint calleft = new LopriorPrint();

        left.accept(calleft);

        return calleft.getResult();
    }

    private String getRightResult(LopriorNode loprior) {

        Loprior right = loprior.getRightChild();
        LopriorPrint calright = new LopriorPrint();

        right.accept(calright);

        return calright.getResult();
    }

    public void visit(Loprior loprior) {
    }

    public void visit(LopriorRoot root) {
        Loprior loprior = root.getloprior();
        LopriorPrint ep = new LopriorPrint();
        loprior.accept(ep);
        res = new String(ep.getResult());
    }

    public void visit(And and) {

        res = "( " + getLeftResult(and) + " ∧ " + getRightResult(and) + " )";
    }

    public void visit(Or or) {

        res = "(" + getLeftResult(or) + " ∨ " + getRightResult(or) + " )";
    }

    public void visit(Cond cond) {

        res = "( " + getLeftResult(cond) + " → " + getRightResult(cond) + " )";
    }

    public void visit(Bicond bicond) {

        res = "( " + getLeftResult(bicond) + " ↔ " + getRightResult(bicond) + " )";
    }

    public void visit(Variable var) {
        res = var.toString();
    }

    public void visit(Name name) {
        res = name.toString();
    }

    public void visit(Functor functor) {
        res = functor.toString();
    }

    public void visit(Predicate predicate) {
        res = predicate.toString();
    }

    public void visit(ForAll forall) {
        res ="∀ " + getRightResult(forall);
    }

    public void visit(Exist exist) {
        res ="∃ " + getRightResult(exist);
    }

    public void visit(Negation negation) {
        res = "¬ " + getRightResult(negation);
    }
}
