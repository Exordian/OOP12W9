import java.util.ArrayList;


/**
 *
 * @author Englisch (e1125164), Lenz (e1126963), Schuster (e1025700)
 * @since December 2012
 *
 */
public class Bestellung {
	private ArrayList<Position> positionen;
	
	public Bestellung() {
		positionen = new ArrayList<Position>();
	}
	
	public void insert(Position pos) {
		positionen.add(pos);
		//adds a position to the arrayList
	}
	
	public String drucke() {
		String output = "";
		for(Position pos : this.positionen) {
			output += pos + "\n";
		}
		return output;
		//Eine Methode drucke für eine Bestellung, die alle Positionen in der Standardausgabe auflistet.
	}
	
	public Keksdose getBestellung() {
		Keksdose keksdose = new Keksdose();
		// another way of solving this would be reflection, and dynamically load <Kekstype>backmachine
		// but then we would loose type safety
		for(Position p : positionen) {
			Keks k = null;
			Keksbackmaschine b = null;
			switch (p.getForm()) {
			case Mond:
				b = new MondKeksBackmaschine();
				break;
			case Rund:
				b = new RundKeksBackmaschine();
				break;
			case Weihnachtsmann:
				b = new WeihnachtsmannKeksBackmaschine();
				break;
			default:
				break;
			}
			if(b == null)
				continue;
			
			b.setTeigart(p.getTeigart());
			k = b.backe();
			
			if(p.getFuellung() != null) {
				DoppelKeksBackmaschine db = new DoppelKeksBackmaschine();
				db.setVorlage(k);
				db.setFuellung(p.getFuellung());
				k = db.backe();
			}
			keksdose.addKeks(k);
		}
		return keksdose;
		//returns a jar full of freshly baked cookies, yay!
	}
}
