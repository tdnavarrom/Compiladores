package co.edu.eafit.dis.st0270.s20191.raptors.visitors;

import java.util.HashMap;

import co.edu.eafit.dis.st0270.s20191.raptors.abs.ASTfbf;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.AndNode;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.BicondNode;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.BinaryNode;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.CondNode;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.ExistNode;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.ForAllNode;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.Loprior;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.NegationNode;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.OrNode;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.PredicateNode;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.UnaryNode;

public class LopriorPrint implements VisitorFBF {

    private String res = "";
    private UnaryNode loprior;
    private HashMap<String, String> pmap= new HashMap<String, String>();

    public LopriorPrint() {
    }

    public String getResult() {
        return res;
    }

    private String getLeftResult(BinaryNode ASTfbf) {

        ASTfbf left = ASTfbf.getLeftChild();
        LopriorPrint calleft = new LopriorPrint();

        left.accept(calleft);

        return calleft.getResult();
    }

    private String getRightResult(BinaryNode ASTfbf) {

        ASTfbf right = ASTfbf.getRightChild();
        LopriorPrint calright = new LopriorPrint();

        right.accept(calright);

        return calright.getResult();
    }

    private String getUnaryResult(UnaryNode loprior) {

        this.loprior = loprior;
        ASTfbf right = loprior.getChild();
        LopriorPrint calright = new LopriorPrint();

        right.accept(calright);

        return calright.getResult();
    }


    public void visit(Loprior loprior) {
    }


    public void visit(AndNode and) {

        res = "( " + getLeftResult(and) + " ∧ " + getRightResult(and) + " )";
    }

    public void visit(OrNode or) {

        res = "(" + getLeftResult(or) + " ∨ " + getRightResult(or) + " )";
    }

    public void visit(CondNode cond) {

        res = "( " + getLeftResult(cond) + " → " + getRightResult(cond) + " )";
    }

    public void visit(BicondNode bicond) {

        res = "( " + getLeftResult(bicond) + " ↔ " + getRightResult(bicond) + " )";
    }

    public void visit(PredicateNode predicate) {

        String str = predicate.getVar();
        String val = "P";
        if(pmap.containsValue(val) ==  false){
            pmap.put(str, val);
        }else{
            while(pmap.containsValue(val) != false){
                val += "*";
            }
            pmap.put(str, val);
        }

        predicate.setNewVar(val);

        TermEval te = new TermEval();

        res = predicate.getNewVar() + te.getRes();
    }

    public void visit(ForAllNode forall) {
        res ="∀ " + getUnaryResult(forall);
    }

    public void visit(ExistNode exist) {
        res ="∃ " + getUnaryResult(exist);
    }

    public void visit(NegationNode negation) {
        res = "¬ " + getUnaryResult(negation);
    }

    public void visit(UnaryNode unaryNode) {

    }

    public void visit(BinaryNode binaryNode) {

    }

}