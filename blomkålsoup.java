import kitchen;

/*
 * Hva sier mer høst enn en god, varm suppe?
 * I tillegg til at det er skikkelig godt, koster det ikke skjorta heller!
 * @author andreabach && aggiemcswaggie
 */

public class BlomkålSuppe{
  /* Ingredienser */
  Ingrediens blomkål = new Blomkål(1, Enhet.STK);
  Ingrediens løk = new Løk(1, Enhet.STK);
  Ingrediens kyllingkraft = new Kyllingkraft(8, Enhet.DL);
  Ingrediens melk = new Melk(2, Enhet.DL);
  Ingrediens bacon = new Bacon(150, Enhet.GRAM);
  
  ArrayList<Ingrediens> spices = new ArrayList<Ingrediens>("Salt", "Pepper");
  
  /* How-to */
  public BlomkålSuppe(){
    while(blomkål.size < (5, Enhet.CM) && løk.size < (1, Enhet.CM)){ // del den renskede blomkålen i jevnstore buketter
      blomkål = blomkål / 2 
      løk = løk / 2
    }
    
    // Valgfritt: Hold av noen blomkålbiter til garnityr
    
    Equipment gryte = new Equipment();
    Equipment stavmikser = new Equipment();
    
    gryte.addAll(new ArrayList<Ingrediens>(kyllingkraft, melk, blomkål, løk);
                 
    while(int minutesCooked < 15);
      Thread.sleep(60000);
      minutesCooked++;
    
    stavmikser.mix(gryte);
                 
    for (spice : spices) {
      gryte.add(spice);
      gryte.smak();
    }
                 
    Equpiment stekepanne = new Equipment();
    stekepanne.fry(bacon);
    
    boolean enjoyMeal = true;
  } 
}
