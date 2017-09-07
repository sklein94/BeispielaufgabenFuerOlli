package examples.overload;

public class Haustier {
    private String tierart;
    private String name;

    /*
     * Überladen von Methoden ist dann sinnvoll, wenn mit unterschiedlichem Input die gleiche Aktion ausgeführt werden soll.
     * Das wird in den meisten Fällen bei den Konstruktoren einer Klasse angewendet.
     * In diesem beispiel soll jeder Konstruktor folgendes tun: Die Startwerte der Attribute eines Objektes initialisieren.
     * Diese Aufgabe teilen sich alle Konstruktoren, weshalb es sinnvoll ist, wenn sie alle denselben Namen haben.
     * Es soll allerdings unterschiedliche Möglichkeiten geben, ein Objekt dieser Klasse zu erstellen, so also auch
     * eines, in welchem weder Name noch Tierart einen Wert haben.
     * Gäbe es dafür nur den Konstruktor, der beides verlangt, so könnte man von dieser Klasse kein Objekt erzeugen,
     * wenn man nicht beide dieser Werte hätte.
     */

    //Standardkonstruktor -> keine Parameter
    public Haustier(){
        tierart = "";
        name = "";
    }

    //Konstruktor (Selber Name wie Standardonstruktor) -> 2 Parameter -> 2 Strings
    public Haustier(String tierart, String name){
        this.tierart = tierart;
        this.name = name;
    }

    //Konstruktor (Selber Name wie Standardonstruktor) -> 1 Parameter -> String
    public Haustier(String tierart){
        this.tierart = tierart;
    }

    /*
     * Funktioniert nicht, da es bereits eine Methode mit derselben Signatur gibt -> Haustier(String) <-
    public Haustier(String name){
        this.name = name;
    }*/

    public String getTierart(){
        return tierart;
    }

    public String getName(){
        return name;
    }

}