package co.edu.eafit.dis.st0270.s20191.raptors.grammar;

public class Term extends NonTerminalSymbol {

    public int hashCode() {
	return GrammarSymbol.NT_TERM;
    }

    public String toString() {
	return new String("Term");
    }    

    public boolean equals(Object obj) {
	boolean ret = false;
	if (obj instanceof Term) {
	    ret = true;
	}
	return ret;
    }
}
