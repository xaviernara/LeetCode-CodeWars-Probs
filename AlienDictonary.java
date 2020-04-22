import java.util.*;

public class AlienDictonary{

   //leetcode prob 953
   /*
   
      In an alien language, surprisingly they also use english lowercase letters, but possibly in a different order. 
      The order of the alphabet is some permutation of lowercase letters.

      Given a sequence of words written in the alien language, and the order of the alphabet, 
      return true if and only if the given words are sorted lexicographicaly in this alien language.
   */
   
   
   
   
   // array that holds alien alphabet 
   static int[] dict = new int [26];
   
   
   public static void main(String[] args){
   
   /*
      Ex1: 
      
      output: true
      Explanation: As 'h' comes before 'l' in this lanaguage then the sequence is sorted.
   */
   String[] words = {"hello", "leetcode"};
   String order = "hlabccdefghijkmnopqrstuvwxyz";
   
   /*
      Ex2: 
      
      output: false
      Explanation: As 'd' comes before 'l' in this lanaguage, then words[0] > words[1] sequence is unsorted.
   */

   String[] words2 = {"word", "world", "row"};
   String order2 = "worldabcdefghijkmnopqrstuvwxyz";
   
   
     /*
      Ex3: 
      
      output: false
      Explanation: The first three characters "app" match, and the second string is shorter(in size)
                   According to lexicographical rules "apple" > "app", because 'l' > 'phy', where 'phy' is defined as 
                   the blank character which is less than any other charcter  
     */
   String[] words3 = {"apple", "app"};
   String order3 = "abcdefghijkmnopqrstuvwxyz";
   
   
   System.out.println("Ex 1: " + isAlienSorted(words,order));
   System.out.println("Ex 2: " + isAlienSorted(words2,order2));
   System.out.println("Ex 3: " + isAlienSorted(words3,order3));
   
   }
   
   public static boolean isAlienSorted(String[] words, String order){
      
      for(int i=0; i<order.length(); i++){
         char c = order.charAt(i);
         
         //c - 'a' refers to a character in the order string minus the ASCII value of 'a' (1st letter in the alphabet) 
         int aschiiValue = c -'a';
         dict[aschiiValue] = i;
      }
      
      System.out.println(Arrays.toString(dict));
      if(words.length <= 1) return true;
      
      for(int i=1; i<words.length; i++){
         if(!order(words[i-1], words[i]) ) return false;
       
      }
       
       return true;

   }
   
   
   public static boolean order(String one, String two){
      boolean sameChar = true;
      
      for(int i =0; i< one.length() && i<two.length(); i++){
      
         char o = one.charAt(i);
         char t = two.charAt(i);
         
         //if the charcters in strings match then continue until they dont
         if(o == t) continue;
         if(o != t) sameChar = false;
         
         if(!sameChar){
         
            //
            return dict[o -'a'] < dict[t - 'a'] ? true : false;
         
         }

         
      
      
      }
      
      if(one.length() > two.length() ) return false;
      
      return true;
   
   
   
   }
   































}