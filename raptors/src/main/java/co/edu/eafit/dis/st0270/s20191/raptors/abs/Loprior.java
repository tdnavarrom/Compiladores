package co.edu.eafit.dis.st0270.s20191.raptors.abs;

import co.edu.eafit.dis.st0270.s20191.raptors.visitors.VisitorFBF;

public class Loprior extends UnaryNode {

    public Loprior(ASTfbf asTfbf){
         super.setChild(asTfbf);
    }

    public void accept(VisitorFBF visitor) {
    	visitor.visit(this);
    }

}
