package org.example.Concurrency.AThreadCreation101;

public class ThroughRunnable implements Runnable{
    /**
     * Implementing the runnable interface asks to implement
     * the method run of the interface.
     */
    @Override
    public void run() {
        System.out.println("Hello from a thread");
    }
    //Note:-we need to invoke the start() method of the
    //Thread class through its object to start the thread

    public static void main(String[] args) {
        //Creating and running a thread is through the Thread object creation and
        //passing the runnable object
        (new Thread(new ThroughRunnable())).start();
        //even  you can create a thread using the following
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from thread 2");
            }
        }).start();
    }
}
