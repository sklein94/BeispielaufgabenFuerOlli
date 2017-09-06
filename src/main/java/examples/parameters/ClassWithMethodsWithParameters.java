package examples.parameters;

public class ClassWithMethodsWithParameters {

    //Diese Methode enthält formale Parameter
    //Diese Parameter sind nur innerhalb der Methode gültig.
    public static void sayHello(int numberOfHellos){
        for (int i = 0; i < numberOfHellos; i++){
            System.out.println("Hello!");
        }
    }

    //Diese Methode enthält todo
    public static void saySomeWords(String words, int numberOfWords){
        for (int i = 0; i < numberOfWords; i++){
            System.out.println(words);
        }
    }

}
