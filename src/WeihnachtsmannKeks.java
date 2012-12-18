
/**
 *
 * @author Englisch (e1125164), Lenz (e1126963), Schuster (e1025700)
 * @since December 2012
 *
 */
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
		//returns identical copy of a santa cookie
	}
}
