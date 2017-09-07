package examples.generics;

import java.lang.reflect.Array;

public class GenericClass<T> {
    private T field;

    //Beim Aufruf des Konstruktors muss T vom Typ des T sein, welches bei der Deklaration verwendet wurde.
    public GenericClass(T value) {
        field = value;
    }

    public void setField(T field){
        this.field = field;
    }

    //Gibt das Attribut field wieder aus.
    public T getField() {
        return field;
    }

    //Gibt den selben Wert wieder zurück, der als Parameter übergeben wurde. Der Wert hängt von dem T ab, welches bei der Deklaration
    //verwendet wurde.
    public T getSameValueBack(T val) {
        return val;
    }

    //Gibt denselben Wert zurück, der als Parameter übergeben wurde. Der Rückgabewert der Methode hängt von dem Typ
    //des Objektes ab, welcher übergeben wurde.
    public <V> V getSameValueBack_GenericMethod(V val) {
        return val;
    }

    //Gibt den Klassennamen des übergebenen Objektes aus.
    //Der Rückgabetyp ist immer void, egal welches Objekt übergeben wurde
    public <V> void sayMyClassname_GenericMethod(V object) {
        System.out.println(object.getClass());
    }

}
