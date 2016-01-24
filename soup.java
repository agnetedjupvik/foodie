import kitchen;

/*
 * Rett over nyttår trakk jeg visdomstannen min. Alle som har gjort det vet at å tygge er det siste man vil gjøre.
 * Derfor: hjemmelaget grønnsakssuppe. Tyggefritt, næringsrikt og skikkelig sunt, faktisk.
 * @author aggiemcswaggie
 */

public class Soup{
  /* Ingredienser */
  Ingrediens gulrot = new Gulrot(2, Enhet.STK);
  Ingrediens søtpotet = new Søtpotet(1, Enhet.STK);
  Ingrediens kålrot = new Kålrot(0.5, Enhet.STK);
  Ingrediens persillerot = new Persillerot(1, Enhet.STK);
  Collection<Ingrediens> veggies = new Collection<veggies>(gulrot, søtpotet, kålrot, persillerot);
  
  Ingrediens linser = new Linser(1, Enhet.BOKS); //rød eller grønn, whatever
  Ingrediens vann = new Vann(6, Enhet.DESILITER);
  Ingrediens fløte = new Fløte(1, Enhet.KLUNK) //optional
  
  ArrayList<Ingrediens> spices = new ArrayList<Ingrediens>("salt", "pepper", "chili");
  //sleng også oppi litt paprika, hvitløkspulver og muskat hvis du har slikt
  
  /*How-to*/
  public Soup(){
    Equipment gryte = new Equipment();
    Equipment stavmikser = new Equipment();
    
    gryte.add(vann);
    gryte.cook();
    
    double cookingTime = 0;
    
    for(veggie : veggies){
      veggie.peel();
      veggie.chop(); // Bitene skal være ish 1-2 cm tykke
      gryte.add(veggie);
    }
    
    while(cookingTime <= 10){ //kok alt i cirka 10 minutter
      Thread.sleep(60000); 
      cookingTime++;
      gryte.cook();
      if(cookingTime == 8){
      gryte.add(linser); //ha i linsene etter at grønnsakene har kokt i cirka 8 minutter
      }
    
    gryte.add(fløte);
    for(spice : spices){
      gryte.add(spice);
      gryte.smak();
      }
    
    while(gryte.contains(chunks)){
      stavmikser.miks();
      }
    }
    
    boolean enjoyMeal = true;
    
  }

}
