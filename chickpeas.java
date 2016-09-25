import kitchen;

/*
 * Lag ovnsbakte kikerter! Det er en litt sunnere erstatning for chips som snacks på fredagskvelden. I tillegg er det så billig at du vil nesten ikke tro det. 
 * @author aggie
 */

public class RoastedChickpeas{ 
  /* Ingredienser */
  Ingrediens kikerter = new Kikerter(1, Enhet.HERMETIKKBOKS);
  Ingrediens krydder = new Collection<Krydder>("Salt", "Pepper", "Paprika", "Spisskummen");
  
  /*How-to*/
  public RoastedChickpeas(){
    Equipment stekebrett = new Equipment();
    Equipment bakepapir = new Equipment();
    Equipment ovn = new Equipment(225, Enhet.GRADER);
    
    stekebrett.add(bakepapir);
    
    Bolle bolle = new Bolle();
    kikerter.remove("vann");
    kikerter.dry(); //bruk litt tørkepapir og tørk dem godt, da blir de mer crispy
    
    bolle.add(kikerter);
    bolle.add(krydder);
    bolle.mix();

    stekebrett.addAll(bolle);
    
    ovn.insert(stekebrett);
    while (minutes < 40) {
      Thread.sleep(60000);
      minutes++;
      if (minutes % 10 == 0){
        stekebrett.stir(); //snu litt på kikertene hvert 10. minutt
      }
    }
    
    if(kikerter.FARGE == "gyllen"){
      kikerter.done = true;
    }
    
    boolean enjoySnack = true;
    
  }

}
