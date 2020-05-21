import java.io.*;
import java.util.*;

class SortByStringLength {
	public static void main (String[] args) {
		System.out.println("Hello Java");
    String[] ex = new String[]{"programming", "simply", "rocks"};
    
    maxLengthSort(ex);
    
	}
  
  public static void maxLengthSort(String[] stringArray ){
    
    //int length = stringArray[0].length();
    
    /*
    for(int i =0; i<stringArray.length;i++ ){
      
      for(int j = stringArray.length-1; j>0;j--){
        if(stringArray[i].length() <= stringArray[j].length()){
        //length = stringArray[i].length();
          String temp = stringArray[i];
          String temp2 = stringArray[j];
          stringArray[i] = temp2;
          stringArray[j] = temp;
        }
      }

    }
    System.out.println(Arrays.toString(stringArray));
    */
    
    TreeMap<Integer,String> map = new TreeMap<>();
    
    for(String s: stringArray){
      if(!map.containsKey(s.length()) ){
         map.put(s.length(),s);
      }
      else {
         map.put(s.length(),s);
      }
    }
    
    System.out.println("Sorted list of words by lowest to greastes length:  "+map.values());
    
    
  }
}