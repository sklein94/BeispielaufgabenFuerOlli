package examples.override;

public class Kleiderschrank extends Schrank {
    @Override
    public String sayYourName() {
        return "Ich bin ein Kleider-" + super.sayYourName();
    }

    /*
     * Gibt eine Fehlermeldung, weil die Methode in der Oberklasse als final deklariert ist.
    @Override
    public void tueNichts(){
      System.out.println("Ich tue nach wie vor nichts!");
    }*/
}
