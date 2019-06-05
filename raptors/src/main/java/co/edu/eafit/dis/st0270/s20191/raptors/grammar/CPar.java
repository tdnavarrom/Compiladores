package co.edu.eafit.dis.st0270.s20191.raptors.grammar;

import co.edu.eafit.dis.st0270.s20191.raptors.tokens.CParToken;

public class CPar extends Terminal  {

    public int hashCode() {
	return GrammarSymbol.T_CPAR;
    }

    public boolean equals(Object obj) {
	boolean ret = false;
	if (obj instanceof CPar) {
	    ret = true;
	}
	else if (obj instanceof CParToken) {
	    ret = true;
	}
	return ret;
    }
}
