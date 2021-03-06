
/**
 *
 * @author Englisch (e1125164), Lenz (e1126963), Schuster (e1025700)
 * @since December 2012
 *
 */
public class DoppelKeksBackmaschine extends Keksbackmaschine {
	private Keks vorlage;
	private Fuellung fuellung;
	
	public DoppelKeksBackmaschine() {
		this.vorlage = null;
		this.fuellung = null;
	}
	
	public void setVorlage(Keks keks) {
		this.vorlage = keks;
		//sets model for double cookie
	}
	
	public void setFuellung(Fuellung fuellung) {
		this.fuellung = fuellung;
		//sets filling of the double cookie
	}
	
	public Keks backe() {
		if(vorlage != null && fuellung != null) {
			this.setTeigart(vorlage.getTeigart());
			return new DoppelKeks(teigart, fuellung, vorlage.clone(), vorlage.clone());
		}
		return null;
		//returns null if keks does not have filling or model
		//			   else a new double cookie
	}
}
