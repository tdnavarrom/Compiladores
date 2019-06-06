package co.edu.eafit.dis.st0270.s20191.raptors.visitors;

import co.edu.eafit.dis.st0270.s20191.raptors.abs.AndNode;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.OrNode;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.CondNode;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.BicondNode;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.BinaryNode;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.ForAllNode;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.Loprior;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.ExistNode;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.NegationNode;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.PredicateNode;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.UnaryNode;

public interface VisitorFBF {
    public void visit(UnaryNode unaryNode);
    public void visit(BinaryNode binaryNode);
    public void visit(AndNode and);
    public void visit(OrNode or);
    public void visit(Loprior loprior);
    public void visit(CondNode cond);
    public void visit(BicondNode bicond);
    public void visit(ForAllNode forall);
    public void visit(ExistNode exist);
    public void visit(NegationNode negation);
    public void visit(PredicateNode predicate);

}
