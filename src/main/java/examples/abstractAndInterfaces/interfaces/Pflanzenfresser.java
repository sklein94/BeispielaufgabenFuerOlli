package examples.abstractAndInterfaces.interfaces;

public interface Pflanzenfresser extends Nahrungsaufnahme {
    /* Hier wird eine Methode deklariert, welche später implementiert werden muss. Diese Methode
     * ist implizit public, sofern nicht explizit so gekennzeichnet.
     */
    void eatVegetables();
}
