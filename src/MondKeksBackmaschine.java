
/**
 *
 * @author Englisch (e1125164), Lenz (e1126963), Schuster (e1025700)
 * @since December 2012
 *
 */
public class MondKeksBackmaschine extends Keksbackmaschine {
	public Keks backe() {
		return new MondKeks(teigart);
		//bakes the moon cookie
	}
}
