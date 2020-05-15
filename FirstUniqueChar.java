import java.util.*;

public class FirstUniqueChar {


    public static void main(String[] args){
      
      System.out.println(firstUniqChar("leetcode"));
      System.out.println(firstUniqChar("loveleetcode"));
      System.out.println(firstUniqChar("ccc"));
      System.out.println(firstUniqChar(""));
      System.out.println(firstUniqChar("l"));
    
    }


    public static int firstUniqChar(String s) {
        
        if(s.equals("") || s == null ){
            return -1;
        }
        
        Map<Character,Integer> map = new LinkedHashMap<>();
        
        for(int i = 0; i<s.length(); i++){
            
            if(!map.containsKey(s.charAt(i))){
                //map.put(s.charAt(i), map.get(s.charAt(i)+1));
                
                map.put(s.charAt(i),1);
                
            }else{
                //map.put(s.charAt(i),1);
                
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
                
            }
            
        }
        
        //Set<Character> set = map.keySet();
        System.out.println("map:" +map.toString());
        
        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            
            if(entry.getValue() == 1){
                return s.indexOf(entry.getKey());
            }
            
            
            
            
        }
        
        //return s.indexOf(set.get(s.charAt(0)));
            
            
        
        return -1;
        
        
    }
}