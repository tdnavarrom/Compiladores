package co.edu.eafit.dis.st0270.s20191.raptors.abs;

import co.edu.eafit.dis.st0270.s20191.raptors.visitors.LopriorVisitor;

public class LopriorRoot extends Loprior {

    private Loprior root; 

    public LopriorRoot() {
    }

    public LopriorRoot(Loprior root) {
    	this.root = root;
    }

    public void accept(LopriorVisitor visitor) {
    	visitor.visit(this);
    }

    public Loprior getloprior() {
    	return root;
    }
}
