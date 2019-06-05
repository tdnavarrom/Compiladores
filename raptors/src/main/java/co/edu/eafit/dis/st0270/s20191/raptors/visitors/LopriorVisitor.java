package co.edu.eafit.dis.st0270.s20191.raptors.visitors;

import co.edu.eafit.dis.st0270.s20191.raptors.abs.LopriorRoot;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.And;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.Or;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.Cond;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.Bicond;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.ForAll;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.Exist;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.Negation;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.Predicate;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.Functor;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.Name;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.Variable;

public interface LopriorVisitor {
    public void visit(LopriorRoot loprior);
    public void visit(And and);
    public void visit(Or or);
    public void visit(Cond cond);
    public void visit(Bicond bicond);
    public void visit(ForAll forall);
    public void visit(Exist exist);
    public void visit(Negation negation);
    public void visit(Predicate predicate);
    public void visit(Functor functor);
    public void visit(Name name);
    public void visit(Variable var);

}
