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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return dfs(root, p, q);
    }

    public TreeNode dfs(TreeNode cur, TreeNode p, TreeNode q){
        if(cur == null) return null;

        int pVal = p.val;
        int qVal = q.val;
        int curVal = cur.val;

        if(pVal == curVal || qVal == curVal) return cur;

        if((pVal < curVal && qVal > curVal) || (pVal > curVal && qVal < curVal)) return cur;
        if(pVal < curVal && qVal < curVal) return dfs(cur.left, p, q);
        if(pVal > curVal && qVal > curVal) return dfs(cur.right, p, q);
        return null;
    }
}
