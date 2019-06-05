package co.edu.eafit.dis.st0270.s20191.raptors.abs;

import co.edu.eafit.dis.st0270.s20191.raptors.visitors.LopriorVisitor;

public abstract class LopriorNode 
    extends Loprior {

    private Loprior left;
    private Loprior right;

    public LopriorNode() {
    	this.left = null;
    	this.right = null;
    }

    public LopriorNode(Loprior left, Loprior right) {
    	this.left  = left;
    	this.right = right;
    }

    public Loprior getLeftChild() {
    	return left;
    }

    public Loprior getRightChild() {
    	return right;
    }

    public void setLeftChild(Loprior left) {
    	this.left = left;
    }

    public void setRightChild(Loprior right) {
    	this.right = right;
    }

    public abstract String getOperator();
    
    public abstract void  accept(LopriorVisitor visitor);
}
