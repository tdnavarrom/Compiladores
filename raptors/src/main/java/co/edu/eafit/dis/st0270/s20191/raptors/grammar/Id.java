package co.edu.eafit.dis.st0270.s20191.raptors.grammar;

import co.edu.eafit.dis.st0270.s20191.raptors.tokens.IdentifierToken;

public class Id extends Terminal  {

    public int hashCode() {
	return GrammarSymbol.T_ID;
    }

    public boolean equals(Object obj) {
	boolean ret = false;
	if (obj instanceof Id) {
	    ret = true;
	}
	else if (obj instanceof IdentifierToken) {
	    ret = true;
	}
	return ret;
    }
}
