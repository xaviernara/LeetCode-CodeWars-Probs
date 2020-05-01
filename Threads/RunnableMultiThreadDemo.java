import java.util.*;

public class RunnableMultiThreadDemo implements Runnable{


   //creating a THREAD using the Runnable interface
   //writing the definition for the run method  
   public void run(){
      System.out.println("My thread is in running state."); 
   
   }
   
   
   
   public static void main(String[] args){
   
      RunnableMultiThreadDemo rmtd  = new RunnableMultiThreadDemo();
      
      
      //When implementing the Runnable interface you need a Thread object to atart your thread
      Thread thread = new Thread(rmtd);
      
      thread.start();
   
   }


}