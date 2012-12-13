
public class MondKeks extends Keks {
	
	public MondKeks(Teigart teigart) {
		super(teigart);
	}
	
	public String toString() {
		return "Mondkeks mit Teigart " +this.teigart+ "\n";
	}

	@Override
	public Keks clone() {
		return new MondKeks(teigart);
	}

}
