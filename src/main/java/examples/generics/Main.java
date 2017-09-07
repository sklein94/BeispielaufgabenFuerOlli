package examples.generics;

public class Main {
    public static void main (String args[]){
        GenericClass<Integer> integerGeneric = new GenericClass<>(5);

        System.out.println(integerGeneric.getSameValueBack(5).getClass());
        System.out.println(integerGeneric.getField().getClass());

        //Geht nicht, da ein Integer erwartet wird.
        //System.out.println(a.getSameValueBack("String").getClass());

        GenericClass<String> stringGeneric = new GenericClass<>("y");

        //Geht nicht, da ein String erwartet wird.
        //System.out.println(stringGeneric.getSameValueBack(5).getClass());



    }
}
