package examples.staticOverride;

public class Unterklasse extends Oberklasse {
    //@Override
    //Funktioniert nicht, da die Methode nicht überschrieben wird.

    public static void staticMethod(){
        System.out.println("Ich bin eine statische Methode von der Unterklasse!");
    }

    @Override
    public void nonstaticMethod(){
        System.out.println("Ich bin eine nichtstatische Methode von der Unterklasse!");
    }
}
