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
   
        System.out.println(preorderTraversalStack(tree)); //[1,2,3]
   
   
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
    
    /*
    
          /**
     * The goal is to maintain a stack of nodes to visit as we traverse 
     * down through the tree. The stack should always have the left nodes
     * on top so they can be processed first.
     *           1
     *         /   \
     *        2     3    preorder traversal: 1 -> 2 -> 4 -> 5 -> 3 -> 6
     *       / \   /     (root -> left -> right)
     *      4   5 6
    */
    
    public static List<Integer> preorderTraversalStack(TreeNode root) {
    
     List<Integer> list = new ArrayList<>();
        
        if (root == null) {
            return list;
        }
        
        Stack<TreeNode> nodeStoreStack = new Stack<>();
        nodeStoreStack.push(root);

        while (!nodeStoreStack.isEmpty()) {
            TreeNode current = nodeStoreStack.pop();
            list.add(current.val);

            if (current.right != null) {
                nodeStoreStack.push(current.right);
            }
            if (current.left != null) {
                nodeStoreStack.push(current.left);
            }
        }
        return list;
    
    
    }
    
    
    
}