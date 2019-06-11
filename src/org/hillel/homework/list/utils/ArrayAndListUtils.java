package org.hillel.homework.list.utils;

import java.util.List;

class ArrayAndListUtils {

    static <T> T[] swapValues(T[] array, int indexN, int indexM) {
        T tmp = array[indexN];
        array[indexN] = array[indexM];
        array[indexM] = tmp;
        System.out.println("New array with change: ");
        return array;
    }

    static <T extends Comparable> T getMaxElementFromList(List<T> list, int indexN, int indexM) {
        T max = list.get(indexN);
        System.out.printf("\r\nMaximum value in the list from %d element till %d element is: ", indexN, indexM);
        for (int i = indexN; i < indexM + 1; i++) {
            if(max == null || list.get(i).compareTo(max) > 0){
                max = list.get(i);
            }
        }
        return max;
    }
}