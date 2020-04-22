
 //Definition for a binary tree node.
class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }
 
public class SortedArrayToBST{


    public TreeNode sortedArrayToBST(int[] nums) {
        
        if(nums.length == 0) return null;
            
        Arrays.sort(nums);
        
        TreeNode node = new TreeNode(nums[0]);
        
        for(int i: nums){
            
            if(i <= node.val) node.left.val = i;
            else if(i >= node.val) node.right.val =i;
            
        }
        
        return node;
        
    }
}