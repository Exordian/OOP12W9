
/**
 *
 * @author Englisch (e1125164), Lenz (e1126963), Schuster (e1025700)
 * @since December 2012
 *
 */
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
