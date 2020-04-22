import java.util.*;

public class Anagrams{

   public static void main (String[] args){
   
   
   
   }
   
   
   public static boolean isAnagram(String s1, String s2){
   
      if(s1.length() != s2.length() ) return false;
            
      char[] c1 = s1.toCharArray();
      char[] c2 = s2.toCharArray();
      
      Arrays.sort(c1);
      Arrays.sort(c2);
      
      if(c1.equals(c2) ) return true;
      
      return false
   }


}