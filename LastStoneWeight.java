import java.util.*;
import java.util.stream.*;
public class LastStoneWeight{

   public static void main(String[] args){
   
   int[] array= new int[]{2,7,4,1,8,1};
   System.out.println(lastStoneWeight(array));
   
   }
   
   /*
   
      We have a collection of stones, each stone has a positive integer weight.

      Each turn, we choose the two heaviest stones and smash them together.  Suppose the stones have weights x and y with x <= y.  The result of this smash is:

      If x == y, both stones are totally destroyed;
      If x != y, the stone of weight x is totally destroyed, and the stone of weight y has new weight y-x.
      At the end, there is at most 1 stone left.  Return the weight of this stone (or 0 if there are no stones left.)
            
   
      EXAMPLE:
      Input: [2,7,4,1,8,1]
      Output: 1
      Explanation: 
      We combine 7 and 8 to get 1 so the array converts to [2,4,1,1,1] then,
      we combine 2 and 4 to get 2 so the array converts to [2,1,1,1] then,
      we combine 2 and 1 to get 1 so the array converts to [1,1,1] then,
      we combine 1 and 1 to get 0 so the array converts to [1] then that's the value of last stone.
         
   */
   
   
   
   public static int lastStoneWeight(int[] stones) {
        
        if(stones.length == 1) return stones[0];
        if(stones.length == 0|| stones == null) return 0;
        
        
                //new ArrayList<>();

        Arrays.sort(stones);
        
        List<Integer> list = new ArrayList<>();
        //Arrays.stream(stones).collect(Collectors.toList());

        Integer x = stones [stones.length -2];
        Integer y = stones [stones.length -1];
        
        
                
        
        for(int i: stones){
        
         list.add(i);
        
        }
        
        
        if(x<= y){
        
            if(x==y){
            list.remove(x);
            list.remove(y);
            
            
            x=0;
            y=0;
            
            //list.add(y);
           }else{
            list.remove(x);
            list.remove(y);
           
            y = y-x;
            x=0;
            list.add(y);

           }
        
        }
        

        
        //Collections.sort(list); 
        
        System.out.println(list);
        
               
        //list = Arrays.asList(stones);
        //Integer[] array = list.stream().toArray(Integer[]::new);
        int[] arr = list.stream().mapToInt(Integer::intValue).toArray();
        
        return lastStoneWeight(arr);
        

        
        /*
        for(int i = stones.length -1; i<stones.length;i++){
            for(int j =i-1; stones.length;j++){
                
                
                
                
            }
            
            
        }
        */
        
        
        
    }


}