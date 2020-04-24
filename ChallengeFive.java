import java.util.*;

public class ChallengeFive{

   public static void main (String[] args){
   
      String key = "craft";
      
      String[] src = {"minecraft", "intelligent","innercrafttalent", "knife", "scissor", "stonecraft"};
      
      System.out.println(keyInSrcArray(key,src));
      
      
   
   }
   
   
   public static String keyInSrcArray(String key, String[] src){
   
      List<String> list = new ArrayList<>();
      
      for (int i =0; i<src.length;i++){
         if(src[i].contains(key)){
            list.add(src[i]);
         }
      
      }
     
      String[] result = list.toArray(new String[0]);
      
      return Arrays.toString(result);
      
      
   }

}