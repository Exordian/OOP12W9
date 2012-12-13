import java.util.ArrayList;


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
