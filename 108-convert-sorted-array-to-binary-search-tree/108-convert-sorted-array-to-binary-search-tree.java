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
     private TreeNode constructBST(int[] nums, int left, int right) {
        if(right < left) {
            return null;
        }
        
        // Root will have the middle value
        int midIndex = left + (right - left) / 2;
        int rootVal = nums[midIndex];
        TreeNode root = new TreeNode(rootVal);
        
        // Construct left side BST
        root.left = constructBST(nums, left, midIndex - 1);
        
        // Construct right side BST
        root.right = constructBST(nums, midIndex + 1,right);
        
        return root;
    }
    
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root = null;
        int n = nums.length; 
        
        if(nums == null || n == 0) {
            return root;
        }
        
        root = constructBST(nums, 0, n - 1);
        
        return root;
    }
}