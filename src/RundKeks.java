
/**
 *
 * @author Englisch (e1125164), Lenz (e1126963), Schuster (e1025700)
 * @since December 2012
 *
 */
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
		//returns identical copy of a round cookie
	}
}
