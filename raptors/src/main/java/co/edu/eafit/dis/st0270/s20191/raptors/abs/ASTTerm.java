package co.edu.eafit.dis.st0270.s20191.raptors.abs;

import co.edu.eafit.dis.st0270.s20191.raptors.visitors.VisitorTerm;

public abstract class ASTTerm {
    
    public abstract void accept(VisitorTerm visitor);

}
