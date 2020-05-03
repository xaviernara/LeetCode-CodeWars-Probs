import java.util.*;

class Count extends Thread{

   /*
      Difference between implemmenting Runnable vs extending Thread
   
      Implementing Runnable is the preferred way to do it. Here, you’re not really specializing or modifying the thread’s behavior. 
      You’re just giving the thread something to run. That means composition is the better way to go.
      
      Java only supports single inheritance, so you can only extend one class.
      
      Instantiating an interface gives a cleaner separation between your code and the implementation of threads.
      Implementing Runnable makes your class more flexible. 
      
      If you extend Thread then the action you’re doing is always going to be in a thread. 
      However, if you implement Runnable it doesn’t have to be. 
      You can run it in a thread, or pass it to some kind of executor service, or just pass it around as a task within a single threaded application.
      
   */

   public Count(){
      super("my extebnding thread");
      System.out.println("my thread created" + this);
      
      /*
         start() is used to start the execution of the code written in run(). 
         If you will omit start() the code inside run() will not be executed.
         
      */
      start(); //starts the thread
      
   }
   
   //overridding the run method from the Thread class
   public void run(){
   
   
      try{
         for(int i = 0; i<10; i++){
            System.out.println("count " +i);

            /*
            Thread.sleep() sends the current thread into the “Not Runnable” state for some amount of time. 
            The thread keeps the monitors it has acquired — i.e. if the thread is currently in a synchronized block or 
            method no other thread can enter this block or method. 
            If another thread calls t.interrupt(). it will wake up the sleeping thread.

            While sleep() is a static method which means that it always affects the current thread (the one that is executing the sleep method). 
            A common mistake is to call t.sleep() where t is a different thread; even then, it is the current thread that will sleep, not the t thread.
          
          */

            Thread.sleep(1000);
         }
         
      
      }catch(InterruptedException e){
        System.out.println("my thread interrupted");
      }
      
      System.out.println("my thread run is over");   
   }
   
}


/*


   getName(): It is used for Obtaining a thread’s name
   getPriority(): Obtain a thread’s priority
   isAlive(): Determine if a thread is still running
   join(): Wait for a thread to terminate
   run(): Entry point for the thread
   sleep(): suspend a thread for a period of time
   start(): start a thread by calling its run() method

*/





public class ExtendingCountExample{
   public static void main(String[] args){
   
      Count count = new Count();
      
      //it is good practice to use a try/catch block when running threads
      try{
      
         //while loop will loop as long as the thread is is alive
         //To know whether the thread has finished we can call isAlive() on the thread which returns true if the thread is not finished.
         while(count.isAlive()){
           System.out.println("Main thread will be alive till the child thread is live");
           Thread.sleep(1500);
         }   
      
      
      }catch(InterruptedException e){
        System.out.println("main thread interrupted");
      }
      
      System.out.println("main thread run is over");   

   }



}