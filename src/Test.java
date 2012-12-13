public class Test {
	
	public static void main(String []args) {
		
		RundKeks rundkeks = new RundKeks(Teigart.Muerbteig);
		MondKeks mondkeks = new MondKeks(Teigart.Zimtsternteig);
		WeihnachtsmannKeks wkeks = new WeihnachtsmannKeks(Teigart.Schokoladenteig);
		DoppelKeks doppelkeks = new DoppelKeks(Teigart.Zimtsternteig, Fuellung.Marmelade, rundkeks, rundkeks);
		
		System.out.print(doppelkeks);
		System.out.print(mondkeks);
		System.out.print(wkeks);
		
		MondKeksBackmaschine b = new MondKeksBackmaschine();
		b.setTeigart(Teigart.Muerbteig);
		Keks k = b.backe();
		System.out.print(k);
		DoppelKeksBackmaschine b2 = new DoppelKeksBackmaschine();
		b2.setVorlage(k);
		b2.setFuellung(Fuellung.Marmelade);
		k = b2.backe();
		System.out.print(k);
		
	}
	
}