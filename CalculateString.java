import java.util.*;

public class CalculateString{

   public static void main(String[] args){
   
      System.out.println(calculateString("gdfgdf234dg54gf/23oP42"));
   
   
   }
   /*
      Input: String which consists of two positive numbers (doubles) and exactly one operator like +,-,*,/, always between these numbers. 
      The string is dirty, which means that there are different characters inside too, not only numbers and the operator. 
      You have to combine all digits left and right, perhaps with "." inside (doubles) and to calculate 
      the result which has to be rounded to an integer and converted to a string at the end.

      Easy example:
      
      Input: "gdfgdf234dg54gf*23oP42"
      Output: "54929268" (because 23454*2342=54929268)
   */
   
   public static String calculateString(String calcIt) {
   
       //[a-zA-Z] is a regex that matches the first captial and lowercase letters in a string
       //[a-zA-Z]+ matches all captial and lowercase letters in a string
       //replaceAll is used to replace multiple matches of the regex
       String result = calcIt.replaceAll("[a-zA-Z]+","");
       
       double num1 =0;
       double num2 =0;
       
       /*
       swtich(result){
         case result.contains("+") :
               result = result.replace("+","");
               String[] s = result.split("+");
               num1 = s[0];
               num2 = s[1];
               result = String.valueOf(num1+num2);
               break;
          case result.contains("-") :
               result = result.replace("-","");
               String[] s = result.split("-");
               num1 = s[0];
               num2 = s[1];
               result = String.valueOf(num1-num2);
               break;
          case result.contains("*") :
               result = result.replace("*","");
               String[] s = result.split("*");
               num1 = s[0];
               num2 = s[1];
               result = String.valueOf(num1*num2);
               break;  
          case result.contains("/") :
               result = result.replace("/","");
               String[] s = result.split("/");
               num1 = s[0];
               num2 = s[1];
               result = String.valueOf(num1/num2);
               break;  

       
       
       }
       */
       
       String[] s;
       
       System.out.println(result);
       if(result.contains("+")){
         //result = result.replace("+","");
               s = result.split("\\+");
               num1 = Double.parseDouble(s[0]);
               num2 = Double.parseDouble(s[1]);
               result = String.valueOf(num1+num2);
       }
       else if(result.contains("-")){
         //result = result.replace("-","");
               s = result.split("\\-");
               num1 = Double.parseDouble(s[0]);
               num2 = Double.parseDouble(s[1]);
               result = String.valueOf(num1-num2);
       }
       else if(result.contains("*")){
         //result = result.replace("*","");
            //System.out.println("Result after replace" + result);
            
            
               /*
                  the problem is that * is a reserved character in regexes, so you need to escape it.
                  No, the problem is that * is a reserved character in regexes, so you need to escape it. 
                  * means "zero or more of the previous expression"
                  
                  and you weren't giving it any previous expression, making your split expression illegal. 
                  
                  This is why the error was a PatternSyntaxException.
                  
                  It happens for all special characters that have some meaning in a regex. So you need to have "\\" as a prefix to your regex.
                  
               */
                  
               s = result.split("\\*");
               
               num1 = Double.parseDouble(s[0]);
               num2 = Double.parseDouble(s[1]);
               result = String.valueOf(num1*num2);

       }else {
         //result = result.replace("/","");
               s = result.split("/");
               num1 = Double.parseDouble(s[0]);
               num2 = Double.parseDouble(s[1]);
               result = String.valueOf(num1/num2);

       }
       
       
       
             
       

       return result;
    }   
}