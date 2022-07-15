/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root =new TreeNode( preorder[0]);
        
        for(int i=1; i<preorder.length; i++){
            root= Aux(preorder[i], root);
        }
        
        return root;
    }
    
    private TreeNode Aux(int num, TreeNode rootAux){
        if(rootAux!=null){
            if(num<rootAux.val){
                rootAux.left = Aux(num, rootAux.left);
            }else{
                rootAux.right = Aux(num, rootAux.right);
            }
            return rootAux;
        }else{
           return new TreeNode(num); 
        }
    }
}
