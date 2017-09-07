package examples.override;

public class Main {
    public static void main(String args[]){
        Schrank kleiderschrank = new Kleiderschrank();
        Schrank wandschrank = new Wandschrank();
        System.out.println(kleiderschrank.sayYourName());
        System.out.println(wandschrank.sayYourName());
    }
}
