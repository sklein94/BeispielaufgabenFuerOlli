package examples.staticOverride;

public class Main {
    public static void main(String[] args){

        //Ein Objekt der Oberklasse wird erstellt.
        Oberklasse oberklasseObjekt = new Oberklasse();

        /* Die Statische Methode kann sowohl über den Klassennamen als auch über einen Objektnamen aufgerufen werden.
         * Das Aufrufen über den Objektnamen gilt allerdings als schlechter Programmierstil, da es dann nicht
         * eindeutig erkennbar ist, dass es sich um eine statische Methode handelt.
         * Die nichtstatische Methode wird über den Objektnamen aufgerufen.
         */
        oberklasseObjekt.nonstaticMethod();
        Oberklasse.staticMethod();
        oberklasseObjekt.staticMethod();
        System.out.println();





        /*
         * Bei der Unterklasse ist es genau so möglich, wobei sich die Implementierung verändert, da in der Unterklasse
         * die Methoden Überschrieben/Überlagert wurden.
         */
        Unterklasse unterklasse_Objekt = new Unterklasse();

        unterklasse_Objekt.nonstaticMethod();
        Unterklasse.staticMethod();
        unterklasse_Objekt.staticMethod();
        System.out.println();






        /* Die UnterUnterklasse erbt von der Unterklasse, welche von der Oberklasse erbt. Diese überschreibt/überlagert
         * allerdings keine Methoden.
         */
        Unterklasse unterUnterklasse = new UnterUnterklasse();
        //Die Unterklasse der Unterklasse erbt die nichtstatische Methode der Unterklasse
        unterUnterklasse.nonstaticMethod();
        //Die Unterklasse der Unterklasse kann auf die statische Methode der Unterklasse zugreifen.
        UnterUnterklasse.staticMethod();
        //Die Unterklasse der Unterklasse kann auf die statische Methode der Oberklasse zugreifen.
        UnterUnterklasse.secondStaticMethod();
        System.out.println();





        //Polymorphie: Ein Objekt der Unterklasse wird in einer Variable der Oberklasse erzeugt.
        //Hier zeigt das Programm ein Verhalten, was man auf den ersten Blick nicht erwarten würde.
        //Das Programm wird, obwohl die Variable ein Objekt vom Typ Unterklasse enthält, die Methoden
        //von der Oberklasse aufrufen.
        //Das liegt daran, dass statische Methoden schon zum Kompilierungszeit festliegen.
        //Hier steht schon fest, welche Implementierung der Methode aufgerufen wird, nämlich die der Oberklasse
        //Wäre die Methode nicht statisch, würde erst zur Laufzeit entschieden werden, welche der Implementierungen
        //aufgerufen wird.
        //Bei statischen Methoden wird anhand des Klassennamens entschieden, welche Implementierung einer Methode
        //aufgerufen wird, bei nichtstatischen Methoden wird anhand des tatsächlichen Objekttypen entschieden.
        //
        //Statische Methoden werden also vererbt, können aber streng genommen nicht überschrieben werden.
        //Die Unterklasse kann nur auf den statischen Geltungsbereich der Oberklasse zugreifen.
        //
        //Man kann zwar eine gleichnamige statische Methode schreiben, welche dann die statische Methode
        //in der Unterklasse überlagern, also neu implementieren, aber es hat nicht den gleichen Effekt wie das
        //Überschreiben der Methode.
        //Die Überschriebene Methode existiert nicht mehr in der neuen Klasse, die überlagerte Methode existiert weiterhin.
        //Die statische Methode der Oberklasse existiert weiterhin in ihrem Geltungsbereich und es kann über den "vollen Namen"
        //weiterhin auf sie zugegriffen werden (Klassenname.Methodenname).
        //Auf die überschriebene Methode kann nur noch über super.Methodenname zugegriffen werden.
        Oberklasse o = new Unterklasse();
        o.secondStaticMethod();
        o.staticMethod();


    }
}
