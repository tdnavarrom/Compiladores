package co.edu.eafit.dis.st0270.s20191.raptors.grammar;

public class OperSum extends NonTerminalSymbol {

    public int hashCode() {
	return GrammarSymbol.NT_OPERSUM;
    }

    public String toString() {
	return new String("OperSum");
    }

    public boolean equals(Object obj) {
	boolean ret = false;
	if (obj instanceof OperSum) {
	    ret = true;
	}
	return ret;
    }
}
