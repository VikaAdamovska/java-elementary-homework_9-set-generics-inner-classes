package org.hillel.homework.archive.documents;

import java.util.ArrayList;
import java.util.List;

public class ArchiveDemo {
    public static void main(String[] args) {
        /*2)создать не generic класс AnyObjectStore2
        a) реализовать статический generic метод добавления объекта в лист
        параметры:
        List в который нужно добавить элемент
        Элемент который нужно добавить в лист
        результат: void
        !!!все методы класса AnyObjectStore2 должны работать только с классами обертками для чисел (Integer, Double etc)*/

        List<Integer> documents = new ArrayList<>();
        ArchiveOfDocuments.addDoc(documents, 122);
        ArchiveOfDocuments.addDoc(documents, 155);
        ArchiveOfDocuments.addDoc(documents, 13);
        ArchiveOfDocuments.addDoc(documents, 266);

        /* b) рализовать статический generic метод удаления объекта из List
        параметры:
        List из которого надо удалить елемент
        Элемент который нужно удалить
        результат: вернуть удаленный объект или null если такого объекта нет в листе*/

        System.out.println(ArchiveOfDocuments.removeDoc(documents, 15));
        System.out.println(ArchiveOfDocuments.removeDoc(documents, 13));

        /*c) реализовать в этом классе статический generic метод contains
        параметры:
        List в котором надо проверить наличие элемена
        Элемент наличие которого нужно проверить
        : TRUE/FALSE*/

        System.out.println(ArchiveOfDocuments.containsDoc(documents, 266));
        System.out.println(ArchiveOfDocuments.containsDoc(documents, 13));

        //output of my list collection
        ArchiveOfDocuments.outputListDoc(documents);
    }
}
