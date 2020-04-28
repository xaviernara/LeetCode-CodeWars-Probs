/*

Given an array of strings, group anagrams together. 

Example: 
 Input: { "eat", "tea", "tan", "ate", "nat", "bat" }
 Output: {
    ["ate","eat","tea"],
    ["nat","tan"],
    ["bat"]
}

*/

import java.util.*;

public class LeetCode49
{
  public static void main (String[]args)
  {
    String[]string = {"eat", "tea", "tan", "ate", "nat", "bat"};

    System.out.println(groupAnagrams (string));


  }

/*
  public static List < List < String >> groupAnagrams (String[]strs)
  {

    List < List < String >> list = new ArrayList <> ();
    List < String > list2 = new ArrayList <> ();

    int i = 0;
    int j = 1;


    while (i != strs.length )
      {
      char[] ch1 = new char[]{};
      char[] ch2 = new char[]{}; 
      if(i <= strs.length-1 && j <= strs.length-1){
         ch1 = strs[i].toCharArray ();
         ch2 = strs[j].toCharArray ();

      }

   
    System.out.println(ch1);
    System.out.println(ch2);
   
Arrays.sort (ch1);
Arrays.sort (ch2);



if (Arrays.equals(ch1, ch2) )
 {
   //String match = ch1.toString().replace(",","");

   //list.add(new ArrayList<String>().add(strs[j]));
   list2.add (strs[j]);
   //list2.add(strs[i]);
   if (!list2.contains (strs[i]))
     {
list2.add (strs[i]);
     }

    /*
   if (j < strs.length)
     {
j++;
     }

    

 }
 
 if (j < strs.length){
         j++;
  }

else if (j == strs.length-1)
 {
   i++;
   j = i + 1;
   list.add (list2);
   list2.clear();

 }


      }

    return list;
  }
  */
  
   public static List < List < String >> groupAnagrams (String[]strs){
      Map<String, List<String> >  map = new HashMap<>();
      //List < List < String >> list = new ArrayList<>();
      
      if (strs == null ) return new ArrayList<>();
      
            
      for(String string: strs){
      
         //changes the indiviaual strings into a char array
         char[] ch = string.toCharArray();
         Arrays.sort(ch);
         String sortedWord = String.valueOf(ch);
         
         //if the sorted word isnt in the map then add it the map
         // along with a new ArrayList to hold thise specfic words(ie words that are anagrams of it)
         if(!map.containsKey(sortedWord)){
            map.put(sortedWord, new ArrayList<String>() );
         
         }
         
         //if the sorted word is in the map then get it from the map
         //and then add the word to the ArrayList

         map.get(sortedWord).add(string);
      }
      
      //list.add(map.values());
      
      //return the list of anagrams
      return new ArrayList<>(map.values());
      
      
  
   }

  
  
  
  
  
}