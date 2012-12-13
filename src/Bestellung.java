import java.util.ArrayList;


public class Bestellung {
	
	private ArrayList<Position> positionen;
	
	public Bestellung() {
		positionen = new ArrayList<Position>();
	}
	
	public void insert(Position pos) {
		positionen.add(pos);
	}
	
	public void drucke() {
		for(Position pos : this.positionen) {
			System.out.println(pos);
		}
	}
	
	public Keksdose getBestellung() {
		Keksdose keksdose = new Keksdose();
		
	//TODO: Bestellung
		return keksdose;
	}

}
