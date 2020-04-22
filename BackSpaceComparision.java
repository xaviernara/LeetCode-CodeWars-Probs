import java.util.*;

public class BackSpaceComparision{

   public static void main(String[] args){
   
   System.out.println(backSpaceCompare("ab#c", "ad#c")); 
   //System.out.println(backSpaceCompare("ab##", "c#d#"));
   //System.out.println(backSpaceCompare("a##c", "#a#c"));
   //System.out.println(backSpaceCompare("a#c", "b"));
   


   
   
   
   
   
   }
   
   public static boolean backSpaceCompare(String S, String T){
   
      if(S == "" || T == "") return false;
      
      char c1 = S.charAt(S.indexOf("#")-1);
      S = S.replace(c1, "");
      S = S.replace("#", "");

      
      
      S = S.substring(S.indexOf("#"),S.lastIndexOf("#") );
      
      System.out.println(S);
      
      return true;
   
   
   }



}