package co.edu.eafit.dis.st0270.s20191.raptors.abs;

import java.util.ArrayList;
import co.edu.eafit.dis.st0270.s20191.raptors.visitors.VisitorFBF;

public class PredicateNode extends ASTfbf {

    private String var; 
    private String newVar;
    public ArrayList<ASTTerm> listTerms;

    public PredicateNode() {
    }

    public PredicateNode(String var, ArrayList<ASTTerm> listTerms) {
        this.var = var;
        this.listTerms = listTerms;
    }

    public void accept(VisitorFBF visitor) {
    	visitor.visit(this);
    }

    public void setNewVar(String newVar){
        this.newVar = newVar;
    }

    public String getNewVar(){
        return newVar;
    }

    public String getVar() {
    	return var;
    }
}
