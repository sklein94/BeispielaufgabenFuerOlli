package examples.parameters;

public class Main {
    public static void main(String[] args){
        //Beispiele für aktuelle Parameter (Innerhalb der runden Klammern)

        //Aufruf mit einem Literal
        ClassWithMethodsWithParameters.sayHello(5);

        //Aufruf mit Variable
        int numberOfHellos = 3;
        ClassWithMethodsWithParameters.sayHello(numberOfHellos);

        //Reihenfolge spielt eine Rolle
        ClassWithMethodsWithParameters.saySomeWords("Wie gehts?", 5);

        //Falsch ist:
        //ClassWithMethodsWithParameters.saySomeWords(5, "Wie gehts?");
    }
}
