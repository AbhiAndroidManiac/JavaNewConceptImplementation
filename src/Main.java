

import annotations.SampleAnnotation;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Method methods = null;
        try {
            methods = Main.class.getMethod("annotationtestMethod");
            SampleAnnotation bc = methods.getAnnotation(SampleAnnotation.class);
            System.out.println(bc.author()+"  "+bc.date()+" "+bc.lastModified()+" "+bc.currentRevision());
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    @SampleAnnotation(author = "Abhishek",date = "17-06-2023",lastModified ="17-06-2023",currentRevision = 2,lastModifiedBy = "")
    public static void annotationtestMethod(){
        System.out.println("The annotationMethod");
    }

}