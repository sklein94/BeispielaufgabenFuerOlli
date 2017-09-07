package examples.abstractAndInterfaces;

//Interfaces können von anderen Interfaces erben, nutzen dafür aber extends an Stelle von implements.
public interface GrossesTier extends Tier {
    static void tellMeYourSize(){
        System.out.println("Ich bin ein grosses Tier!");
    }
}
