package co.edu.eafit.dis.st0270.s20191.raptors.grammar;

import co.edu.eafit.dis.st0270.s20191.raptors.tokens.AndToken;

public class And extends Terminal  {

    public int hashCode() {
	return GrammarSymbol.T_AND;
    }

    public boolean equals(Object obj) {
	boolean ret = false;
	if (obj instanceof And) {
	    ret = true;
	}
	else if (obj instanceof AndToken) {
	    ret = true;
	}
	return ret;
    }
}
