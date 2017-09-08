package examples.abstractAndInterfaces.animals;

import examples.abstractAndInterfaces.classes.GrossesTier;
import examples.abstractAndInterfaces.interfaces.Pflanzenfresser;

/* Final verhindert, dass die Klasse weiter vererbt werden kann. Dies wäre bei Methoden auch möglich,
 * allerdings werden diese trotzdem weiter vererbt, können dann aber nicht überschrieben werden.
 */
public final class Kuh extends GrossesTier implements Pflanzenfresser {

    /*
     * Konstruktor der Klasse Kuh. Setzt das Attribut, welches die Klasse Kuh von der abstrakten Klasse Tier erbt.
     */
    public Kuh(String farbe) {
        this.farbe = farbe;
    }

    /*
     * Implementierung der Methode eatVegetables(). Durch die Implementierung des interfaces Pflanzenfresser muss
     * diese Klasse die Methode eatVegetables() implementieren.
     */
    @Override
    public void eatVegetables() {
        System.out.println("Ich fresse Gras!");
    }

    /*
     * Implementierung der Methode meineTierart(). Durch das Erben von Tier -> GrossesTier muss
     * diese Klasse die Methode meineTierart() implementieren.
     */
    @Override
    public void meineTierart() {
        System.out.println("Ich bin eine Kuh!");
    }
}
