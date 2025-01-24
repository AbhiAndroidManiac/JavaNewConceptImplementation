package org.example.workattech.searching.searchRange;

public class SearchRangeSolution {

    /*Given a sorted array and a number key, find the index of
        the first and last occurrence of the key in the array.
        If the key is not present, return [-1, -1].*/

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 3, 4, 4, 5};
        int key = 3;
        SearchRangeSolution searchRangeSolution = new SearchRangeSolution();
        System.out.println(searchRangeSolution.searchRange(arr, key)[0] + " " + searchRangeSolution.searchRange(arr, key)[1]);
    }
    //Naive approach
    /* Time Complexity: O(n)
       Space Complexity: O(1)*/
    int[] searchRange(int[] arr, int key) {
        /*// add your logic here
        int[] result = {-1, -1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                if (result[0] == -1) {
                    result[0] = i;
                }
                result[1] = i;
            }
        }
        return result;*/
        int n = arr.length;
        int[] indexes = {findStart(arr,0,n-1,key),findEnd(arr,0,n-1,key,n)};
        return indexes;
    }
    int findStart(int[] arr, int low, int high, int key){
        if (high>=low){
            int mid = (high+low)/2;
            //for finding the first occurence of the element
            //make sure that mid ==key and the mid-1 is less then key
            //if key is less then arr[mid] the  search in the left half
            // else if key is greater arr[mid]  then search in the right half
            if ((mid ==0 || key > arr[mid-1]) && arr[mid]==key){
                return mid;
            } else if (key>arr[mid]){
                return findStart(arr,mid+1,high,key);
            } else {
                return findStart(arr,low,mid-1,key);
            }
        }
        return -1;
    }
    int findEnd(int[] arr, int low, int high, int key,int n){
        if (high>=low){
            int mid = (low+high)/2;
            if ((mid== n-1 || key < arr[mid+1]) && arr[mid]==key){
                return mid;
            } else if (key<arr[mid]){
                return findEnd(arr, low, mid-1, key,n);
            } else {
                return findEnd(arr,mid+1,high,key,n);
            }
        }
        return -1;
    }
}
