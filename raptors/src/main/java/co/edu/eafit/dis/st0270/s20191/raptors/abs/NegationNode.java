package co.edu.eafit.dis.st0270.s20191.raptors.abs;

import co.edu.eafit.dis.st0270.s20191.raptors.visitors.VisitorFBF;

public class NegationNode extends UnaryNode {

    public NegationNode() {
    }

    public NegationNode(ASTfbf child) {
    	super.setChild(child);
    }

    public void accept(VisitorFBF visitor) {
    	visitor.visit(this);
    }

    public String getOperator() {
    	return new String("¬");
    }
}