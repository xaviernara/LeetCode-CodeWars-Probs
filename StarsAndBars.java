import java.util.*;


public class StarsAndBars{

   public static void main(String[] args){
   
      int[] ex1 = {1,1};
      int[] ex1_1 = {5,6};
      
      int[] ex2 = {1,1};
      int[] ex2_1 = {1,3};
      
      int[] ex2 = {1,1};
      int[] ex2_1 = {1,6};

   
      System.out.println(StarsAndBars("|**|*|*",ex1, ex1_1));
      System.out.println(StarsAndBars("*|*|",ex2, ex2_1));
      System.out.println(StarsAndBars("*|*|*",ex3, ex3_1));
   }
   
   
   
   public static int[] StarsAndBars(String s, int[] startingIndex, int[] endingIndex){
   
      String startRange = Integer.toString(startingIndex[0]) + Integer.toString(endingIndex[0]);
      String endRange = Integer.toString(startingIndex[1]) + Integer.toString(endingIndex[1]);
      int barCount =0;
      int starCount =0;
      

      //starting indexes star and bars search loop
      for(int i = String.valueOf(startRange.charAt(0)); i<String.valueOf(endRange.charAt(0)); i++ ){
      
         //'|' = ascii decimal 124
         if((int)s.charAt(i) == 124 ){
            if(barCount!=2){
               barCount++;
            }else  barCount = 0;
              
         } 
         
         //'*' = ascii decimal 42
         else{
            starCount++
         }

    }
    
    
    int[] result = new int[2]();
    
    result[0] = starCount;
    
    starCount = 0;
    
    //ending indexes star and bars search loop
    for(int i = String.valueOf(startRange.charAt(1)); i<String.valueOf(endRange.charAt(1)); i++ ){
      
         //'|' = ascii decimal 124
         if((int)s.charAt(i) == 124 ){
            if(barCount!=2){
               barCount++;
            }else  barCount = 0;
            
         } 
         
         //'*' = ascii decimal 42
         else{
            starCount++
         }
         
      }

      result[1] = starCount;
    
    
    
      
      
      return result;

   
   }
   
   


}