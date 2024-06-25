package algorithms.sortings;

import algorithms.sortings.sortinginterface.SortAlgorithm;
import algorithms.sortings.sortinginterface.SortingUtils;

import java.util.Arrays;

public class BubbleSort implements SortAlgorithm {

    //Wiki
    //https://en.wikipedia.org/wiki/Bubble_sort
    public static void main(String[] args) {
        BubbleSort instance = new BubbleSort();
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

    @Override
    public <T extends Comparable<T>> T[] sort(T[] unsorted) {
        boolean swap = true;
        //-1 to handle 0-indexing
        int range = unsorted.length-1;
        while (swap){
            swap = false;
            for (int i = 0; i <range ; i++) {
                if (SortingUtils.greater(unsorted[i],unsorted[i+1])){
                    SortingUtils.swap(unsorted,i,i+1);
                    swap=true;
                }
            }
            if (!swap){
                break;
            }
            range--;
        }
        return unsorted;
    }
}
