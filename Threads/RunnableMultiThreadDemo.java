import java.util.*;

public class RunnableMultiThreadDemo implements Runnable{

   public void run(){
      System.out.println("My thread is in running state."); 
   
   }
   
   
   
   public static void main(String[] args){
   
      RunnableMultiThreadDemo rmtd  = new RunnableMultiThreadDemo();
      
      Thread thread = new Thread(rmtd);
      
      thread.start();
   
   }


}