package examples.staticOverride;

public class Main {
    public static void main(String[] args){

        //Die Statische Methode und die nichtstatische Methode werden aufgerufen.
        Oberklasse oberklasse = new Oberklasse();
        oberklasse.nonstaticMethod();
        Oberklasse.staticMethod();
        System.out.println();






        //Die Unterklasse erbt die nichtstatische Methode von der Oberklasse.
        Unterklasse unterklasse = new Unterklasse();
        unterklasse.nonstaticMethod();
        //Die Unterklasse kann auf die statische Methode der Oberklasse zugreifen.
        Unterklasse.staticMethod();
        System.out.println();






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
