import java.util.Collection;
import kitchen;
/*
 * Cookies à la Agnete
 * @author aggiemcswaggie && vemundsanti
 * @version 9001
 * Disse cookiene kommer til å gjøre deg til den mest populære på hele Onlinekontoret.
 * Gir cirka 30 cookies
 */
public class Cookies {
	
	int romtemperatur = 22;

	/** Ingredienser for cookies*/
	Ingrediens hvetemel = new Hvetemel(450, Enhet.GRAM);
	Ingrediens bakepulver = new Bakepulver(2, Enhet.TESKJE);
	Ingrediens natron = new Natron(2, Enhet.TESKJE);
	Ingrediens havsalt = new Havsalt(1, Enhet.KLYPE);
	Ingrediens smør = new Smør(280, Enhet.GRAM);
			smør.temperatur = romtemperatur;
	Ingrediens bruntSukker = new Sukker("Brunt", 170, Enhet.GRAM);
	Ingrediens hvittSukker = new Sukker("Hvitt", 220, Enhet.GRAM);
	Ingrediens egg = new Egg(1, Enhet.STYKK);
	Ingrediens vaniljestang = new Vaniljestang(1, Enhet.STYKK);
	Ingrediens sjokolade = new Sjokolade("Mørk", 500, Enhet.GRAM);
	
	public Cookies(){
		//Dag 1
		Collection<Ingrediens> bolle1 = new Bolle();
		bolle1.addAll(Arrays.asList(mel, bakepulver, natron, salt));
		
		sjokolade.grovhakk();
		
		Collection<Ingrediens> bolle2 = new Bolle();
		bolle2.addAll(Arrays.asList(smør, bruntSukker, hvittSukker));
		bolle2.visp();
		bolle2.add(egg);
		bolle2.addAll(bolle1);
		bolle2.cover("Plastfolie");
		bolle2.place("Kjøleskap");
		
		Thread.sleep(86400000L); //La deigen ligge i kjøleskap i et døgn.
		
		//Dag 2
		Ovn ovn = new Ovn(175, Enhet.GRADER);
		bolle2.removeCover("Plastfolie");
		Deig cookieDough = new Deig(bolle2);
		cookieDough.lagBaller(Enhet.GOLFBALLER);
		if(cookieDough.eserIOvnen()){System.out.println("Deigen hever alltid.");}
		else{System.out.println("Dette må du ta høyde for.");}
		
		Stekebrett[][] brett = new Stekebrett[3][3];
		for(int i = 0; i < brett.length; i++){
			for(int j = 0; j < brett; j++){
				brett[i][j].add(cookieDough);
				havsalt.sprinkle(brett[i][j]);
			}
		}
		brett.stek(15, Enhet.MINUTTER);
		boolean enjoyMeal = true;
	}
}
