package examples.override;

public class Wandschrank extends Schrank {
    //@Override gibt an, dass eine Methode der Oberklasse überschrieben wird. Existiert diese Methode nicht, gibt es eine Fehlermeldung.
    @Override
    //Überschreibt eine Methode der Oberklasse. Mit super.Methodenname() kann man auf die Oberklasse zugreifen,
    //obwohl diese überschrieben wurde.
    public String sayYourName() {
        return "Ich bin ein Wand-" + super.sayYourName();
    }

    /*
     * Gibt eine Fehlermeldung, weil die Methode in der Oberklasse als final deklariert ist.
    @Override
    public void tueNichts(){
      System.out.println("Ich tue nach wie vor nichts!");
    }*/
}
