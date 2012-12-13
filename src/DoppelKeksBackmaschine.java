
public class DoppelKeksBackmaschine extends Keksbackmaschine {
	
	private Keks vorlage;
	private Fuellung fuellung;
	
	public DoppelKeksBackmaschine() {
		this.vorlage = null;
		this.fuellung = null;
	}
	
	public void setVorlage(Keks keks) {
		this.vorlage = keks;
	}
	
	public void setFuellung(Fuellung fuellung) {
		this.fuellung = fuellung;
	}
	
	public Keks backe() {
		if(vorlage != null && fuellung != null) {
			this.setTeigart(vorlage.getTeigart());
			return new DoppelKeks(teigart, fuellung, vorlage.clone(), vorlage.clone());
		}
		return null;
	}

}
