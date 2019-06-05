package co.edu.eafit.dis.st0270.s20191.raptors.grammar;

import co.edu.eafit.dis.st0270.s20191.raptors.tokens.OrToken;

public class Or extends Terminal  {

    public int hashCode() {
	return GrammarSymbol.T_OR;
    }

    public boolean equals(Object obj) {
	boolean ret = false;
	if (obj instanceof Or) {
	    ret = true;
	}
	else if (obj instanceof OrToken) {
	    ret = true;
	}
	return ret;
    }
}
