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
        TreeNode tree = new TreeNode(); 
        tree.root = new TreeNode(1); 
        tree.root.left = null;
        tree.root.right = new TreeNode(2); 
        tree.root.left = new TreeNode(3); 
 
        //tree.root.left.left = new Node(4); 
        //tree.root.left.right = new Node(5); 
   
        System.out.println(preorderTraversal(tree)); //[1,3,2]
   
   
   }


    //In-order traversal is to traverse the left subtree first. Then visit the root. Finally, traverse the right subtree.
    public static List<Integer> inorderTraversal(TreeNode root) {
        
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
        
        
        
        
