package com.faceless.sbet.roomwebapp.reflection;

import com.faceless.sbet.roomwebapp.models.Room;

import java.lang.reflect.Field;

/**
 * @author dungla
 */
public class TestReflection {
    public static void main(String[] args) throws IllegalAccessException {
        Room room = new Room(1,"W123", "Phong tra", "Soft");

        reflection(room);
    }

    public static <T> void reflection (T t) throws IllegalAccessException {
        Class myClass =  t.getClass();

        System.out.println("Class name: " +myClass.getName());
        System.out.println("Class simple name: " + myClass.getSimpleName());
        System.out.println("Is interface: " + myClass.isInterface());
        System.out.println("Constructors: ");

        System.out.println("Fields:");
        Field[] allFields = myClass.getDeclaredFields();
        for (Field field : allFields) {
            field.setAccessible(true);
            System.out.println("    " + field.getName() + " - type: " + field.getType() + " - value: " + field.get(t));
            field.setAccessible(false);
        }

    }
}
