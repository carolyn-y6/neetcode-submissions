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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(subRoot == null) return true;
        if(root == null) return false;

        if(isSame(root, subRoot) == true) return true;

        return (isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot));
    }

    public boolean isSame(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null){
            return true;
        }
        if((root1 == null && root2 != null) || (root1 != null && root2 == null)){
            return false;
        }

        if(root1.val == root2.val){ //root1.equals(root2) && 
            return isSame(root1.right, root2.right) && isSame(root1.left, root2.left);
        }
        return false;
    }
}
