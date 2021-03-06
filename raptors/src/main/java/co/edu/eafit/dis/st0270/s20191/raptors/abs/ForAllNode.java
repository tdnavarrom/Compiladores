package co.edu.eafit.dis.st0270.s20191.raptors.abs;

import co.edu.eafit.dis.st0270.s20191.raptors.visitors.VisitorFBF;

public class ForAllNode extends UnaryNode {

    private String var;

    public ForAllNode() {
    }

    public ForAllNode(String var, ASTfbf child) {
        this.var = var;
        super.setChild(child);
    }

    public void accept(VisitorFBF visitor) {
    	visitor.visit(this);
    }

    public String getOperator() {
    	return new String("∀");
    }
}