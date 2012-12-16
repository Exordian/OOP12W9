import java.util.ArrayList;


/**
 *
 * @author Englisch (e1125164), Lenz (e1126963), Schuster (e1025700)
 * @since December 2012
 *
 */
public class Keksdose {
	
	private ArrayList<Keks> kekse;
	
	public Keksdose() {
		this.kekse = new ArrayList<Keks>();
	}
	
	public void addKeks(Keks keks) {
		kekse.add(keks);
	}
	
	public void inhalt() {
		for(Keks k : this.kekse) {
			System.out.print(k);
		}
	}
}
