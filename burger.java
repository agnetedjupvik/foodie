import kitchen;

/*
 * Når du ser at det er akkurat litt for lenge til stipendet kommer,
 * eller du bare har lyst til å kjøre det sunt og vegetarisk en dag,
 * lag veggisburger! Dødsgodt og billig. Ta to!
 * @author vebjorns && aggiemcswaggie
 */

public class Burger{ 
  // Gir 5-6 burgere
  
  /* Ingredienser */
  Ingrediens gulrot = new Gulrot(1, Enhet.STK);
  Ingrediens paprika = new Paprika(0.5, Enhet.STK);
  Ingrediens bønner = new KidneyBønner(1, Enhet.BOKS);
  Ingrediens havregryn = new Havregryn(2, Enhet.DL);
  
  /* Krydder */
  Collection<Ingrediens> krydder = new Collection<Ingrediens>("Oregano", "Hvitløkspulver", "Persille", "Salt");
  
  /*How-to*/
  public Burger(){
    Equipment blender = new Equipment();
    Equipment stekepanne = new Equipment();
    Equipment ovn = new Equipment();
    
    ovn.heat(175);

    while(blended < 0.9){ //la det være litt tekstur igjen
      blender.addAll(gulrot, paprika, bønner, havregryn);
      blender.blend();
    }
    
    Collection<Burger> burgers = blender.content.split(); //del i 5-6 kaker
    
    for(int time = 0; time < 180000; time++){
      burgers.fry(); //stek i litt olje i cirka 3 minutter
    }

    ovn.insert(burgers);
    Thread.sleep(600000); //stek i cirka 10 minutter

    // Server med hamburgerbrød, stekte poteter og tilbehør av ditt ønske :)
    
    boolean enjoyMeal = true;
    
  }
}
