
public class RundKeks extends Keks {
	
	public RundKeks(Teigart teigart) {
		super(teigart);
	}
	
	public String toString() {
		return "Rundkeks mit Teigart " +this.teigart+ "\n";
	}

	@Override
	public Keks clone() {
		return new RundKeks(teigart);
	}
	
}
