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

public class DFSInorderTraversal {

   public static void main(String[] args){
   
        //Input: [1,null,2,3]
        TreeNode tree = new TreeNode(1); 
        //tree = new TreeNode(1); 
        //tree.left = null;
        tree.left.right = new TreeNode(2); 
        tree.right.right.left = new TreeNode(3); 
 
        //tree.root.left.left = new Node(4); 
        //tree.root.left.right = new Node(5); 
   
        System.out.println(inorderTraversalStack(tree)); //[1,3,2]
   
   
   }


    //In-order traversal is to traverse the left subtree first. Then visit the root. Finally, traverse the right subtree.
    public static List<Integer> inorderTraversal(TreeNode root) {
        
        if(root == null) return new ArrayList();
        
        List<Integer> list = new ArrayList<>();
        
        TreeNode current = root;
        
        list.add(current.val);
        
        while(current != null){
        
            /* Reach the left most Node of the 
            curr Node */
            while(current != null){
            
               if(current.left != null){
                   list.add(current.val);
                   current = current.left;
                   
               }
               /*
               if(current.right != null){
                   list.add(current.val);
                   current = current.right;
                   
               }
               */
            
            }
            
            System.out.println(current.val+ " ");
            
            list.add(current.val);
            current = current.right;

            
            
            /*
            if(root.left != null && root.right != null){
                if(root >= root.left ){
                    
                    list.add(root.left.val);
                    
                }
                
             */  
            }
          
            
            return list;
 
            
        }
        
   /*
      Complexity Analysis

      Time complexity : O(n).
      
      Space complexity : O(n).
   
   
   
   */
   
   
   /*
   
   
      1) Create an empty stack S.
      2) Initialize current node as root
      3) Push the current node to S and set current = current->left until current is NULL
      4) If current is NULL and stack is not empty then 
           a) Pop the top item from stack.
           b) Print the popped item, set current = popped_item->right 
           c) Go to step 3.
      5) If current is NULL and stack is empty then we are done.
   
  
   */
   
   

   /*      
                    1
                /   \
              2      3
            /  \
          4     5
      
      Step 1 Creates an empty stack: S = NULL
      
      Step 2 sets current as address of root: current -> 1
      
      Step 3 Pushes the current node and set current = current->left until current is NULL
           current -> 1
           push 1: Stack S -> 1
           current -> 2
           push 2: Stack S -> 2, 1
           current -> 4
           push 4: Stack S -> 4, 2, 1
           current = NULL
      
      Step 4 pops from S
           a) Pop 4: Stack S -> 2, 1
           b) print "4"
           c) current = NULL /*right of 4 * and go to step 3
      Since current is NULL step 3 doesn't do anything. 
      
      Step 4 pops again.
           a) Pop 2: Stack S -> 1
           b) print "2"
           c) current -> 5/*right of 2  and go to step 3
      
      Step 3 pushes 5 to stack and makes current NULL
           Stack S -> 5, 1
           current = NULL
      
      Step 4 pops from S
           a) Pop 5: Stack S -> 1
           b) print "5"
           c) current = NULL /*right of 5  and go to step 3
      Since current is NULL step 3 doesn't do anything
      
      Step 4 pops again.
           a) Pop 1: Stack S -> NULL
           b) print "1"
           c) current -> 3 /*right of 1   
      
      Step 3 pushes 3 to stack and makes current NULL
           Stack S -> 3
           current = NULL
      
      Step 4 pops from S
           a) Pop 3: Stack S -> NULL
           b) print "3"
           c) current = NULL /*right of 3   
      
      Traversal is done now as stack S is empty and current is NULL
         
      */

   public static List < Integer > inorderTraversalStack(TreeNode root) {
        List < Integer > res = new ArrayList < > ();
        Stack < TreeNode > stack = new Stack < > ();
        TreeNode curr = root;
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            res.add(curr.val);
            curr = curr.right;
        }
        return res;
    }
        
        
        
        
        
        
        
        
        
        
        
        
   
   }     
               
        
        
        
