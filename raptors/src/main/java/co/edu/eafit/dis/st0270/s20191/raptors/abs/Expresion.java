package co.edu.eafit.dis.st0270.s20191.raptors.abs;

import co.edu.eafit.dis.st0270.s20191.raptors.visitors.Visitor;

public class Expresion extends Node {

    private AbsSyn loprior;

    public Expresion(AbsSyn loprior) {
    	this.loprior = loprior;
    }

    public AbsSyn getloprior() {
    	return loprior;
    }

    public void accept(Visitor v) {
    }
}
