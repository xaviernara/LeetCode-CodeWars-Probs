import java.util.*;

public class BinarySearchExample{

   public static void main (String[] args){
   
      int[] test = {3,4,5,11,90,234,1000,1090, 2000,5000};
      
      int[] test2 = {3,5,4,11,90,234,1000,1090, 2000,5000};
      
      System.out.println(binarySearch(2000, test ));
      System.out.println(binarySearch(1, test2));
   
   }
   
   
   //Data structre most be sorted before using this algo
   public static int binarySearch ( int num, int[] array){
   
      int low = 0;
      int high = array.length-1;
      //int mid =(low + high)/2;
      
      while(low <= high){
      
         int mid =(low + high)/2;
         //if the middle of the array == num then return mid's index
         if (array[mid] == num){
            return mid;
         }
         //else if the num isnt in the middle of the array  
         else if (array[mid] > num){
            high = mid - 1;
         }else{
            low = mid +1;
         
         }
         
      
      }
      
      return -1;
   
   
   }


}