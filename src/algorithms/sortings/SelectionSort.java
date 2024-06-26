package algorithms.sortings;

import algorithms.sortings.sortinginterface.SortAlgorithm;
import algorithms.sortings.sortinginterface.SortingUtils;

import java.util.Arrays;


//SelectionSort Wiki
//https://en.wikipedia.org/wiki/Selection_sort
public class SelectionSort implements SortAlgorithm {
    /**
     * Generic selection sort algorithm in increasing order
     * @param unsorted - an array should be sorted
     * @return
     * @param <T>
     */
    @Override
    public <T extends Comparable<T>> T[] sort(T[] unsorted) {
        int n= unsorted.length;

        for (int i = 0; i <n-1 ; i++) {
            int minIndex = i;
            for (int j = i+1; j <n ; j++) {
                //greater than the specified object if x.compareTo(y) i.e x>y
                if (unsorted[minIndex].compareTo(unsorted[j])>0){
                    minIndex=j;
                }
            }
            if (minIndex!=i){
                SortingUtils.swap(unsorted,i,minIndex);
            }
        }
        return unsorted;
    }
    public static void main(String[] args) {
        SelectionSort instance = new SelectionSort();
        Integer[] inputNumber = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        //expected output Integer[] output = {1, 1, 2, 3, 3, 4, 5, 5, 5, 6, 9};
        System.out.println(Arrays.toString(instance.sort(inputNumber)));

        String[] inputString = {"banana", "apple", "cherry", "date"};
        //expected output is String[] output = {"apple", "banana", "cherry", "date"};
        System.out.println(Arrays.toString(instance.sort(inputString)));
        //expected output is Double[] output = {1.41, 1.73, 2.71, 3.14};
        Double[] inputDouble = {3.14, 2.71, 1.41, 1.73};
        System.out.println(Arrays.toString(instance.sort(inputDouble)));
    }
}
