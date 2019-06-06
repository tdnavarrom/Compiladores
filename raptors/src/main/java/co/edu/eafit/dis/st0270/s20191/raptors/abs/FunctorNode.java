package co.edu.eafit.dis.st0270.s20191.raptors.abs;

import java.util.ArrayList;

import co.edu.eafit.dis.st0270.s20191.raptors.visitors.VisitorTerm;

public class FunctorNode extends ASTTerm {

    private String var; 
    private String newVar;
    public ArrayList<ASTTerm> listTerms;

    public FunctorNode() {
    }

    public FunctorNode(String var, ArrayList<ASTTerm> listTerms ) {
        this.var = var;
        this.listTerms = listTerms;
    }

    public void accept(VisitorTerm visitor) {
    	visitor.visit(this);
    }


    public String getVar() {
    	return var;
    }

	public void setNewVar(String val) {
        this.newVar = val;
	}

	public String getNewVar() {
		return newVar;
	}
}
