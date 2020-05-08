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

public class DFSPostorderTraversal {

   public static void main(String[] args){
   
       // Input: [1,null,2,3]
   
        TreeNode tree = new TreeNode(); 
        tree.root = new TreeNode(1); 
        tree.root.left = null;
        tree.root.right = new TreeNode(2); 
        tree.root.right.left = new TreeNode(3); 
        //tree.root.left.left = new Node(4); 
        //tree.root.left.right = new Node(5); 
   
        System.out.println(postorderTraversalStack(tree)); //[3,2,1]
   
   
   }


    //Post-order traversal is to traverse the left subtree first. Then traverse the right subtree. Finally, visit the root.    
    
    public static List<Integer> postorderTraversal(TreeNode root) {
        
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
    
    
    //Post-order traversal is to traverse the left subtree first. Then traverse the right subtree. Finally, visit the root.
    //Pop from stack only when the node at peek doesn't have left and right child or the last node popped was one of the child of node at peek of stack.
    public List<Integer> postorderTraversalStack(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root==null)
            return res;
        Stack<TreeNode> s = new Stack<>();
        s.push(root);
        TreeNode prev=new TreeNode(-1);
        while(!s.isEmpty()){
            TreeNode temp = s.peek();
            if((temp.left==null && temp.right==null) || (temp.left==prev || temp.right==prev)){
                prev = s.pop();
                res.add(temp.val);
                continue;
            }
            if(temp.right!=null)
                s.push(temp.right);
            if(temp.left!=null)
                s.push(temp.left);
        }
        return res;
    
}