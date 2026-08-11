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
    public int height(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        if(left == -10 || right == -10){
            return -10;
        }
        left++;
        right++;
        if(Math.abs(left - right) <= 1){
            return Math.max(left, right);
        } else {
            return -10;
        }
    }
    public boolean isBalanced(TreeNode root) {
        int num = height(root);
        if(num == -10){
            return false;
        }
        return true;
    }
}
