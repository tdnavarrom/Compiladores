package co.edu.eafit.dis.st0270.s20191.raptors.abs;

import co.edu.eafit.dis.st0270.s20191.raptors.visitors.VisitorFBF;

public class CondNode extends BinaryNode {

    public CondNode() {
    }

    public CondNode(ASTfbf left, ASTfbf right) {
    	super(left,right);
    }

    public void accept(VisitorFBF visitor) {
    	visitor.visit(this);
    }

    public String getOperator() {
    	return new String("→");
    }
}
