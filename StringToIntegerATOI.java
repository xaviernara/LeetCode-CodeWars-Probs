import java.util.*;

public class StringToIntegerATOI{
   
     public static void main (String[] args){
     
     
     System.out.println(myAtoi("42"));//output =42
     System.out.println(myAtoi("   -42"));//output = -42
     System.out.println(myAtoi("4122 with words"));// output = 4122
     System.out.println(myAtoi("words and 987")); //output = 0
     System.out.println(myAtoi("-91283472332")); //output = Integer.MIN_VALUE
     


     
     
     }
     
     
     public static int myAtoi(String str){
     
        String deletedWhiteSpaces = deleteWhiteSpaces(str);
        String deletedCharsString = deleteCharsFromInt(deletedWhiteSpaces);
        
        
        if (!isInRange(deletedCharsString)){
        
         return Integer.MIN_VALUE;
        }
        
        if (Character.isLetter(str.charAt(0))){
         return 0;
        
        }
        
        return Integer.parseInt(deleteCharsFromInt(deletedWhiteSpaces));
        
        
    
     }
     
     
     /*
      If the number is between the 32 bit signed integer range: [-2^31,2^31 -1] 
      its a valid number else its false
     */
     
     public static boolean isInRange(String str){
     
      int num = Integer.parseInt(str);
     
      if( (num >= Integer.MIN_VALUE) && (num <= Integer.MAX_VALUE) ){
           return true;
      }
      
      return false;
     
     }
     
     /*
      Deletes whitespaces from the string 
     
     */
     public static String deleteWhiteSpaces(String str){
     
     /*
     char[] ch = str.toCharArray();
     
      StringBuilder sb = new StringBuilder();
      sb.append(str);
     
      for(int i = 0; i<str.length(); i++){
         if (str[i].equals(' ')){
            //sb.deleteCharAt(sb[i]);
            str-=str[i];
         }
      
      }  
      
      return sb.toString(); 
      */
      
      return str.replaceAll(" ","");
     
     }
     
     /*
      Deletes the chars from the string and returns the ints in the string
     
     
     */
     
     
     public static String deleteCharsFromInt(String str){
     
     /*
         StringBuilder sb = new StringBuilder();
         

         String intString = "";
     
         for(int i =0; i<str.length(); i++){
            if (Character.isLetter(str.charAt(i))){
              //intString += str.charAt(i);
              
              str.replace(str[i],"");
            
            }
         }
       */
         
         //[a-zA-Z] is a regex that matches all upper/lower case chars in the string
         return str.replaceAll("([a-zA-Z])", "");
     
     }

}