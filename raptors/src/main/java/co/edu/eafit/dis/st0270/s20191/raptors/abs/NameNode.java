package co.edu.eafit.dis.st0270.s20191.raptors.abs;

import co.edu.eafit.dis.st0270.s20191.raptors.visitors.VisitorTerm;

public class NameNode extends ASTTerm {

    private String var; 
    private String newVar;

    public NameNode() {
    }

    public NameNode(String var) {
    	this.var = var;
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

	public Object getNewVar() {
		return newVar;
	}
}
