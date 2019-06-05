package co.edu.eafit.dis.st0270.s20191.raptors.grammar;

public class OperMul extends NonTerminalSymbol {

    public int hashCode() {
	return GrammarSymbol.NT_OPERMUL;
    }

    public String toString() {
	return new String("OperMul");
    }

    public boolean equals(Object obj) {
	boolean ret = false;
	if (obj instanceof OperMul) {
	    ret = true;
	}
	return ret;
    }

}
