import java.util.*;

public class BinaryGapProblem{

   public static void main(String[] args){
      System.out.println(binaryGap(9)); //example, number 9 has binary representation 1001 and contains a binary gap of length 2.
      System.out.println(binaryGap(529)); //529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3.
      System.out.println(binaryGap(20)); //20 has binary representation 10100 and contains one binary gap of length 1.
      System.out.println(binaryGap(15)); //number 15 has binary representation 1111 and has no binary gaps.
      System.out.println(binaryGap(32)); //number 32 has binary representation 100000 and has no binary gaps.
      System.out.println(binaryGap(328)); //328=101001000 answer = 2
      System.out.println(binaryGap(1162)); // 1162=10010001010 answer = 3
      System.out.println(binaryGap(66561)); // 66561=10000010000000001 answer = 9
      System.out.println(binaryGap(6291457)); //6291457=11000000000000000000001 answer = 20
      System.out.println(binaryGap(74901729)); // 74901729 = 100011101101110100011100001 answer = 4
      System.out.println(binaryGap(1610612737)); //1610612737=1100000000000000000000000000001 answer = 28


      
      
      
      
   }
   
   /*

      A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both ends in the binary representation of N.

      For example, number 9 has binary representation 1001 and contains a binary gap of length 2. 
      The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3. 
      The number 20 has binary representation 10100 and contains one binary gap of length 1. 
      The number 15 has binary representation 1111 and has no binary gaps. 
      The number 32 has binary representation 100000 and has no binary gaps.
      
      Write a function:
      
      class Solution { public int solution(int N); }
      
      that, given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N doesn't contain a binary gap.
      
      For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its longest binary gap is of length 5. 
      Given N = 32 the function should return 0, because N has binary representation '100000' and thus no binary gaps.
      
      Write an efficient algorithm for the following assumptions:
      
      N is an integer within the range [1..2,147,483,647].
   */
   

    public static int binaryGap(int N) {        
        //numbers between 0 and 4 don't have binaray numbers with zero between ones (ie Binary gap) 
        //ex 0 = 0000
        //ex 1 = 0001
        //ex 2 = 0010
        //ex 3 = 0011
        //ex 4 = 0100
        if(N <= 4) return 0;
        
        //TreeSet<Integer> set = new TreeSet<>();
        
        /*
         this list will hold the sequence of the char array that has a binary gap (ex 1001) 
        */
        List<Character> list = new ArrayList<>();
        
        //char will hold the binary representation of N
        char[] ch = Integer.toBinaryString(N).toCharArray();
        
        System.out.println("char array:" + Arrays.toString (ch));
        
        /*
         gapCount = number of 0's between 1's
         
         initially will equal the size of the list  
        
        */ 
        int gapCount = list.size();
        
        //isOne = the beginning of the binary gap sequence in the char array (ie the first 1 in a sequence 1010)
       
        int isOne = 0;
        
        
        /*
        for(int i = 0; i<ch.length; i++){
            
            if(Character.getNumericValue(ch[i]) == 1){
                isOne++;
                System.out.println("isone:" + isOne);
                if(isOne == ch.length) return 0;
                
                /*
                while(isOne != 2){
                    gapCount++;
                    
                    
                    i++;
                    
                }
                
                
               // if()
                
                while(isOne == true){
                    
                }
                 
            }
            
            if (isOne != 2 && i < ch.length-1){
                gapCount++;
                
                
            }//else if (isOne == 2 ){
            else{
                set.add(gapCount);
                gapCount = 0;
                isOne = 0;
            }
        }
        */
         
         for(int i = 0; i<ch.length; i++){
            /*
            if(Character.getNumericValue(ch[i]) == 1){
                isOne++;
                
                while(isOne <=2 && Character.getNumericValue(ch[i]) == 0){
                    gapCount++;
                    
                    if(gapCount == ch.length -1) return 0;
                    
                }
                
                set.add(gapCount);
                gapCount = 0;
                isOne = 0;
                */
             
             
             if(Character.getNumericValue(ch[i]) == 1) isOne++;
                
             //the array is added to the list 
             list.add(ch[i]);
             
             /*
               if isOne == 2 that means that binary gap is found in the array
             */
             if(isOne == 2){
             
               //if lift size is greater than that means that theres a binary gap larger than the previous found binary ga
               if(list.size() > gapCount){
                     gapCount = list.size();
                     
                     //clearing thee list to make room for next binary gap and not mess up the list size 
                     list.clear();
                     isOne = 0;
                  }
               
               }

         }
        System.out.println(list.toString());
        
        //return set.last();
        
        /*
         if gapCount == 0 that means there was no binary gaps sequences in the array
        */
        if(gapCount == 0) return gapCount;
        
        
        /*gapCount = will equal the size of the list after all the 
         sequence of binary gaps have been found in the array and by 
         subtracting 2 the 1's that contributed to the list size

        */
        return gapCount - 2;
        
        
      }
    
}
