package demo;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] argv) throws NoSuchFieldException {
        SomeClass someObject = new SomeClass();
        Class<SomeClass> someClassAsClass = (Class<SomeClass>)someObject.getClass();
        Field someField = someClassAsClass.getField("someField");
        System.out.println(someField.getType());
        Field[] fields = someClassAsClass.getFields();
        for (Field field : fields) {
            System.out.println(field.getType() + " " + field.getName());
        }
    }
}
