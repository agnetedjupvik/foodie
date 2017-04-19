import kitchen;

/*
 * Søtpotetfries er et skikkelig digg tilbehør til nesten hva som helst du vil lage.
 * Prøv det til burger, kylling, falafel eller en salat!
 * @author vebjorns && aggie
 */

public class SweetPotatoFries{ 
  /* Ingredienser */
  Ingrediens søtpoteter = new Søtpoteter(2, Enhet.STK);
  Ingrediens krydder = new Collection<Krydder>("Salt", "Pepper", "Paprika");
  Ingrediens olivenolje = new Olivenolje(2. Enhet.SPISESKJE);
  
  /*How-to*/
  public SweetPotatoFries(){
    Equipment stekebrett = new Equipment();
    Equipment bakepapir = new Equipment();
    Equipment ovn = new Equipment(200, Enhet.GRADER);
    
    stekebrett.add(bakepapir);
    søtpoteter.wash(); //du kan fint beholde skallet! Er du en sart sjel kan du skrelle dem i stedet.
    
    Bolle bolle = new Bolle();
    while (søtpoteter.size > regularFries.size){
      søtpoteter.split(center);
    }
    
    bolle.add(søtpoteter);
    bolle.add(krydder);
    bolle.add(olivenolje);
    bolle.mix();

    stekebrett.addAll(bolle);
    
    ovn.insert(stekebrett);
    while (minutes < 40) {
      Thread.sleep(60000);
      minutes++;
      if (minutes % 20 == 0){
        stekebrett.stir(); //snu litt på søtpotetene midtveis
      }
    }
    
    if(søtpoteter.FARGE == "gyllen"){
      meal.done = true;
    }
    
    boolean enjoyMeal = true;
    
  }

}
