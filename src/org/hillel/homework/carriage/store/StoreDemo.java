package org.hillel.homework.carriage.store;

public class StoreDemo {
    public static void main(String[] args) {

        /*1)создать generic класс AnyObjectStore1 <T> (внутри значения хранить в одной из имплементаций Set)
        реализовать методы добавления объекта типа T
        рализовать метод удаления объекта типа T
        реализовать в этом классе метод contains с параметром типа T*/

        //add to the list of elements of type String
        CarriageStore<String, Integer> car = new CarriageStore<>();

        car.addToSetCarriage("Nissan");
        car.addToSetCarriage("Toyota");
        car.addToSetCarriage("BMW");

        //add to the list of elements of type Integer
        CarriageStore<String, Integer> ourCar = new CarriageStore<>();

        ourCar.addToOurCarriage(1);
        ourCar.addToOurCarriage(2);
        ourCar.addToOurCarriage(3);

        //delete elements
        System.out.println(car.removeCarriage("Niva"));
        System.out.println(car.removeCarriage("BMW"));

        //output collection
        car.outputCarriage();

        //collection contains an element
        System.out.println(car.containCarriage("Niva"));
        System.out.println(car.containCarriage("Nissan"));
    }
}
