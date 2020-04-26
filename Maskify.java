import java.util.*;

public class Maskify {


   public static void main(String[] args){
      
      System.out.println(maskify("4556364607935616"));
      System.out.println(maskify("64607935616"));
      System.out.println(maskify("1"));
      System.out.println(maskify(""));
      System.out.println(maskify("Skippy"));
      System.out.println(maskify("Nananananananananananananananana Batman!"));

   }
   
   /*
      Usually when you buy something, you're asked whether your credit card number, phone number or answer to your most secret question is still correct.
      However, since someone could look over your shoulder, you don't want that shown on your screen. Instead, we mask it.

      Your task is to write a function maskify, which changes all but the last four characters into '#'.
      
      Examples
      Maskify.Maskify("4556364607935616"); // should return "############5616"
      Maskify.Maskify("64607935616");      // should return "#######5616"
      Maskify.Maskify("1");                // should return "1"
      Maskify.Maskify("");                 // should return ""
      
      // "What was the name of your first pet?"
      Maskify.Maskify("Skippy"); // should return "##ippy"
      Maskify.Maskify("Nananananananananananananananana Batman!"); // should return "####################################man!"
   */



    public static String maskify(String str) {
        //throw new UnsupportedOperationException("Unimplemented");
        
        if(str.length()<= 4) return str;
        
        char[] ch = str.toCharArray();
        
        for(int i = 0;i<ch.length-4;i++){
        
            //str.charAt(i) =  str.charAt(i) "#";
            ch[i] = '#';
        }
        
        return String.valueOf(ch);

    }
}
