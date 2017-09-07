package examples.abstractAndInterfaces;

//Interfaces können von anderen Interfaces erben, nutzen dafür aber extends an Stelle von implements.
public interface KleinesTier extends Tier {
    static void tellMeYourSize(){
        System.out.println("Ich bin ein kleines Tier!");
    }
}
