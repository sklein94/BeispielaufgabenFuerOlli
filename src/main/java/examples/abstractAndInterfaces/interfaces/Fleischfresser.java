package examples.abstractAndInterfaces.interfaces;

public interface Fleischfresser extends Nahrungsaufnahme {
    /* Hier wird eine Methode deklariert, welche später implementiert werden muss. Diese Methode
     * ist implizit public, sofern nicht explizit so gekennzeichnet.
     */
    void eatMeat();
}
