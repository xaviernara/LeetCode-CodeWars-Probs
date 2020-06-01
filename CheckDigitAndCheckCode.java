import java.util.*;

public class CheckDigitAndCheckCode{



   /*
      input: 87815811023456421
   
      checkDigit: 136 -140 = 4
   
      checkCode: (87 * 3+0)+(81* 3+1)+(58* 3+2)+(11* 3+3)+(02* 3+4)+(34* 3+5)+(56* 3+6)+(42* 3+7)+(14* 3+8)
                  +207/103
      4.40
      
      output: 4.40
   
   
   */

   public static int checkDigit(String num){
   
      int result = 0;
      
      for(int i = 0; i<num.length();i++){
         if(i%2=0){
            result+= Character.getNumericalValue(num.charAt(i));
         }else{
            result+= Character.getNumericalValue(num.charAt(i));

         }
      
      
      }
      
      int roundedNum = Math.round(result/10.0) * 10;
      //Integer.parseInt(num);
      
      
      return roundedNum;
      
      
   
   
   
   }
   
   public static double checkCode(String num){
   
   }



}