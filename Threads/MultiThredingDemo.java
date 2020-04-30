import java.util.*;

public class MultiThredingDemo extends Thread{

   public void run(){
   
      System.out.println("My thread is in running state.");
   
   }
   
   
   public static void main(String[] args){
       MultiThredingDemo mtd = new MultiThredingDemo();
       
       mtd.start();
   
   }

}

