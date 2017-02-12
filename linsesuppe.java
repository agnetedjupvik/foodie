import kitchen;

/*
 * Linsesuppe er en vegetarisk, billig og himla sunn middag. 
 * @author vebjorns && aggie
 */

public class LentilSoup{ 
  /* Ingredienser */
  Ingrediens linser = new RødeLinser(1, Enhet.HERMETIKKBOKS);
  Ingrediens løk = new Løk(1, Enhet.STK);
             løk.setState(chopped = true);
  Ingrediens hakkedeTomater = new Tomater(1, Enhet.HERMETIKKBOKS);
  Ingrediens kokosmelk = new Kokosmelk(1, Enhet.HERMETIKKBOKS);
  Ingrediens vann = new Vann(6, Enhet.DESILITER);
  Ingrediens buljong = new Grønnsaksbuljong(2, Enhet.TERNING);
  Ingrediens hvitløk = new Hvitløk(1, Enhet.FEDD);
             hvitløk.setState(chopped = true);
  Ingrediens chili = new Chili(1, Enhet.STK);
             chili.setState(chopped = true);
  
  Ingrediens krydder = new Collection<Krydder>("Salt", "Pepper", "Paprika", "Sukker");
  Ingrediens rapsolje = new Rapsolje(1. Enhet.DESILITER);
  
  /* How-to */
  public RoastedChickpeas(){
    linser.drain();
    
    Equipment stekepanne = new Equipment();
    Equipment kjele = new Kjele();
    
    stekepanne.brun(løk);
    stekepanne.addAll(Collection<Ingrediens>[hvitløk, chili]);
    
    kjele.add(vann);
    kjele.cook();
    kjele.add(buljong);
    kjele.add(linser);
    
    while (minutes < 25) {
      Thread.sleep(60000);
      minutes++; //la det koke i 20 minutter
      if (minutes == 20) {
        kjele.addAll(tomater, kokosmelk, krydder, løk, hvitløk, chili);
      }
    } 
    
    Equipment stavmikser = new Equipment();
    stavmikser.miks(kjele);
    
    if(!kjele.taste == "awesome"){
      kjele.add(krydder); //smak til etter behov
    } else {
      meal.done = true;
    }
    
    boolean enjoyMeal = true;
    
  }

}
