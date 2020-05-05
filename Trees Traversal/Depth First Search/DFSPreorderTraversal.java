import java.util.*;
//Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
       this.val = val;
       this.left = left;
       this.right = right;
    }
}

public class DFSPreorderTraversal {

   public static void main(String[] args){
   
        //Input: [1,null,2,3]
        TreeNode tree = new TreeNode(); 
        tree.root = new TreeNode(1); 
        tree.root.left = null;
        tree.root.right = new TreeNode(2); 
        tree.root.right.left = new TreeNode(3); 
        //tree.root.left.left = new Node(4); 
        //tree.root.left.right = new Node(5); 
   
        System.out.println(preorderTraversal(tree)); //[1,2,3]
   
   
   }


    //Pre-order traversal is to visit the root first. Then traverse the left subtree. Finally, traverse the right subtree.
    public static List<Integer> preorderTraversal(TreeNode root) {
        
        if(root == null) return new ArrayList();
        
        List<Integer> list = new ArrayList<>();
        
        TreeNode current = root;
        
        list.add(current.val);
        
        while(current != null){
            
            if(current.left != null){
                list.add(current.val);
                current = current.left;
                
            }
            if(current.right != null){
                list.add(current.val);
                current = current.right;
                
            }
            
            
            /*
            if(root.left != null && root.right != null){
                if(root >= root.left ){
                    
                    list.add(root.left.val);
                    
                }
                
                
            }
            */
            
        }
        
        return list;
        
        
        
        
    }
}