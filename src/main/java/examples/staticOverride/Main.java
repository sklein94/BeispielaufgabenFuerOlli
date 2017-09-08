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
         * die Methoden überschrieben wurden.
         */
        Unterklasse unterklasse_Objekt = new Unterklasse();

        unterklasse_Objekt.nonstaticMethod();
        Unterklasse.staticMethod();
        unterklasse_Objekt.staticMethod();
        System.out.println();






        /* Die UnterUnterklasse erbt von der Unterklasse, welche von der Oberklasse erbt. Diese überschreibt
         * allerdings keine Methoden. Daher behält die Unterklasse alle Implementierungen der Unterklasse.
         */
        UnterUnterklasse unterUnterklasse = new UnterUnterklasse();
        unterUnterklasse.nonstaticMethod();
        UnterUnterklasse.staticMethod();
        //Diese statische Methode stammt von der Oberklasse und wurde bis zur UnterUnterklasse weiter vererbt.
        UnterUnterklasse.secondStaticMethod();
        System.out.println();



        /*
         * Polymorphie -> Vielgestaltigkeit -> Das Objekt der Unterklasse ist in einer Variable der Oberklasse gespeichert.
         * Hier tritt allerdings ein vermeintlich unerwartetes Ergebnis auf. Wird die statische Methode der Unterklasse
         * in einer Variable vom Typ Oberklasse aufgerufen, so verwendet das Programm die Implementierung der Oberklasse,
         * obwohl die Unterklasse eine eigene Implementierung besitzt.
         * Das liegt daran, dass die verwendete Implementierung einer statischen Methode schon zur Compilerzeit feststeht,
         * bei einer nichtstatischen Methode aber erst zur Laufzeit entschieden wird, wie die genaue Implementierung
         * einer Methode ist.
         *
         * Daher macht der Compiler die Entscheidung, welche der Methoden er aufruft davon abhängig, welchen
         * Objekttyp die Variable hat, nicht aber welches Objekt tatsächlich innerhalb der Variable gespeichert ist.
         *
         * Beim Überschreiben wird eine Methode in einer Klasse wirklich überschrieben, beim Überlagern (Shadowing) wird
         * einfach eine zweite Version dieser Methode erstellt, die in einem geringeren Geltungsbereich (Scope) ist und
         * daher die andere Methode nur überlagert.
         * Es kann mit dem vollen Namen weiterhin auf die statische Methode zugegriffen werden (Oberklasse.Methode), während
         * auf eine überschriebene Methode nur noch mit super.Methodenname() zugegriffen werden kann.
         *
         */
        Oberklasse o = new Unterklasse();
        o.staticMethod();


        /*
         * Gibt einen Fehler. Die Oberklasse implementiert zwar das Interface, welches diese Methode bietet, allerdings
         * ist die Methode statisch. In Interfaces werden statische Methoden NICHT weiter vererbt.
         */
        // o.sayHello();


    }
}
