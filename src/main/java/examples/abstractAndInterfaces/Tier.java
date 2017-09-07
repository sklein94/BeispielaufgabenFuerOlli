package examples.abstractAndInterfaces;

public interface Tier {
    //In Interfaces deklarierte Variablen sind automatisch statisch und Konstant (static final)
    //Beide Variablen hier sind statisch und final, obwohl nur eine davon als solche deklariert wurde
    //Dies geschieht automatisch beim Kompolieren.
    static final String aussage = "Ich bin ein Tier. ";
    String zweiteAussage = "Ja, das bin ich wirklich. ";

    //Private/Protected Konstanten sind nicht zulässig
    //private String einString = "Ich bin ein String";
    //protected String einString = "Ich bin ein String";

    void meineTierart();

    default void saySomething(){
        System.out.print(aussage);
        System.out.println(zweiteAussage);
    }
}
