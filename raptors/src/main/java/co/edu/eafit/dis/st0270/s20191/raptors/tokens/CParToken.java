package co.edu.eafit.dis.st0270.s20191.raptors.tokens;

public class CParToken extends AssociationToken {

    public CParToken() {
	super(")", -1, -1);
    }

    public CParToken(int linea, int column) {
	super(")", linea, column);
    }

    public boolean equals(Object obj) {
	boolean ret = false;
	if (obj instanceof CParToken) {
	    return true;
	}
	return ret;
    }

    public int hashCode() {
	return TokenInfo.CPAR_TOKEN;
    }

}
