
/**
 *
 * @author Englisch (e1125164), Lenz (e1126963), Schuster (e1025700)
 * @since December 2012
 *
 */
public class Test {
	public static void main(String []args) {
		System.out.println("-------------------------------------------------- Einzelne Kekse");
		RundKeks rundkeks = new RundKeks(Teigart.Muerbteig);
		System.out.println(rundkeks);
		
		MondKeks mondkeks = new MondKeks(Teigart.Zimtsternteig);
		System.out.println(mondkeks);
		
		WeihnachtsmannKeks wkeks = new WeihnachtsmannKeks(Teigart.Schokoladenteig);
		System.out.println(wkeks);
		
		DoppelKeks doppelkeks = new DoppelKeks(Teigart.Zimtsternteig, Fuellung.Marmelade, rundkeks, rundkeks);
		System.out.println(doppelkeks);
		
		System.out.println("-------------------------------------------------- Backmaschinen");
		
		MondKeksBackmaschine mkb = new MondKeksBackmaschine();
		mkb.setTeigart(Teigart.Muerbteig);
		Keks k1 = mkb.backe();
		System.out.println(k1);
		
		RundKeksBackmaschine rkb = new RundKeksBackmaschine();
		rkb.setTeigart(Teigart.Schokoladenteig);
		Keks k2 = rkb.backe();
		System.out.println(k2);
		
		WeihnachtsmannKeksBackmaschine wkb = new WeihnachtsmannKeksBackmaschine();
		wkb.setTeigart(Teigart.Zimtsternteig);
		Keks k3 = wkb.backe();
		System.out.println(k3);
		
		DoppelKeksBackmaschine dkb = new DoppelKeksBackmaschine();
		dkb.setVorlage(k2);
		dkb.setFuellung(Fuellung.Marmelade);
		Keks k4 = dkb.backe();
		System.out.println(k4);
		
		dkb.setVorlage(k3);
		dkb.setFuellung(Fuellung.Schokolade);
		Keks k5 = dkb.backe();
		System.out.println(k5);
		
		System.out.println("-------------------------------------------------- Positionen");
		
		Position p1 = new Position(10, Teigart.Schokoladenteig, Form.Mond, Fuellung.Schokolade);
		Position p2 = new Position(15, Teigart.Zimtsternteig, Form.Mond, Fuellung.Marmelade);
		Position p3 = new Position(5, Teigart.Muerbteig, Form.Weihnachtsmann, null);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());		
		
		System.out.println("-------------------------------------------------- Bestellungen");
		
		Bestellung b1 = new Bestellung();
		b1.insert(p1);
		b1.insert(p2);
		System.out.println("Bestellung 1:");
		System.out.println(b1.drucke());
		System.out.println("\n---------------");
		
		Bestellung b2 = new Bestellung();
		b2.insert(p1);
		b2.insert(p2);
		b2.insert(p3);
		System.out.println("Bestellung 2:");
		System.out.println(b2.drucke());
		
		System.out.println("-------------------------------------------------- Keksdosen");
		
		Keksdose kd1 = new Keksdose();
		System.out.println("Keksdose 1 enthält:");
		kd1.addKeks(k1);
		kd1.addKeks(k3);
		kd1.addKeks(k4);
		System.out.println(kd1.inhalt());
		System.out.println("\n---------------");
		
		Keksdose kd2 = b1.getBestellung();
		System.out.println("Keksdose 2 (von Bestellung 1) enthält:");
		System.out.println(kd2.inhalt());
		System.out.println("\n---------------");
		
		Keksdose kd3 = b2.getBestellung();
		System.out.println("Keksdose 3 (von Bestellung 2) enthält:");
		System.out.println(kd3.inhalt());
	}
}