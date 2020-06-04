import java.util.*;

public class CheckDigitAndCheckCode{


   public static void main(String[] args){
   
   
      System.out.println(checkDigit("87815811023456421"));
      
      int num = checkDigit("87815811023456421");
      System.out.println(checkCode("87815811023456421",num));

      
   
   
   }



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
         if(i%2==0){
            result+= Character.getNumericValue(num.charAt(i)) * 3;
         }else{
            result+= Character.getNumericValue(num.charAt(i));

         }
      
      
      }
      
      //int roundedNum = Math.round(result/10.0) * 10;
      //Integer.parseInt(num);
      //double preRound = result;
      double roundedNum = Math.ceil(result/10)*10 +10;
      
      System.out.println(roundedNum);
      //int Math.ceil(roundedNum);

      //int k = (int)roundedNum - result;
      //return k;
      
      
      return (int)roundedNum - result;
      //return result;
   
   
   
   }
   
   public static String checkCode(String num, int checkDigit){
   
      int twoDigitCount = 0;
      int sum = 0; 
      int position =0;
      
      String twoDigitString = "";
      
      num = num+Integer.toString(checkDigit);
      
      //char[] ch = num.toCharArray();
      
      //for(int i=0; i<num.length(); i++){
      //for(int i=0; i<ch.length(); i++){
      
      int i =0;
      
      while(position !=8){

      /*
         if(i % 2 == 0 && twoDigitCount == 2){
            twoDigitCount =0;
            sum += Integer.parseInt(twoDigitString);
            sum = sum * (3 + position);
            position++;

         }
         
      */
      
       //if(i % 2 == 0 && twoDigitCount == 2){
       if(twoDigitCount == 2){

            twoDigitCount = 0;
            //twoDigitString = twoDigitString.charAt()
            sum += Integer.parseInt(twoDigitString);
            sum = sum * (3 + position);
            twoDigitString = "";
            position++;
            
         }
            twoDigitString += num.charAt(i);
            twoDigitCount++;
            i++;

      }
      
      sum = (sum+207)/103;
      
      String checkCode = Integer.toString(sum);
      
      
      
      return sum%10 =0 ? Integer.toString(sum)+ ;
   
   
   }



}