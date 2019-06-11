package org.hillel.homework.list.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListUtilsDemo {
    public static void main(String[] args) {
        /*3)создайте класс ArrayAndListUtils
        a) реализовать в нем статический generic метод для смены местами элементов N и M
        параметры метода:
        исходный массив
        индекс элемента N
        интекс элемента M
        результат:
        массив где элемент N и M поменяны местами*/

        String[] myArray = {"1.2", "1.3", "2.5", "6.7", "8.8"};
        System.out.println(Arrays.asList(ArrayAndListUtils.swapValues(myArray, 0, 3)));

        /*b) реализовать статический generic метод для поиска в List максимального елемента начиная с позиции N и заканчивая позицией M
        !!! сделать чтобы generic тип реализовывал Comparable
        параметры метода:
        исходный лист
        индекс элемента N
        индекс элемента M
        результат:
        максимальный объект*/

        List<Double> listOfDoubles = new ArrayList<>();
        listOfDoubles.add(6.6);
        listOfDoubles.add(5.5);
        listOfDoubles.add(3.3);
        listOfDoubles.add(9.9);

        System.out.println(ArrayAndListUtils.getMaxElementFromList(listOfDoubles, 0, 3));
    }
}
