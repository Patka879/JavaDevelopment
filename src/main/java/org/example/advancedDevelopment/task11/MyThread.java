package org.example.advancedDevelopment.task11;

/**
 * Create a class that extends the Thread class, for example MyThread. Override the run() method to
 * display the thread name in the console by reading it from the static method of the current thread:
 * Thread.currentThread().getName()
 * Create a class with the public static void main(String[] args) method. Inside the main method,
 * create a variable of our previously created class type, for example MyThread, and initialize the class.
 * Call the start() method on the variable to execute the thread.
 */
public class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
        }
}
