package co.edu.eafit.dis.st0270.s20191.raptors.abs;

import co.edu.eafit.dis.st0270.s20191.raptors.visitors.VisitorFBF;

/**
 * 
 * 
 * @author Juan Francisco Cardona Mc'Cormick
 * 
 * Esta clase permite crear símbolo abstractos para una gramática
 *
 */
public abstract class ASTfbf {

	/**
	 * @parama visitor es una clase de tipo @see Visitor que permite.
	 */
    public abstract void accept(VisitorFBF visitor);
}
