package co.edu.eafit.dis.st0270.s20191.raptors.abs;

import co.edu.eafit.dis.st0270.s20191.raptors.visitors.LopriorVisitor;

public class Cond extends LopriorNode {

    public Cond() {
    }

    public Cond(Loprior left, Loprior right) {
    	super(left,right);
    }

    public void accept(LopriorVisitor visitor) {
    	visitor.visit(this);
    }

    public String getOperator() {
    	return new String("→");
    }
}
