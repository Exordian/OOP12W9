
/**
 *
 * @author Englisch (e1125164), Lenz (e1126963), Schuster (e1025700)
 * @since December 2012
 *
 */
public class Position {
	private int anzahl;
	private Teigart teigart;
	private Form form;
	private Fuellung fuellung;
	
	public Position(int anzahl, Teigart teigart, Form form, Fuellung fuellung) {
		this.anzahl = anzahl;
		this.teigart = teigart;
		this.form = form;
		this.fuellung = fuellung;
	}
	
	public int getAnzahl() {
		return this.anzahl;
		//returns the number of cookies on this position
	}
	
	public Teigart getTeigart() {
		return this.teigart;
		//returns the dough of the cookie on this position
	}
	
	public Form getForm() {
		return this.form;
		//returns the model of the cookies on this position
	}
	
	public Fuellung getFuellung() {
		return this.fuellung;
		//returns the filling of the cookies on this position
	}
	
	public String toString() {
		String output = "Anzahl: " + anzahl + "\n" + "Teigart: " + teigart + "\n" + "Form: " + form + "\n";
		if(this.fuellung != null) {
			output += "Fuellung: " + fuellung + "\n";
		} else {
			output += "keine Fuellung\n";
		}
		return output;
		//returns the position with all the details
	}
}
