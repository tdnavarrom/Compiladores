package co.edu.eafit.dis.st0270.s20191.raptors.tokens;

public class OperatorToken extends Token {

    private String operator;

    public OperatorToken(String operator, int linea, int column) {
	super(linea, column);
	this.operator = new String(operator);
    }

    public String getOperator() {
	return new String(operator);
    }

    public String toString() {
	return "Operator: " + operator + " " + super.toString();
    }

    public boolean equals(Object obj) {
	if (obj instanceof OperatorToken) {
	    if (this.operator == ((OperatorToken) obj).getOperator())
		return true;
	    else 
		return false;
	}
	else return false;
    }
}
