package org.hillel.homework.archive.documents;

import java.util.Iterator;
import java.util.List;

class ArchiveOfDocuments {

    static <T extends Number> void addDoc(List<T> list, T value) {
        list.add(value);
        System.out.printf("\r\nElement %s added successfully to HashSet", value);
    }

    static <T extends Number> T removeDoc(List<T> list, T value) {
        if (list.contains(value)) {
            list.remove(value);
            System.out.println("\r\nElement was removed ");
            return value;
        }
        System.out.println("\r\nElement can't be removed");
        return null;
    }

    static <T extends Number> boolean containsDoc(List<T> list, T value) {
        System.out.printf("\r\nCollection contains element %s (true/false) - ", value);
        if (list.contains(value)) {
            return true;
        } else {
            return false;
        }
    }

    static <T> void outputListDoc(List<T> list) {
        Iterator<T> iterator = list.iterator();
        System.out.println("\r\nMy list collection is:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}