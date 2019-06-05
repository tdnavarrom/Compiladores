package co.edu.eafit.dis.st0270.s20191.raptors.grammar;

import co.edu.eafit.dis.st0270.s20191.raptors.tokens.BicondToken;

public class Bicond extends Terminal  {

    public int hashCode() {
	return GrammarSymbol.T_BICOND;
    }

    public boolean equals(Object obj) {
	boolean ret = false;
	if (obj instanceof Bicond) {
	    ret = true;
	}
	else if (obj instanceof BicondToken) {
	    ret = true;
	}
	return ret;
    }
}
