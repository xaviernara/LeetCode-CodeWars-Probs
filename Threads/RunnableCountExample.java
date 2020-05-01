import java.util.*;

class Count implements Runnable
{

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




  Thread mythread ;
  public Count(){ 
      mythread = new Thread(this, "my runnable thread");
      System.out.println("my thread created" + mythread);
      mythread.start();
   }
   public void run()
   {
      try
      {
        for (int i=0 ;i<10;i++)
        {
          System.out.println("Printing the count " + i);
          
          //delays the thread
          //sleep() is a method which is used to pause the process for few seconds or the time we want to.
          
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
     }
     catch(InterruptedException e)
     {
        System.out.println("my thread interrupted");
     }
     System.out.println("mythread run is over" );
   }
}

public class RunnableCountExample{

    public static void main(String args[])
    {
       Count cnt = new Count();
       try
       {
          while(cnt.mythread.isAlive())
          {
            System.out.println("Main thread will be alive till the child thread is live"); 
            Thread.sleep(1500);
          }
       }
       catch(InterruptedException e)
       {
          System.out.println("Main thread interrupted");
       }
       System.out.println("Main thread run is over" );
    }
}