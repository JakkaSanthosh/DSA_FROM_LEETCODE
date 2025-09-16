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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null)
            return false;
        return dfs(root, targetSum, 0);
    }

    static boolean dfs(TreeNode root, int k, int sum) {
        if (root == null)
            return false;
        sum += root.val;
        if (sum == k && root.left == null && root.right == null)
            return true;
        if (dfs(root.left, k, sum))
            return true;
        if (dfs(root.right, k, sum))
            return true;
        sum -= root.val;
        return false;
    }
}