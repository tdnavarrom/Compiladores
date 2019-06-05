package co.edu.eafit.dis.st0270.s20191.raptors.visitors;

import co.edu.eafit.dis.st0270.s20191.raptors.abs.AbsSyn;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.OpBin;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.OpUn;

public interface Visitor {
    public void visit(AbsSyn abssyn);

}
