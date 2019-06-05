package co.edu.eafit.dis.st0270.s20191.raptors.tokens;


public class OrToken extends OperatorToken {

    public OrToken() {
	super("∨",-1,-1);
    }

    public OrToken(String operator, int linea, int column) {
	super(operator, linea, column);
    }
    
    public boolean equals(Object obj) {
	boolean ret = false;
	if (obj instanceof OrToken) {
	    return true;
	}
	return ret;
    }

    public String toString() {
	String str = super.toString();
	return "∨ " + str;
    }

    public int hashCode() {
	return TokenInfo.OR_TOKEN;
    }
}
