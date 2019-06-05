package co.edu.eafit.dis.st0270.s20191.raptors.visitors;

import co.edu.eafit.dis.st0270.s20191.raptors.abs.Loprior;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.LopriorTerminal;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.Name;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.Negation;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.LopriorRoot;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.LopriorNode;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.And;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.Or;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.Predicate;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.Variable;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.Cond;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.Exist;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.ForAll;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.Functor;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.Bicond;

public class AssemblerVisitor implements LopriorVisitor {

    private StringBuffer assemblerCode = null;

    public AssemblerVisitor() {
        assemblerCode = new StringBuffer();
    }

    public String getAssemblerCode() {
        return assemblerCode.toString();
    }

    public void visit(LopriorRoot root) {
        assemblerCode.append("# This is a generated program don't edit\n").append(".text\n").append("main:\n");
        Loprior loprior = root.getloprior();
        AssemblerVisitor lopriorV = new AssemblerVisitor();
        loprior.accept(lopriorV);
        assemblerCode.append(lopriorV.getAssemblerCode()).append("\n").append("# end of file\n");
    }

    public void visit(LopriorNode node) {

        Loprior left = node.getLeftChild();
        Loprior right = node.getRightChild();
        AssemblerVisitor asLeft = new AssemblerVisitor();
        AssemblerVisitor asRight = new AssemblerVisitor();
        left.accept(asLeft);
        right.accept(asRight);
        assemblerCode.append(asLeft.getAssemblerCode()).append(' ').append(asRight.getAssemblerCode()).append(' ')
                .append(node.getOperator());
    }

    public void visit(And and) {
        visit((LopriorNode) and);
    }

    public void visit(Or or) {
        visit((LopriorNode) or);
    }

    public void visit(Cond cond) {
        visit((LopriorNode) cond);
    }

    public void visit(Bicond bicond) {
        visit((LopriorNode) bicond);
    }

    public void visit(LopriorTerminal term) {
        assemblerCode.append("\t move ");
    }

    public void visit(Predicate predicate) {
        visit((LopriorTerminal) predicate);
    }

    public void visit(Functor functor) {
        visit((LopriorTerminal) functor);
    }

    public void visit(Name name) {
        visit((LopriorTerminal) name);
    }

    public void visit(Variable var) {
        visit((LopriorTerminal) var);
    }

    public void visit(ForAll forall) {
        visit((LopriorNode) forall);
    }

    public void visit(Exist exist) {
        visit((LopriorNode) exist);
    }

    public void visit(Negation negation) {
        visit((LopriorNode) negation);
    }

}
