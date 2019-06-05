package co.edu.eafit.dis.st0270.s20191.raptors.tokens;

public class SeparatorToken extends Token {

    private String separator;

    public SeparatorToken(String separator, int linea, int column) {
	super(linea, column);
	this.separator = new String(separator);
    }

    public String toString() {
	return "Separator: " + separator + " " + super.toString();
    }
}
