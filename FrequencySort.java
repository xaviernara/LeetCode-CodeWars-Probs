import java.util.*;
import java.util.stream.*;

public class FrequencySort {

   public static void main(String[] args){
   
      System.out.println(frequencySort("tree"));
      System.out.println(frequencySort("cccaaa"));
      System.out.println(frequencySort("Aabb"));      


   
   }


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
    
      //SortByValueComparator sbvc = new SortByValueComparator();
          
      //SortedMap<Character,Integer> map = new TreeMap<>(sbvc);
      Map<Character,Integer> map = new TreeMap<>();
      
      Comparator<Character> comparator = new ValueComparator<Character, Integer>(map);

      
      /*
           LinkedHashMap<Integer, String> sortedMap = 
                   sortedMap.entrySet().stream().
                   sorted(Entry.comparingByValue()).
                   collect(Collectors.toMap(Entry::getKey, Entry::getValue,
                                            (e1, e2) -> e1, LinkedHashMap::new));
     
      */
      for(int i = 0; i<s.length();i++){
         if(map.containsKey(s.charAt(i))){
            map.put( s.charAt(i), map.get(s.charAt(i))+1 );
            //map.put(s.charAt(i),1);
         }
         else{
            //map.put( s.charAt(i), map.get(s.charAt(i)+1));
            map.put(s.charAt(i),1);
         }
      
      }
      
      
      
      String result = ""; 
      for(Map.Entry<Character,Integer> entry: map.entrySet()){
      
         result += repeatString(entry.getKey(), entry.getValue());
         System.out.println(result);
      
      }
      
      //StringBuilder sb = new StringBuilder();
      //sb.append(result);
      
      return result;
      
    
    
        
    }
    //This method will add ch to the string based on its frequency in the given string in frequencySort() method
    //simulates sorting the string by frequency 
    private static String repeatString(Character ch,int count){
       StringBuilder sb = new StringBuilder();
       for (int i = 0; i < count; i++) {
           sb.append(ch);
       }
       return sb.toString();
   }
}

//comparator for sorting map by value
class SortByValueComparator implements Comparator<Map.Entry<Character,Integer>> {

   public int compare(Map.Entry<Character,Integer> e1, Map.Entry<Character,Integer> e2){
   
      if(e1.getValue() > e2.getValue()){
         return 1;
      }
      else if(e1.getValue() == e2.getValue()){
         return 0;
      }         
      
      return -1;
      
      
   
   }



}


//https://www.programcreek.com/2013/03/java-sort-map-by-value/
// a comparator using generic type
class ValueComparator<Key, Value extends Comparable<Value>> implements Comparator<Key>{
 
	Map<Key, Value> map = new HashMap<Key, Value>();
 
	public ValueComparator(Map<Key, Value> map){
		this.map.putAll(map);
	}
 
	@Override
	public int compare(Key s1, Key s2) {
		return -map.get(s1).compareTo(map.get(s2));//descending order
      //return map.get(s1).compareTo(map.get(s2));//ascending order
	
	}
}