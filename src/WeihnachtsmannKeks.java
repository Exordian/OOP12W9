
public class WeihnachtsmannKeks extends Keks {
	
	public WeihnachtsmannKeks(Teigart teigart) {
		super(teigart);
	}
	
	public String toString() {
		return "Weihnachtsmannkeks mit Teigart " +this.teigart+ "\n";
	}

	@Override
	public Keks clone() {
		return new WeihnachtsmannKeks(teigart);
	}

}
