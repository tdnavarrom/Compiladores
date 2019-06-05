package co.edu.eafit.dis.st0270.s20191.raptors.grammar;

public class Loprior extends NonTerminalSymbol {

    public int hashCode() {
    	return GrammarSymbol.NT_LOPRIOR;
    }

    public String toString() {
    	return new String("Loprior");
    }

    public boolean equals(Object obj) {
    	boolean ret = false;
    	if (obj instanceof Loprior) {
    		ret = true;
    	}
    	return ret;
    }
}
