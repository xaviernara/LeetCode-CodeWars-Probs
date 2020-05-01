import java.util.*;

class Count extends Thread{

   public Count(){
      super("my extebnding thread");
      System.out.println("my thread created" + this);
      start(); //starts the thread
      
   }
   
   //overridding the run method from the Thread class
   public void run(){
   
   
      try{
         for(int i = 0; i<10; i++){
            System.out.println("count " +i);
            Thread.sleep(1000);
         }
         
      
      }catch(InterruptedException e){
        System.out.println("my thread interrupted");
      }
      
      System.out.println("my thread run is over");   
   }
   
}


public class ExtendingCountExample{
   public static void main(String[] args){
   
      Count count = new Count();
      
      //it is good practice to use a try/catch block when running threads
      try{
      
         //while loop will loop as long as the thread is is alive
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