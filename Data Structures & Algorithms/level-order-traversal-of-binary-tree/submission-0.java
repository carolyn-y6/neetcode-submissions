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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> arr = new ArrayList<>();
        dfs(root, arr, 0);
        return arr;
    }

    public void dfs(TreeNode root, List<List<Integer>> levels, int depth) {
        if(root == null) {
            return;
        }

        if (levels.size() == depth) {
            levels.add(new ArrayList<>());
            levels.get(depth).add(root.val);
        } else {
            List<Integer> arr  = levels.get(depth);
            arr.add(root.val);
        }

        dfs(root.left, levels, depth + 1);
        dfs(root.right, levels, depth + 1);
    }

}
