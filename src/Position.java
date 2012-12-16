
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
	}
	
	public Teigart getTeigart() {
		return this.teigart;
	}
	
	public Form getForm() {
		return this.form;
	}
	
	public Fuellung getFuellung() {
		return this.fuellung;
	}
	
	public String toString() {
		StringBuffer buf = new StringBuffer();
		buf.append("Anzahl:\t"+  anzahl  +"\n");
		buf.append("Teigart:\t"+ teigart +"\n");
		buf.append("Form:\t"+    form    +"\n");
		if(this.fuellung != null)
			buf.append("Fuellung:\t"+fuellung+"\n");
		return buf.toString();
	}
}
