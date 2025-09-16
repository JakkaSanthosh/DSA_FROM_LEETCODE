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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if (root == null)
            return new ArrayList<>();
        List<List<Integer>> outer = new ArrayList<>();
        List<Integer> inner = new ArrayList<>();
        dfs(root, targetSum, 0, inner, outer);
        return outer;
    }

    static void dfs(TreeNode root, int k, int num, List<Integer> inner, List<List<Integer>> outer) {
        if (root == null)
            return;
        inner.add(root.val);
        num = num + root.val;
        if (root.left == null && root.right == null && num == k) {
            outer.add(new ArrayList<>(inner));
        } else {
            dfs(root.left, k, num, inner, outer);
            dfs(root.right, k, num, inner, outer);
        }
        inner.remove(inner.size() - 1);
    }
}