package org.example;


import org.example.annotations.SampleAnnotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        System.out.println("The value of the");
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            Integer value = iterator.next();
            if (value==6){
                iterator.remove();
            }
           new Thread(() -> list.remove(list.size()-2));


        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //accessAnnotationInJava();
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