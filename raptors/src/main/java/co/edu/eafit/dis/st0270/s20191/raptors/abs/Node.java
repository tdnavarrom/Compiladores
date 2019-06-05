package co.edu.eafit.dis.st0270.s20191.raptors.abs;

public abstract class Node extends AbsSyn {
    
    private AbsSyn left;
    private AbsSyn right;

    public Node() {
    	this.left  = null;
    	this.right = null;
    }
    
    public Node(AbsSyn left, AbsSyn right) {
    	this.left  = left;
    	this.right = right;
    }
    
    public AbsSyn getLeftChild() {
    	return this.left;
    }

    public AbsSyn getRightChild() {
    	return this.right;
    }
    
    public void setLeftChild(AbsSyn left) {
    	this.left = left;
    }
    
    public void setRightChild(AbsSyn right) {
    	this.right = right;
    }
}
