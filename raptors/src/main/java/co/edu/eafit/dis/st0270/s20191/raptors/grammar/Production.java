package co.edu.eafit.dis.st0270.s20191.raptors.grammar;

public class Production {

    private NonTerminalSymbol nt = null;
    private GrammarSymbol[] prod = null;

    public Production(NonTerminalSymbol nt, GrammarSymbol[] prod) {
    	this.nt = nt;
    	this.prod = prod.clone();
    }

    public GrammarSymbol[] getProd() {
    	return (GrammarSymbol[]) prod.clone();
    }

    public GrammarSymbol[] getProdInv() {
    	GrammarSymbol[] res = new GrammarSymbol[prod.length];
    	for (int i = prod.length - 1, j = 0; i >= 0; i--,j++) {
    		res[j] = (GrammarSymbol) prod[i];
    	}
    	return res;
    }
/*
    public static Production Loprior1;
    public static Production LopriorPrime1;
    public static Production LopriorPrime2;
    public static Production Term1;
    public static Production TermPrime1;
    public static Production TermPrime2;
    public static Production OperSum1;
    public static Production OperSum2;
    public static Production OperMul1;
    public static Production OperMul2;

    static {
	GrammarSymbol[] tmp1 = { new Term(), new LopriorPrime() };
	Loprior1 = new Production(new Loprior(), tmp1);
	GrammarSymbol[] tmp2 = { new OperSum(), new Term(), new LopriorPrime() };
	LopriorPrime1 = new Production(new LopriorPrime(), tmp2);
	GrammarSymbol[]  tmp3 = {};
	LopriorPrime2 = new Production(new LopriorPrime(), tmp3);
	GrammarSymbol[] tmp4 = { new Factor(), new TermPrime() };
	Term1      = new Production(new Term(), tmp4);
	GrammarSymbol[] tmp5 = { new OperMul(), new Factor(), new TermPrime()};
	TermPrime1 = new Production(new TermPrime(), tmp5);
	GrammarSymbol[] tmp6 = {};
	TermPrime2 = new Production(new TermPrime(), tmp6);
	GrammarSymbol[] tmp7 = { new Id() };
	Factor1    = new Production(new Factor(), tmp7);
	GrammarSymbol[] tmp8 = { new Int() };
	Factor2    = new Production(new Factor(), tmp8);
	GrammarSymbol[] tmp9 = { new OPar(), new Loprior(), new CPar() };
	Factor3    = new Production(new Factor(), tmp9);
	GrammarSymbol[] tmp10 = { new And() };
	OperSum1   = new Production(new OperSum(), tmp10);
	GrammarSymbol[] tmp11 = { new Or() };
	OperSum2   = new Production(new OperSum(), tmp11);
	GrammarSymbol[] tmp12 = { new Bicond() };
	OperMul1   = new Production(new OperMul(), tmp12);
	GrammarSymbol[] tmp13 = { new Cond() };
	OperMul2   = new Production(new OperMul(), tmp13);
	}
	*/
} 
