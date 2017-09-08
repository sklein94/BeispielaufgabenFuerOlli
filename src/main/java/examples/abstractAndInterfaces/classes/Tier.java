package examples.abstractAndInterfaces.classes;
/*
 * Interfaces sind sinnvoll im Vergleich zu abstrakten Klassen aus Folgenden Gründen:
 * 1. Wenn erwartet wird, dass viele Klassen eine bestimmte Eigenschaft von diesem Interface implementieren werden,
 *    dieses Interface aber nicht die Hauptfunktion des Objektes festlegt (Beispielsweise wie Comparable und Clonable)
 * 2. Wenn einer Klasse ein Verhalten gegeben werden will, ohne dass man sich bei der Erstellung des Interfaces näher
 *    damit befassen will, wer das Verhalten wie implementiert
 * 3. Wenn davon profitiert werden will, dass mehrere Interfaces implementiert werden können
 * 4. Werden eher dann verwendet, wenn die implementierende Klasse ein Verhalten des Interfaces übernimmt (Hund kann Nahrung aufnehmen)
 */

/*
 * Abstrakte Klassen sind sinnvoll im Vergleich zu Interfaces aus folgenden Gründen:
 * 1. Wenn eine Klasse wesentlich auf der abstrakten Klasse basieren soll
 * 2. Wenn Attribute weiter vererbt werden sollen
 * 3. Wenn statische Methoden weiter vererbt werden sollen
 * 4. Werden eher dann verwendet, wenn die von ihr erbende Klasse ein Teil der Klasse ist (Hund ist ein Tier)
 */

public abstract class Tier {
    /*
     * Hier wird ein Attribut deklariert, welches weiter an die Unterklasen vererbt wird.
     */
    public String farbe;

    /*
     * Getter des Attributes farbe. Wird mit vererbt.
     */
    public String getFarbe(){
        return farbe;
    }

    /*
     * Hier wird eine abstrakte Funktion deklariert. Die Implementierung
     * muss in einer Unterklasse folgen.
     */
    public abstract void meineTierart();

    public abstract void tellMeYourSize();

    /*
     * Hier wird eine Methode implementiert, welche an die Unterklassen
     * weiter vererbt und dort überschrieben werden kann.
     */
    public final void whoAreYou(){
        System.out.println("Ich bin ein Tier.");
    }
}
