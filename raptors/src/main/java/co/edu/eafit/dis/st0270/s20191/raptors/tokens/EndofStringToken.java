package co.edu.eafit.dis.st0270.s20191.raptors.tokens;


public class EndofStringToken extends Token {

    public EndofStringToken() {
	super(-1,-1);
    }

    public boolean equals(Object obj) {
	boolean ret = false;
	if (obj instanceof EndofStringToken) {
	    return true;
	}
	return ret;
    }

    public int hashCode() {
	return TokenInfo.ENDOFSTRING_TOKEN;
    }

}
