
/**
 *
 * @author Englisch (e1125164), Lenz (e1126963), Schuster (e1025700)
 * @since December 2012
 *
 */
public class DoppelKeks extends Keks {
	private Fuellung fuellung;
	private Keks oben;  //theoretically you could add two models for upper and lower cookie on a double cookie
	private Keks unten; //but since it is not required in the specification we did not code this
	
	public DoppelKeks(Teigart teigart, Fuellung fuellung, Keks oben, Keks unten) {
		super(teigart);
		this.fuellung = fuellung;
		this.oben = oben;
		this.unten = unten;
	}
	
	public String toString() {
		return "Doppelkeks \n\tmit oben:  " + oben.toString()+ "\tmit unten: " +unten.toString()+ "\tund Fuellung: " +this.fuellung+ "\n";
	}

	@Override
	public Keks clone() {
		return new DoppelKeks(teigart, fuellung, oben.clone(), unten.clone());
		//returns identical copy of a double cookie
	}

}
