package classes;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String className = scanner.next();
        Class aClass = Class.forName(className);

        Field fields[] = aClass.getFields();

        for (Field field : fields) {
            System.out.println(field.getType() + " " + field.getName());
        }
        //Object object = aClass.newInstance();
        //System.out.println(object);
        Class types[] = new Class[fields.length];

        for (int i = 0; i < types.length; i++) {
            types[i] = fields[i].getType();
        }
        Constructor constructor = aClass.getDeclaredConstructor(types);
        for (Class parameterType : constructor.getParameterTypes()) {
            System.out.print(parameterType.getName() + " ");
        }

    }
    }
