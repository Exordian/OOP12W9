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
		//keks != null
		kekse.add(keks);
		//adds a cookie to the jar
	}
	
	public String inhalt() {
		String output = "";
		
		for(Keks k : this.kekse) {
			output += k;
		}
		
		return output;
		//Eine Methode inhalt für eine Keksdose, die Beschreibungen der in der Dose enthaltenen Kekse auf die Standardausgabe ausgibt.
	}
}
