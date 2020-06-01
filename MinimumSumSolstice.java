import java.util.*;

public class MinimumSumSolstice{

   public static void main (String[] args){
   
   System.out.println(minimumSum(new int[]{10,7,20}, 4 ));
   System.out.println(minimumSum(new int[]{2,3},  1));
   System.out.println(minimumSum(new int[]{2},  1));

   
   
   
   }
   
   /*
   
      k = 4
      nums[10,7,20]
      
      Pick  Pick/2  Ceiling  Result
      7     3.5      4        4      nums[10,4,20]
      10    5        5        5      nums[5,4,20]
      20    10       10       10     nums[5,4,10] 
      10    5        5        5      nums[5,5,4]
      
      return 5 + 5 + 4 = 14 
   
   */
   
   // int indexOfMax = 0;
//    int indexOfMin = 0;
   int arrayLength = 0;

   
   //iterate solution 1
   public static int minimumSum(int[] nums,int k){
   
      //step 1: iterate array 
      //step 1: find minimum number
      //step 2: preform "pick" operations
      //step 3: update indexOfMax 
      //step 4: update indexOfMin
      //step 5: change number at indexOfMin to number after pick operations
      //step 6: recursivily iterate the array and decrement k
      
      int indexOfMax = 0;
      int indexOfMin = 0;

      /*
      if(k==0){
         if(nums.length == 1) {
           return sumArray(nums);
         }
         
      }
      */
      
      if(k==0){ return sumArray(nums); }

      
      
      
      
      for(int i =0; i<nums.length; i++){
      
         //double pick = 
         if(k>0){
            nums[i] = pickOperations(nums[i]);

         }
         k--;
      
      }
      
      if(k>0){
      
         while(k > 0){
      
         Arrays.sort(nums);
      
         indexOfMax = nums[nums.length-1];
         
         nums[nums.length-1] = pickOperations(indexOfMax);

          k--;
         }

      
      
      
      }
            
      
            
      //minimumSum(nums,k-1);
      
      return sumArray(nums);
      
      
      
   
   
   }

   
   private static int pickOperations(int num){
   
      double pick = (double)num/2;
   
      return (int)Math.ceil(pick);
   
   }
   
   private static int sumArray(int[] array){
   
      if(array.length == 0 ) return 0;
      else if(array.length == 1) return array[0];
      
      int result =0;
      
      for(int i = 0; i<array.length;i++){
      
         result += array[i];
      
      }
      return result;
   }
   
      //recursive solution
      //step 1: find minimum number
      //step 2: preform "pick" operations
      //step 3: update indexOfMax 
      //step 4: update indexOfMin
      //step 5: change number at indexOfMin to number after pick operations
      //step 6: recursivily iterate the array and decrement k



}