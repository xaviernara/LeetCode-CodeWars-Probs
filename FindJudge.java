import java.util.*;

public class FindJudge{

    public static void main(String[] args){
    
      int[][] ex1 = {{1,2}};
      int[][] ex2 = {{1,3}, {2,3}};
      int[][] ex3 = {{1,3}, {2,3},{3,1}};
      int[][] ex4 = {{1,3}, {2,3}};
      int[][] ex5 = {{1,3}, {1,4},{2,3},{2,4},{4,3}};
    
      System.out.println(findJudge(2, ex1));
      System.out.println(findJudge(3, ex2));
      System.out.println(findJudge(3, ex3));
      System.out.println(findJudge(3, ex4));
      System.out.println(findJudge(4, ex5));
    }
      /*
         In a town, there are N people labelled from 1 to N.  There is a rumor that one of these people is secretly the town judge.

         If the town judge exists, then:
         
         The town judge trusts nobody.
         Everybody (except for the town judge) trusts the town judge.
         There is exactly one person that satisfies properties 1 and 2.
         You are given trust, an array of pairs trust[i] = [a, b] representing that the person labelled a trusts the person labelled b.
         
         If the town judge exists and can be identified, return the label of the town judge.  Otherwise, return -1.
         
 

         Example 1:
         Input: N = 2, trust = [[1,2]]
         Output: 2
         
         Example 2:
         Input: N = 3, trust = [[1,3],[2,3]]
         Output: 3
         
         Example 3:
         Input: N = 3, trust = [[1,3],[2,3],[3,1]]
         Output: -1
         
         Example 4:
         Input: N = 3, trust = [[1,2],[2,3]]
         Output: -1
         
         Example 5:
         Input: N = 4, trust = [[1,3],[1,4],[2,3],[2,4],[4,3]]
         Output: 3
          
         
         Note:
         
         1 <= N <= 1000
         trust.length <= 10000
         trust[i] are all different
         trust[i][0] != trust[i][1]
         1 <= trust[i][0], trust[i][1] <= N
      */
   
   
   

     //https://www.youtube.com/watch?v=ab-TB2_gsac&feature=youtu.be
    public static int findJudge(int N, int[][] trust) {
        
         // store the trust counts in an array. initialize all counts at zero
        // the array has a length of one more than the population for convenience (person 1's count is index 1 of the array. person 2's count is index 2 of the array, etc.)
        // index zero is a dummy value of 0 and will never be changed
        int[] trustCounts = new int[N+1];
        
        
        // loop over each trust pair in the array
        for(int[] pair : trust){
            trustCounts[pair[0]]--; // the trusting person needs to be decremented by one
            trustCounts[pair[1]]++; // the trusted person needs to be incremented by one
        }
        
        // loop over the trust counts
        for(int i = 1; i < trustCounts.length; i++){
            
            // if there is a person with one less trust count than the population, that person is the judge
            if(trustCounts[i] == N - 1) {
                return i;
            }
        }
        
        // return -1 if there is no judge
        return -1;
    }
}