package co.edu.eafit.dis.st0270.s20191.raptors.grammar;

public class GrammarSymbol {

    static int NT_LOPRIOR       = 1;
    static int NT_LOPRIORPRIME  = 2;
    static int NT_TERM       = 2;
    static int NT_TERMPRIME  = 3;
    static int NT_OPERSUM    = 4;
    static int NT_OPERMUL    = 5;
    static int T_ID          = 6;
    static int T_OPAR        = 7;
    static int T_CPAR        = 8;
    static int T_EXIST       = 9;
    static int T_NEGATION    = 10;
    static int T_FORALL      = 11;
    static int T_AND         = 12;
    static int T_OR          = 13;
    static int T_COND        = 14;
    static int T_BICOND      = 15;
    static int END_OF_STRING = 16;

    protected GrammarSymbol() {
    }
}
