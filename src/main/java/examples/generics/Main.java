package examples.generics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String args[]) {
        //==============================================================================================================
        //===========Deklaration von Generics===========================================================================
        //==============================================================================================================

        //Deklaration der generischen Klasse. Zwischen den <> ist ein Typ angegeben.
        GenericClass<Integer> integerGeneric = new GenericClass<Integer>(5);

        //Generics können auch weitere Generics enthalten.
        GenericClass<GenericClass<Integer>> genericClassHolder = new GenericClass<GenericClass<Integer>>(integerGeneric);

        /*
         * Bei weiter verschachtelten Generics wird es sehr unübersichtlich. Daher kann bei der Zuweisung auf der rechten
         * Seite des Gleichheitszeichens anstatt der genauen Typbezeichnung innerhalb der <> auch einfach nur <> geschrieben werden.
         * Der Compiler wird daraus automatisch den richtigen Typen machen. Dies ist seit java 7 möglich.
         */
        GenericClass<GenericClass<GenericClass<Integer>>> genericClassHolderHolder = new GenericClass<>(genericClassHolder);


        //==============================================================================================================
        //================Nicht generische ArrayList====================================================================
        //==============================================================================================================

        /*
         * Folgendes Beispiel zeigt eine nicht-generische ArrayList. Die Korrektheit der Typen wird erst
         * zur Laufzeit geprüft. Daher kann es zu ClassCastExceptions kommen.
         */
        ArrayList a = new ArrayList();
        a.add(5);
        a.add("5");

        //Gibt eine Fehlermeldung, da jeder Wert in der ArrayList ein Object ist, ein Cast wird benötigt.
        //int integerWithoutCast = a.get(0);

        //Holt den Wert aus der ArrayList und castet ihn zu dem entsprechenden Typ
        int integerWithCast = (Integer) a.get(0);
        String stringWithcast = (String) a.get(1);

        //Würde eine ClassCastException geben, da man einen Integer nicht zu einem String casten kann.
        //String stringWithCast = (String) a.get(0);


        //==============================================================================================================
        //=============Generische ArrayList=============================================================================
        //==============================================================================================================

        /*
         * Folgendes Beispiel zeigt eine generische ArrayList. Die Typkompatibilität wird so schon zur
         * Kompilierungszeit geprüft.
         */

        ArrayList<Integer> b = new ArrayList<>();
        b.add(5);
        //Gibt eine Fehlermeldung vom Compiler. Die arrayList kann nur Integer-Werte annehmen.
        //b.add("5");

        //Es wird kein Cast mehr benötigt, da die Typsicherheit durch Generics schon sichergestellt ist.
        int GenericIntegerWithCast = b.get(0);

        //Würde nicht kompilierbar sein, wirft demnach während der Laufzeit keine ClassCastException.
        //String stringWithCast = b.get(0);


        //==============================================================================================================
        //============Generische Methoden und Objekte===================================================================
        //==============================================================================================================

        GenericClass<String> genericClass = new GenericClass<>("Leer");

        String s = genericClass.getSameValueBack("StringValue");


        /* Gibt eine Fehlermeldung vom Compiler. In dieser Methode kann nur der Datentyp eingegeben werden, welcher
         * beim Erstellen des Objektes angegeben wird.
         */
        //String s2 = genericClass.getSameValueBack(5);



        /* Rückgabetyp der Funktion ist immer void, aber es kann ein beliebiger Objekttyp übergeben werden,
         * mit welchem dann gearbeitet werden kann.
         */
        genericClass.sayMyClassname_GenericMethod(new Integer(5));



        /*
         * Die Folgende Methode ist generisch. Eine Generische Methode kann ebenfalls in einer
         * nicht generischen Klasse vorkommen.
         * Da diese Methode ihren eigenen Generic verwendet, ist sie nicht abhängig von  dem Generic des Objektes,
         * aus welchem sie aufgerufen wird.
         * Der Rückgabetyp dieser Methode nimmt automatisch den Typ des übergebenen Parameters an.
         * In diesem Fall Double.
         */
        double genericReturnDouble = genericClass.getSameValueBack_GenericMethod(5D);

        //Gibt eine Fehlermeldung vom Compiler, da ein Integer erwartet wird, der Rückgabetyp dieser Methode ist aber double.
        //int genericReturnInteger = genericClass.getSameValueBack_GenericMethod(5D);

        //==============================================================================================================
        //============Sinn und Zweck von Generics - Vermeidung von Runtime-Exceptions===================================
        //==============================================================================================================

        /*
         * Ein großes Ziel von Generics ist es, das werfen von unchecked Exceptions möglichst zu vermeiden.
         *
         * Checked Exceptions werden schon zur Kompilierungszeit überprüft und müssen dementsprechend behandelt werden.
         * Versuche ich also, einer Generischen Integer Variablen in meinem Code statisch einen String-Wert zuzuweisen,
         * wird das Programm nicht kompilierbar sein, da eine Checked Exception geworfen wird.
         *
         * Bei nichtgenerischen Typen gibt es keine Garantie dafür, dass z.B eine Zuweisung korrekt ist. Daher kann eine
         * RuntimeException (unchecked Exception) geworfen werden, welche das gesamte Programm zum Absturz bringt.
         *
         * Checked Exceptions können bzw. müssen aber behandelt werden (zum Beispiel mit try-catch-finally,
         * ansonsten direkt im Code), was dann nicht zum Programmabsturz führt bzw führen muss.
         */

        ArrayList unchecked = new ArrayList();
        unchecked.add("5");

        /* Würde zu einer RuntimeException (ClassCastException, unchecked Exception) führen,
         * das Programm wird an dieser Stelle auf jeden Fall abstürzen.
         */
        //int castUnchecked = (int) unchecked.get(0);




        ArrayList<Integer> checked = new ArrayList<>();
        /* Das Programm wirft bereits hier eine Exception (checked Exception). Das hat den Vorteil, dass bereits zur
         * Kompilierungszeit geprüft wird, ob eine Zuweisung gültig ist.
         * Das hat den Vorteil, dass man somit viele Fehler, wie den Fehler in dem obigen beispiel, bereits verhindert.
         */
        //checked.add("5");


        //==============================================================================================================
        //============Sinn und Zweck von Generics - Typsichere Programmierung===========================================
        //==============================================================================================================

        /*
         * Die Array-List ermöglicht das dynamische Erzeugen eines Arrays.
         * Dort sollen beliebige Objekttypen gestapelt werden können. Es soll dabei keine Rolle spielen, welchen Typ
         * diese objekte haben, aber in einer ArrayList sollen nur Objekte gleichen Typen stehen.
         * Schon zur Kompilierungszeit kann festgestellt werden, ob alle Objekte auf dem Stapel den richtigen
         * Typ haben (Typsicherheit).
         * Ohne Generics müsste man für jeden Möglichen Objekttyp erneut eine ArrayList-Klasse schreiben, für jeden
         * einzelnen Parametertyp von add(), Rückgabetyp von get() etc.
         * Durch die Generics wird der Code aber dynamisch zu dem bei der Deklaration angegebenen Typen verändert.
         */

        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("5");
        ArrayList<Double> doubleList = new ArrayList<>();
        doubleList.add(5D);
        ArrayList<Long> longList = new ArrayList<>();
        longList.add(5L);


    }
}
