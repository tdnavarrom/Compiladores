package co.edu.eafit.dis.st0270.s20191.raptors.visitors;

import java.util.HashMap;

import co.edu.eafit.dis.st0270.s20191.raptors.abs.FunctorNode;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.NameNode;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.VariableNode;

public class TermEval implements VisitorTerm {


    private String res = "";

    private HashMap<String, String> nmap= new HashMap<String, String>();
    private HashMap<String, String> vmap= new HashMap<String, String>();
    private HashMap<String, String> fmap= new HashMap<String, String>();


    public void visit(NameNode name) {
        String str = name.getVar();
        String val = "a";
        if(nmap.containsValue(val) ==  false){
            nmap.put(str, val);
        }else{
            while(nmap.containsValue(val) != false){
                val += "''";
            }
            nmap.put(str, val);
        }

        name.setNewVar(val);

        res = val;
    }

    public void visit(VariableNode variable) {
        String str = variable.getVar();
        String val = "x";
        if(vmap.containsValue(val) ==  false){
            vmap.put(str, val);
        }else{
            while(vmap.containsValue(val) != false){
                val += "''";
            }
            vmap.put(str, val);
        }

        variable.setNewVar(val);

        res = val;
    }

    public void visit(FunctorNode functor) {
        String str = functor.getVar();
        String val = "f";
        if(fmap.containsValue(val) ==  false){
            fmap.put(str, val);
        }else{
            while(fmap.containsValue(val) != false){
                val += "''";
            }
            fmap.put(str, val);
        }

        TermEval te = new TermEval();

        functor.setNewVar(val);

        res = val + te.getRes(); 
    }

    public String getRes(){
        return res;
    }

    

}