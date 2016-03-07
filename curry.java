import kitchen;

/*
 * Curry er en rett som bygger på en base av currypasta og kokosmelk, og kan i teorien varieres omtrent i det uendelige ut ifra dette.
 * Dette er en billig rett hvor du typisk slenger oppi de grønnsakene du har liggende hjemme, alt smaker curry uansett.
 * Veldig enkelt, og du føler deg sabla flink etterpå.
 * @author aggiemcswaggie
 */

public class Curry{ 
  //2 porsjoner
  /* Ingredienser */
  Ingrediens laks = new Laks(200, Enhet.GRAM);
  Ingrediens løk = new Løk(1, Enhet.STK);
  Ingrediens grønnebønner = new GrønneBønner(300, Enhet.GRAM);
    //alternativer: Kikerter, vanlige erter, gulrøtter, linser, det meste passer!
  Ingrediens kokosmelk = new Kokosmelk(1, Enhet.BOKS) //dritbillig og alltid i hermetikkhylla.
  Ingrediens currypasta = new Currypasta(2, Enhet.SPISESKJE);
  Ingrediens ris = new Ris(1.5, Enhet.DL);
  
  /*How-to*/
  public Soup(){
    Equipment gryte1 = new Equipment();
    Equipment gryte2 = new Equipment();

    gryte1.kok(ris);
    //hvis ikke mora di lærte deg dette kan jeg ikke hjelpe deg

    gryte2.stek(løk); //surr i litt olje
    gryte2.add(currypasta);
    Thread.sleep(120000); //la det kose seg et par minutter

    gryte2.add(kokosmelk);
    gryte2.kokOpp();
    
    gryte2.add(grønnebønner);
    gryte2.kokOpp();
    Thread.sleep(240000); //la grønnsakene bli møre

    gryte2.add(laks);
    
    if(laks.FARGE == "lyserosa"){
      laks.done = true;
    }
    
    boolean enjoyMeal = true;
    
  }

}
