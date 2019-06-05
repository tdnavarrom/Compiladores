package co.edu.eafit.dis.st0270.s20191.raptors.grammar;

public class LopriorPrime extends NonTerminalSymbol {

    public int hashCode() {
	return GrammarSymbol.NT_LOPRIORPRIME;
    }

    public String toString() {
	return new String("Loprior'");
    }

    public boolean equals(Object obj) {
	boolean ret = false;
	if (obj instanceof LopriorPrime) {
	    ret = true;
	}
	return ret;
    }
}
