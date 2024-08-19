package Concurrency.ThreadCreation101;

public class ThroughThreadSubclass extends Thread{
    /**
     * Creating  a subclass of the thread class and
     * overriding its run method
     */
    @Override
    public void run() {
        super.run();
        System.out.println("Hello from thread");
    }
    //we need to invoke the start() method of the
    //Thread class through its object to start the thread
    public static void main(String[] args) {
        new ThroughThreadSubclass().start();
    }
}

/**So the question arises which IDIOM to use for the object creation
The first idiom of implementing the runnable interface is more general
because the Runnable Object can subclass a class other then Thread.
 The second idiom is easier to use in simple applications ,
 But is limited by the fact your task class must be a descendant of Thread.
 The first IDIOM of the Implementing a Runnable interface,
 which separates the Runnable task from the Thread object that executes the task.
 However the Subclassing the Thread with the Thread SuperClass will give
 you access to the many useful static methods and other useful methods associated with the thread
 execution.
 **/

