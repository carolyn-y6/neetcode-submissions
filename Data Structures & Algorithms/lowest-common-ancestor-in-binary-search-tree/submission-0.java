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
        Stack<TreeNode> stackp = new Stack<>();
        Stack<TreeNode> stackq = new Stack<>();

        find(root, stackp, p);
        find(root, stackq, q);
        
        if(stackp.size() > stackq.size()){
            int diff = stackp.size() - stackq.size();

            for(int i = 0; i < diff; i++){
                stackp.pop();
            }
        } else if (stackp.size() < stackq.size()){
            int diff = stackq.size() - stackp.size();

            for(int i = 0; i < diff; i++){
                stackq.pop();
            }
        }

        while(stackq.peek() != stackp.peek()){
            stackq.pop();
            stackp.pop();
        }
        return stackq.peek();
    }

    public boolean find(TreeNode root, Stack<TreeNode> stack, TreeNode target){
        if(root == null){
            return false;
        }

        stack.push(root);

        if(root.val == target.val){
            return true;
        }

        boolean stackleft = find(root.left, stack, target);
        boolean stackright = find(root.right, stack, target);

        if(stackleft){
            return true;
        } else if (stackright){
            return true;
        }
        
        stack.pop();
        return false;
    }
}
