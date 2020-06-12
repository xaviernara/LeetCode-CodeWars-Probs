import java.util.*;


public class StarsAndBars{

   public static void main(String[] args){
   
      int[] ex1 = {1,1};
      int[] ex1_1 = {5,6};
      
      int[] ex2 = {1,1};
      int[] ex2_1 = {1,3};
      
      int[] ex3 = {1,1};
      int[] ex3_1 = {1,6};

   
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
      //for(int i = Character.getNumericValue(startRange.charAt(0)); i<Character.getNumericValue(startRange.charAt(0)); i++ ){
      
      
      //int i = Character.getNumericValue(startRange.charAt(0)) - 1;
      //for(i ; i<Character.getNumericValue(startRange.charAt(0)) ; i++ ){


      String s1 = s.substring(Character.getNumericValue(startRange.charAt(0)), Character.getNumericValue(endRange.charAt(0)) );

    //while(i <= Character.getNumericValue(startRange.charAt(1))-1){
    
    for(int i = 0; i<s1.length();i++){
         //'|' = ascii decimal 124
         if((int)s.charAt(i) == 124 ){
            if(barCount!=2){
               barCount++;
            }else  barCount = 0;
              
         } 
         
         //'*' = ascii decimal 42
         else if ((int)s.charAt(i) == 42 && barCount!=2){
            starCount++;
         }
         
         //i++;

    }
    
    
    int[] result = new int[2];
    
    result[0] = starCount;
    
    starCount = 0;
    barCount = 0;
    
    //ending indexes star and bars search loop
    //for(int i = Character.getNumericValue(endRange.charAt(1)); i< Character.getNumericValue(endRange.charAt(1)); i++ ){
    
    
    //int j = Character.getNumericValue(endRange.charAt(0)) - 1;
    
    String s2 = s.substring(Character.getNumericValue(startRange.charAt(1)), Character.getNumericValue(endRange.charAt(1)) );
     
    //while(j <= Character.getNumericValue(endRange.charAt(1))-1){
      for(int i = 0; i<s2.length();i++){

         // '|' = ascii decimal 124
         if((int)s.charAt(i) == 124 ){
            if(barCount!=2){
               barCount++;
            }else  barCount = 0;
            
         } 
         
         // '*' = ascii decimal 42
         else if ((int)s.charAt(i) == 42 && barCount!=2){
            starCount++;
         }
         
         //j++;
         
      }

      result[1] = starCount;
    
    
    
      
      
      return result;

   
   }
   
   


}