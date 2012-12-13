
public abstract class Keks {
	
	protected Teigart teigart;
	
	public Keks(Teigart teigart) {
		this.teigart = teigart;
	}
	
	public Teigart getTeigart() {
		return this.teigart;
	}
	
	public abstract Keks clone();
	
}
