package examples.abstractAndInterfaces.animals;

import examples.abstractAndInterfaces.classes.KleinesTier;
import examples.abstractAndInterfaces.interfaces.Fleischfresser;
import examples.abstractAndInterfaces.interfaces.Pflanzenfresser;

/* Final verhindert, dass die Klasse weiter vererbt werden kann. Dies wäre bei Methoden auch möglich,
 * allerdings werden diese trotzdem weiter vererbt, können dann aber nicht überschrieben werden.
 * Zu sehen ist, dass hierr meherere Interfaces implementiert wurden. Eine Klasse kann theoretisch
 * beliebig viele Interfaces implementieren.
 */
public final class Hund extends KleinesTier implements Pflanzenfresser, Fleischfresser {

    /*
     * Konstruktor der Klasse Hund. Setzt das Attribut, welches die Klasse Hund von der abstrakten Klasse Tier erbt.
     */
    public Hund(String farbe){
        this.farbe = farbe;
    }

    /*
     * Implementierung der Methode eatMeat(). Durch die Implementierung des interfaces Fleischfresser muss
     * diese Klasse die Methode eatMeat() implementieren.
     */
    @Override
    public void eatMeat() {
        System.out.println("Ich fresse Fleisch!");
    }


    /*
     * Implementierung der Methode eatVegetables(). Durch die Implementierung des interfaces Pflanzenfresser muss
     * diese Klasse die Methode eatVegetables() implementieren.
     */
    @Override
    public void eatVegetables() {
        System.out.println("Ich fresse Gemuese!");
    }

    /*
     * Implementierung der Methode meineTierart(). Durch das Erben von Tier -> KleinesTier muss
     * diese Klasse die Methode meineTierart() implementieren.
     */
    @Override
    public void meineTierart() {
        System.out.println("Ich bin ein Hund!");
    }
}
