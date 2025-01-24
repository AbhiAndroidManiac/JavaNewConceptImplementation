package org.example.workattech.searching.containselements;

public class ContainElementsSolution {


    /*Given a sorted array and a number key, return whether the key is present in the array or not.
        Expected Time Complexity: O(log n)*/

    public static void main(String[] args) {
        ContainElementsSolution containElementsSolution = new ContainElementsSolution();
        int[] arr1 = {1, 2, 3, 3, 3, 4, 4, 5};
        int key1 = 2;
        int[] arr2 = {1, 2, 3, 3, 3, 4, 4, 5};
        int key2 = 6;
        System.out.println("First array result");
        System.out.println(containElementsSolution.containsElement(arr1,key1));
        System.out.println("Second array result");
        System.out.println(containElementsSolution.containsElement(arr2,key2));
    }
    boolean containsElement (int[] arr, int key) {
        /*Time Complexity: O(n)
        Space Complexity: O(1)*/
        //naive approach
        /*for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==key){
                return  true;
            }
        }
        return  false;*/
        /* Time Complexity: O(log(n))
        Space Complexity: O(1)*/
        int n = arr.length;
        return binarySearch(arr,0,n-1,key);
    }
    boolean binarySearch(int[] arr, int low, int high, int key){
        if (high>=low){
            int mid = (high+low)/2;
            if (arr[mid]==key){
                return true;
            } else if (arr[mid]<key){
                return binarySearch(arr,mid+1,high,key);
            } else {
                return binarySearch(arr,low,mid-1,key);
            }
        }
        return false;
    }

}
