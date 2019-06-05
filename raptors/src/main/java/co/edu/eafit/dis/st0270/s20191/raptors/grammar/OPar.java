package co.edu.eafit.dis.st0270.s20191.raptors.grammar;

import co.edu.eafit.dis.st0270.s20191.raptors.tokens.AParToken;

public class OPar extends Terminal  {

    public int hashCode() {
	return GrammarSymbol.T_OPAR;
    }


    public boolean equals(Object obj) {
	boolean ret = false;
	if (obj instanceof OPar) {
	    ret = true;
	}
	else if (obj instanceof AParToken) {
	    ret = true;
	}
	return ret;
    }
}
