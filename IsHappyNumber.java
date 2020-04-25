import java.util.*;

public class IsHappyNumber{

   public static void main (String[] args){
   
      System.out.println(isHappy(19));
      System.out.println(isHappy(1));

   
   }
   
   public static boolean isHappy(int n){
      
      if(n == 1)return true;
      else if(n == 0) return false;
      
      String s = Integer.toString(n);
      
      int result = 0;
      //int cycleCount = 0;
      
      for(int i = 0; i<s.length(); i++){
         result += Character.getNumericValue(s.charAt(i)) * Character.getNumericValue(s.charAt(i));
         //Math.pow(result,2);
         
         //if(i == s.length() && result == 1){
                           
         }
         /*
         else if (i == s.length() && result != 1){
            i = 0;
            s = Integer.toString(result);
         }
         */
      
      //}
      
      
      //if(i == s.length()-1){
       if(result == 1) {return true;}
       //else{
       if(result!=1){
               /*
               s = Integer.toString(result); 
               result = 0;
               i = 0;
               */
               //cycleCount++;
               //if(cycleCount==6) return false;
               isHappy(result);
        } 
       

      
   
      return false;
   
   
   }



}