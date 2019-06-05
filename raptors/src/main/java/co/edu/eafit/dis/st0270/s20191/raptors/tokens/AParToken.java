package co.edu.eafit.dis.st0270.s20191.raptors.tokens;


public class AParToken extends AssociationToken {

    public AParToken() {
	super("(", -1,-1);
    }

    public AParToken(int linea, int column) {
	super("(", linea, column);
    }
    
    public boolean equals(Object obj) {
	boolean ret = false;
	if (obj instanceof AParToken) {
	    return true;
	}
	return ret;
    }

    public int hashCode() {
	return TokenInfo.APAR_TOKEN;
    }

}
