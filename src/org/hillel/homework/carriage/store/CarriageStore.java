package org.hillel.homework.carriage.store;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class CarriageStore<T, T2> {

    private Set<T> setCarriage = new HashSet<>();
    private Set<T2> ourCarriage = new LinkedHashSet<>();

    void addToSetCarriage(T value) {
        setCarriage.add(value);
        System.out.println("\r\nElement added successfully to HashSet");
    }

    void addToOurCarriage(T2 element) {
        ourCarriage.add(element);
        System.out.println("\r\nElement added successfully to LinkedHashSet");
    }

    T removeCarriage(T values) {
        if (setCarriage.contains(values)) {
            setCarriage.remove(values);
            System.out.println("\r\nThis element was removed");
            return values;
        } else {
            System.out.println("\r\nElement not found! It can't be deleted");
            return null;
        }
    }

    void outputCarriage() {
        Iterator<T> iterator = setCarriage.iterator();
        System.out.println("\r\nMy set collection:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    boolean containCarriage(T element) {
        System.out.printf("\r\nCollection contains element %s (true/false) - ", element);
        if (setCarriage.contains(element)) {
            return true;
        } else {
            return false;
        }
    }
}
