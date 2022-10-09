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
    public boolean findTarget(TreeNode root, int k) {
        
        TreeNode aNode = root, bNode = root;
        while (aNode.left != null) aNode = aNode.left;
        while (bNode.right != null) bNode = bNode.right;
        while (aNode != null && bNode != null && aNode != bNode) {
            int a = aNode.val, b = bNode.val;
            int sum = a + b;
            if (sum == k)
                return true;
            else if (sum < k) {
                // find smallest bigger than k-b
                int complement = k - b;
                if (complement >= b)
                    return false;
                aNode = null;
                TreeNode x = root;
                while (x != null) {
                    if (x.val == complement)
                        return true;
                    else if (x.val < complement)
                        x = x.right;
                    else if (x.val > complement) {
                        aNode = x;
                        x = x.left;
                    }
                }
            } else {
                
                int complement = k - a;
                if (complement <= a)
                    return false;
                bNode = null;
                TreeNode x = root;
                while (x != null) {
                    if (x.val == complement)
                        return true;
                    else if (x.val > complement)
                        x = x.left;
                    else {
                        bNode = x;
                        x = x.right;
                    }
                }
            }
        }
        return false;
        
    }
}