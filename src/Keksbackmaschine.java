
/**
 *
 * @author Englisch (e1125164), Lenz (e1126963), Schuster (e1025700)
 * @since December 2012
 *
 */
public abstract class Keksbackmaschine {
	protected Teigart teigart;
	
	public void setTeigart(Teigart teigart) {
		this.teigart = teigart;
		//sets the cookie dough
	}
	
	public abstract Keks backe(); //teigart has already been set
}
