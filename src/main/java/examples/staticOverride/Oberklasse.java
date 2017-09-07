package examples.staticOverride;

public class Oberklasse {
    public static void staticMethod(){
        System.out.println("Ich bin eine statische Methode von der Oberklasse!");
    }
    public static void secondStaticMethod(){
        System.out.println("Ich bin die zweite statische Methode von der Oberklasse!");
    }
    public void nonstaticMethod(){
        System.out.println("Ich bin eine nichtstatische Methode von der Oberklasse!");
    }
}
