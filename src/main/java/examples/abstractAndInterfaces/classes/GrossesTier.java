package examples.abstractAndInterfaces.classes;

//Interfaces können von anderen Interfaces erben, nutzen dafür aber extends an Stelle von implements.
public abstract class GrossesTier extends Tier {
    @Override
    public void tellMeYourSize(){
        System.out.println("Ich bin ein grosses Tier!");
    }
}
