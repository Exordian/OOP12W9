
public abstract class Keksbackmaschine {
	
	protected Teigart teigart;
	
	public void setTeigart(Teigart teigart) {
		this.teigart = teigart;
	}
	
	public abstract Keks backe(); //teigart has already been set

}
