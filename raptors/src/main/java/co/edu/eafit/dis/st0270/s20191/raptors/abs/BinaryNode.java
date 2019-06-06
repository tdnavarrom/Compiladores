package co.edu.eafit.dis.st0270.s20191.raptors.abs;

import co.edu.eafit.dis.st0270.s20191.raptors.visitors.VisitorFBF;

public class BinaryNode extends ASTfbf {

    private ASTfbf left;
    private ASTfbf right;

	public BinaryNode() {
        this.left = null;
        this.right = null;
    }

    public BinaryNode(ASTfbf left, ASTfbf right) {
        this.left = left;
        this.right = right;
    }

    public ASTfbf getLeftChild() {
        return left;
    }

    public ASTfbf getRightChild() {
        return right;
    }

    public void setLeftChild(ASTfbf left) {
        this.left = left;
    }

    public void setRightChild(ASTfbf right) {
        this.right = right;
    }

    public void accept(VisitorFBF visitor) {
        visitor.visit(this);
    }


}
