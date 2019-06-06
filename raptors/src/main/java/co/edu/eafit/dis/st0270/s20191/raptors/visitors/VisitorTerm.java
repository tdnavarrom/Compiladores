package co.edu.eafit.dis.st0270.s20191.raptors.visitors;

import co.edu.eafit.dis.st0270.s20191.raptors.abs.FunctorNode;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.NameNode;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.VariableNode;

public interface VisitorTerm {
    public void visit(NameNode name);
    public void visit(VariableNode variable);
    public void visit(FunctorNode functor);
}
