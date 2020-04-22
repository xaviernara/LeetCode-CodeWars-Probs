import java.util.*;

public class AreSame {


	
	public static boolean comp(int[] a, int[] b) {
    if(a.length == 0 || b.length == 0 ||a.length > b.length ||b.length > a.length )return false;
    
    for(int i = 0;i<a.length;i++){
      for (int j=0;j<b.length;j++){
      
        if(i % j/i != 0) return false;
      
      }
    
    }
      
  
    return true;
  }
}