package examples.abstractAndInterfaces.interfaces;

/*
 * Interfaces sind sinnvoll im Vergleich zu abstrakten Klassen aus folgenden Gründen:
 * 1. Wenn erwartet wird, dass viele Klassen eine bestimmte Eigenschaft von diesem Interface implementieren werden,
 *    dieses Interface aber nicht die Hauptfunktion des Objektes festlegt (Beispielsweise wie Comparable und Clonable)
 * 2. Wenn einer Klasse ein Verhalten gegeben werden will, ohne dass man sich bei der Erstellung des Interfaces näher
 *    damit befassen will, wer das Verhalten wie implementiert
 * 3. Wenn davon profitiert werden will, dass mehrere Interfaces implementiert werden können
 */

public interface Nahrungsaufnahme {
    /*
     * Variablen in einem Interface sind automatisch public static final. Sofern es nicht explizit geschieht,
     * macht der Compiler dies automatisch beim Kompilieren.
     * Beide der unten stehenden Variablen sind public static final, obwohl es nur bei einer angegeben ist.
     * Diese Konstanten werden weiter vererbt.
     */
    public static final String aussage = "Ja, ich kann etwas essen. ";
    String aussage2 = "Ich kann Nahrung aufnehmen. ";


    /* Statische Methode wird hier implementiert. Diese Methode verbleibt nur in diesem Interface und kann auch nur von
     * hier aufgerufen werden. In Interfaces werden statische Methoden NICHT weiter vererbt.
     */
    static void canYouEat() {
        System.out.println(aussage);
    }

    /* Normalerweise haben statische Methoden in einem Interface keine Implementierung, aberr seit java 8 ist dies möglich.
     * Sie müssen dafür mit dem Schlüsselwort default gekennzeichnet werden.
     */
    default void eat() {
        System.out.println(aussage2);
    }


}
