package co.edu.eafit.dis.st0270.s20191.raptors.tokens;


public class CondToken extends OperatorToken {

    public CondToken() {
	super("→",-1,-1);
    }

    public CondToken(String operator, int linea, int column) {
	super(operator, linea, column);
    }

    public boolean equals(Object obj) {
	boolean ret = false;
	if (obj instanceof CondToken) {
	    return true;
	}
	return ret;
    }
    
    public String toString() {
	String str = super.toString();
	return "→ " + str;
    }

    public int hashCode() {
	return TokenInfo.COND_TOKEN;
    }
}
