package org.example.algorithms.sortings.sortinginterface;

public final class SortingUtils {
    /** compares two elements to see
     * if the first is greater then the second element
     * @param firstElement
     * @param secondElement
     * @return true if the first element is less than second, false otherwise
     */
     public static <T extends Comparable<T>> boolean greater(T firstElement,T secondElement){
        return firstElement.compareTo(secondElement)>0;
     }

    /**
     * swaps two elements at the given position in an array
     * @param array the array in which the elements has to be swapped
     * @param i the index of the first element
     * @param j the index of the second element
     * @param <T> the types of the elements in the array
     */
    public static <T> void swap(T[] array,int i, int j){
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
