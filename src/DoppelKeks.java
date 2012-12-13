
public class DoppelKeks extends Keks {
	
	private Fuellung fuellung;
	private Keks oben;
	private Keks unten;
	
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
	}

}
