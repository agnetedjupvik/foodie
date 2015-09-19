import kitchen;

/*
 * Hjemmelaget tomatsuppe
 * @author aggiemcswaggie
 * @version 9001
 * Cirka 4 porsjoner
 */

public class TomatoSoup {

	/* Ingredienser */
	Ingrediens smør = new Smør(2, Enhet.SPISESKJE);
	Ingrediens hvetemel = new Hvetemel(3, Enhet.SPISESKJE);
	Ingrediens løk = new GulLøk();
	Ingrediens tomatpure = new Tomatpure(1, Enhet.BOKS);
	Ingrediens vann = new Vann(8, Enhet.DESILITER);
	Ingrediens tomater = new HakkedeTomater(1, Enhet.BOKS);
	ArrayList<Ingrediens> krydder = new ArrayList<Ingrediens>("timian", "salt", "pepper", "buljong");

	public TomatoSoup {

		Collection<Ingrediens> gryte = new Gryte();
		gryte.smelt(smør);
		gryte.add(løk);
		gryte.stek();
		gryte.addAll(Arrays.asList(tomatpure, mel));

		gryte.stir();
		gryte.add(vann);
		gryte.kokOppUnderRøring();

		gryte.addAll(Arrays.asList(tomater, krydder));
		Thread.sleep(480000); // la det koke i 8 minutter

		public boolean enjoyMeal = true;
	}
}
