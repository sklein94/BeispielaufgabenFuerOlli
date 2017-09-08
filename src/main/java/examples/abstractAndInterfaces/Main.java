package examples.abstractAndInterfaces;

import examples.abstractAndInterfaces.animals.Hund;
import examples.abstractAndInterfaces.animals.Kuh;
import examples.abstractAndInterfaces.classes.Tier;
import examples.abstractAndInterfaces.interfaces.Nahrungsaufnahme;

public class Main {
    public static void main(String[] args){
        /*
         * Ein Objekt vom Typ Hund wird erstellt und alle seine Methoden werden aufgerufen.
         */
        Hund hund = new Hund("Braun");
        hund.whoAreYou();
        hund.tellMeYourSize();
        hund.meineTierart();
        hund.eat();
        hund.eatMeat();
        hund.eatVegetables();
        System.out.println(hund.getFarbe());
        System.out.println();


        /*
         * Ein Objekt vom Typ Hund wird erstellt und alle seine Methoden werden aufgerufen.
         */
        Kuh kuh = new Kuh("Lila");
        kuh.whoAreYou();
        kuh.tellMeYourSize();
        kuh.meineTierart();
        kuh.eat();
        kuh.eatVegetables();
        System.out.println(kuh.getFarbe());
        System.out.println();


        //Mit Instanceof kann abgefragt werden, ob ein Objekt von einem anderen erbt
        if (hund instanceof Tier){
            System.out.println("Ein Hund ist ein Tier!");
        }
        //Das gleiche gilt für Interfaces
        if (hund instanceof Nahrungsaufnahme){
            System.out.println("Eine Kuh kann Nahrung zu sich nehmen.");
        }
        System.out.println();





        Nahrungsaufnahme.canYouEat();
        //Pflanzenfresser.canYouEat();
        //Funktioniert nicht, da statische Methoden von Interfaces nicht weiter vererbt werden können.

    }
}
