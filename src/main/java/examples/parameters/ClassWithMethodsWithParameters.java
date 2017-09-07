package examples.parameters;

public class ClassWithMethodsWithParameters {

    // Diese Methode enthält formale Parameter
    // Diese Parameter sind nur innerhalb der Methode gültig.
    public static void sayHello(int numberOfHellos){
        for (int i = 0; i < numberOfHellos; i++){
            System.out.println("Hello!");
        }
    }

    // Diese Methode enthält mehrere formale Parameter.
    // Die aktuellen Parameter müssen beim Aufruf der Methode in derselben Reihenfolge übergeben werden.
    public static void saySomeWords(String words, int numberOfWords){
        for (int i = 0; i < numberOfWords; i++){
            System.out.println(words);
        }
    }

    public void test(){
        //Funktioniert nicht, da es außerhalb der Methode ist.
        //System.out.println(numberOfWords);
    }

}
