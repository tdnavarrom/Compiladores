package co.edu.eafit.dis.st0270.s20191.raptors.visitors;

import co.edu.eafit.dis.st0270.s20191.raptors.abs.Loprior;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.LopriorRoot;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.Name;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.Negation;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.LopriorNode;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.And;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.Or;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.Predicate;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.Variable;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.Cond;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.Exist;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.ForAll;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.Functor;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.Bicond;

public class LopriorNotPolaca implements LopriorVisitor {

	private StringBuffer notPolaca = null;

	public LopriorNotPolaca() {
		notPolaca = new StringBuffer();
	}

	public StringBuffer getNotPolaca() {
		return notPolaca;
	}

	private StringBuffer getLeftResult(LopriorNode loprior) {

		Loprior left = loprior.getLeftChild();
		LopriorNotPolaca calleft = new LopriorNotPolaca();

		left.accept(calleft);

		return calleft.getNotPolaca();
	}

	private StringBuffer getRightResult(LopriorNode loprior) {

		Loprior right = loprior.getRightChild();
		LopriorNotPolaca calright = new LopriorNotPolaca();

		right.accept(calright);

		return calright.getNotPolaca();
	}

	public void visit(Loprior loprior) {
	}

	public void visit(LopriorRoot root) {

		Loprior loprior = root.getloprior();
		LopriorNotPolaca enp = new LopriorNotPolaca();
		enp.visit(loprior);
		this.notPolaca.append(enp.getNotPolaca());
	}

	public void visit(And and) {

		notPolaca.append("∧").append(' ').append(getLeftResult(and)).append(' ').append(getRightResult(and));
	}

	public void visit(Or or) {

		notPolaca.append("∨").append(' ').append(getLeftResult(or)).append(' ').append(getRightResult(or));
	}

	public void visit(Cond cond) {

		notPolaca.append("→").append(' ').append(getLeftResult(cond)).append(' ').append(getRightResult(cond));
	}

	public void visit(Bicond bicond) {

		notPolaca.append("↔").append(' ').append(getLeftResult(bicond)).append(' ').append(getRightResult(bicond));
	}

	public void visit(Variable var) {
		notPolaca.append(var.toString());
	}

	public void visit(Name name) {
		notPolaca.append(name.toString());
	}

	public void visit(Functor functor) {
		notPolaca.append(functor.toString());
	}

	public void visit(Predicate predicate) {
		notPolaca.append(predicate.toString());
	}

	public void visit(ForAll forall) {
		notPolaca.append("∀").append(' ').append(getRightResult(forall));
	}

	public void visit(Exist exist) {
		notPolaca.append("∃").append(' ').append(getRightResult(exist));
	}

	public void visit(Negation negation) {
		notPolaca.append("¬").append(' ').append(getRightResult(negation));
	}
}
