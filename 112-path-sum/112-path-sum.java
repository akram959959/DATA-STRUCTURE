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
    public static boolean result(TreeNode top, int target, int temp_sum){
        if(top == null)
            return false;
        if(top.left == null && top.right == null && temp_sum+top.val == target)
            return true;
        return result(top.left,target, temp_sum+top.val)|| 
            result(top.right, target, temp_sum+top.val);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return result(root,targetSum,0);
        
    }
}