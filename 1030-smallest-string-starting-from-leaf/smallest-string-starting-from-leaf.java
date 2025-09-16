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
    public String smallestFromLeaf(TreeNode root) {
        if (root == null)
            return "";
        return dfs(root, "");
    }

    static String dfs(TreeNode root, String path) {
        if (root == null)
            return "~";
        path = ((char) (root.val + 97)) + path;
        if (root.left == null && root.right == null)
            return path;
        String l = dfs(root.left, path);
        String r = dfs(root.right, path);
        if (l.compareTo(r) < 0)
            return l;
        return r;
    }
}