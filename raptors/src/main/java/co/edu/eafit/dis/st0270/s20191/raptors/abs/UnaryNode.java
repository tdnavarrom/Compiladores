package co.edu.eafit.dis.st0270.s20191.raptors.abs;

import co.edu.eafit.dis.st0270.s20191.raptors.visitors.VisitorFBF;

public class UnaryNode extends ASTfbf {

    private ASTfbf child;

    public UnaryNode() {
        this.child = null;
    }

    public UnaryNode(ASTfbf child) {
        this.child = child;
    }

    public ASTfbf getChild() {
        return child;
    }

    public void setChild(ASTfbf child2) {
        this.child = child2;
    }

    public void accept(VisitorFBF visitor) {
    	visitor.visit(this);
    }
}