
/**
 *
 * @author Englisch (e1125164), Lenz (e1126963), Schuster (e1025700)
 * @since December 2012
 *
 */
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
