package reflection;

/*REFLECTION*/
/*
 It is a feature in java programming language
 what does this feature offers:-
 It allows an executing JAVA program to examine or "introspect"
 upon itself and manipulate internal properties of the program.

 For example:- it's possible for java class to obtain all the members name
 and display them.

 The ability to examine and manipulate a java class from within itself
 may not sound like very much , but in other programming language simply this
 feature doesn't exist.

 For example :- there is no way in a Pascal , C or C++ program
 to obtain information about the written functions within it.


  One tangible use of reflection is in JavaBeans, where
  software components can be manipulated visually via builder tool.
  The tool use reflection to obtain properties of JAVA components(classes)
  as they are dynamically load.

*/

import java.lang.reflect.Method;

public class Reflection101 {
    public static void main(String[] args) {
        //for returning method name with the fully qualified
        //parameter and return type
        returnMethodName(args[0]);
    }

    /*Run the above code with the
    For an invocation of:
    pass     java.util.Stack as command line argument
    java DumpMethods java.util.Stack */
    /*This returns the method name of the class java.util.Stack
     along with the fully qualified return parameter and return type.*/
    private static void returnMethodName(String args) {
        //this program class loads the specified class using Class.forName
        //and then calls getDeclaredMethods to retrieve the  list of
        //methods defined in the class.
        //java.lang.reflect.Method is a class representing a single method class
        try {
            Class c = Class.forName(args);
            Method m[] = c.getDeclaredMethods();
            for (int i = 0; i < m.length; i++) {
                System.out.println(m[i].toString());
            }
        } catch (Throwable e) {
            System.out.println("The exception is thrown " + e);
        }
    }
    //Setting Up to use Reflection
    /*
    The reflection classes such as Method are found in java.lang.reflect.
    There are 3 steps that must be followed to use these classes.
    1.)The first step is to have obtain a java.lang.Class object for the
        class that you want to manipulate. java.lang.Class is used to represent
        classes and interface in a running JAVA program.
        One way of obtaining a class object is to say
        Class c = Class.forName("java.lang.String");
        Another approach is to use
        Class c = int.class
        or
        Class c = Integer.Type
        (This approach accesses the predefined Type field of the wrapper
        (Such as Integer) for the fundamental type.)
        to obtain Class information on Fundamental types.
    2.)The second step is to call a method such as getDeclaredMethods,
        to get the list of all methods declared by the class.
    3.)Once this information is in hand, then the third step is to use
       the reflection api to manipulate the information.
       for example the sequence ,
       Class c = Class.forName("java.lang.String");
       Method m[] = c.getDeclaredMethods();
       System.out.println(m[0].toString());
       will display a texttual representation of the first method
       declared in String.
       */
    public static void diffClassObjectCreation(){

    }
}
