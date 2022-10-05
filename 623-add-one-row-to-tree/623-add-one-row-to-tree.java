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
    TreeNode newRoot = null;
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth == 1){
            TreeNode node = new TreeNode(val);
            node.left = root;
            return node;
        }else{
            fun(root, val, depth);
            return newRoot;
        }
        
    }
    
    public void fun(TreeNode root, int val, int depth){
        if(null == root){
            return;
        }
        
        if(null == newRoot){
            newRoot = root;
        }
        
        depth = depth-1;
        
        if(depth == 1){
            TreeNode left = root.left;
            TreeNode right = root.right;
            TreeNode nodeRight = new TreeNode(val);
            TreeNode nodeLeft = new TreeNode(val);
            nodeRight.right = right;
            nodeLeft.left = left;
            root.left = nodeLeft;
            root.right = nodeRight;
            
        }
        
        fun(root.left, val, depth);
        fun(root.right, val, depth);
        
        return;
    }
}