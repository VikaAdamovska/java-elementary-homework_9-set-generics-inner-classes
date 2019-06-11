package org.hillel.homework.inner.classes;

/*Inner classes
  1) взять класс
  public class DataStructure {
     private final static int SIZE = 15;
     private int[] arrayOfInts = new int[SIZE];
     public DataStructure() {
         //заполнение массива числами от 0 до 15
         for (int i = 0; i < SIZE; i++) {
             arrayOfInts[i] = i;
         }
     }
     interface DataStructureIterator extends java.util.Iterator<Integer> { }
  }
  2) создать в этом классе private inner class EvenIterator который реализует DataStructureIterator
  итератор должен последовательно возвращать элементы массива arrayOfInts)
  3) создать в классее DataStructure метод для возврата объекта EvenIterator*/

class DataStructure {

    private final static int SIZE = 15;

    private int[] arrayOfInts = new int[SIZE];

    DataStructure() {
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i;
        }
    }

    EvenIterator getEvenIterator() {
        return new EvenIterator();
    }

    //method main
    public static void main(String[] args) {

        DataStructure dataStructure = new DataStructure();

        DataStructure.EvenIterator evenIterator = dataStructure.getEvenIterator();

        while (evenIterator.hasNext()) {
            System.out.println(evenIterator.next());
        }
    }

    //inner class - iterator
    private class EvenIterator implements IDataStructureIterator {

        private int nextIndex;

        @Override
        public boolean hasNext() {
            if (nextIndex >= SIZE) {
                return false;
            }
            return true;
        }

        @Override
        public Integer next() {
            if (hasNext()) {
                return arrayOfInts[nextIndex++];
            }
            return null;
        }
    }
}
