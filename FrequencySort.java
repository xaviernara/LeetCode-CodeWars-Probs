import java.util.*;

public class FrequencySort {


   /*
   
   
   Given a string, sort it in decreasing order based on the frequency of characters.

      Example 1:
      
      Input:
      "tree"
      
      Output:
      "eert"
      
      Explanation:
      'e' appears twice while 'r' and 't' both appear once.
      So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
      Example 2:
      
      Input:
      "cccaaa"
      
      Output:
      "cccaaa"
      
      Explanation:
      Both 'c' and 'a' appear three times, so "aaaccc" is also a valid answer.
      Note that "cacaca" is incorrect, as the same characters must be together.
      Example 3:
      
      Input:
      "Aabb"
      
      Output:
      "bbAa"
      
      Explanation:
      "bbaA" is also a valid answer, but "Aabb" is incorrect.
      Note that 'A' and 'a' are treated as two different characters.
            
  */


    public static String frequencySort(String s) {
    
      Map<Character,Integer> map = new LinkedHashMap<>();
      
      for(int i = 0; i<s.length();i++){
      
      }
    
    
        
    }
    
    private static String repeatString(String s,int count){
    StringBuilder r = new StringBuilder();
    for (int i = 0; i < count; i++) {
        r.append(s);
    }
    return r.toString();
}
}