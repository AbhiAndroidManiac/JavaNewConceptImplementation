package org.example;


import org.example.annotations.SampleAnnotation;
import java.lang.reflect.Method;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[] arr = {1, 2, 3, 3, 3, 4, 4, 5};
        int key = 2;
        System.out.println(main.containsElement(arr,key));
        //accessAnnotationInJava();
    }
    boolean containsElement (int[] arr, int key) {
        // add your logic here
       /* boolean result = false;
        for(int i=0;i<arr.length;i++){
            if (arr[i]==key){
                result = true;
                break;
            }
        }*/
        int n = arr.length;
        return binarySearch(arr,0,n-1,key);
    }
    boolean binarySearch(int[] arr, int low, int high, int key){
        boolean result = false;
        if (high>=low){
            int mid = (high+low)/2;
            if (arr[mid]==key){
                result = true;
            } else if (arr[mid] < key){
                result=binarySearch(arr, mid+1, high, key);
            } else {
                result=binarySearch(arr,low,mid-1,key);
            }
        }
        return result;
    }

    //accessing annotation values attached
    public static void  accessAnnotationInJava(){
        Method methods = null;
        try {
            methods = Main.class.getMethod("annotationtestMethod");
            SampleAnnotation bc = methods.getAnnotation(SampleAnnotation.class);
            System.out.println(bc.author()+"  "+bc.date()+" "+bc.lastModified()+" "+bc.currentRevision());
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    //applying annotation on the method
    @SampleAnnotation(author = "Abhishek",date = "17-06-2023",lastModified ="17-06-2023",currentRevision = 2,lastModifiedBy = "")
    public static void annotationtestMethod(){
        System.out.println("The annotationMethod");
    }

}