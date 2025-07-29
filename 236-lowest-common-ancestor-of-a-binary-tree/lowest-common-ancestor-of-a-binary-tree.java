/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null)  return root;
        List<TreeNode> l1 = new ArrayList<>();
        List<TreeNode> l2 = new ArrayList<>();
        l1.add(root);
        l2.add(root);
        findPath(root, p, l1);
        findPath(root, q, l2);
        int cnt = -1;
        for (int i = 0; i < Math.min(l1.size(), l2.size()); i++) {
            if (l1.get(i) == l2.get(i))  cnt++;
            else   break;
        }
        return (cnt == -1) ? null : l1.get(cnt);
    }
    static boolean findPath(TreeNode root, TreeNode ele, List<TreeNode> al) {
        if (root == null)  return false;
        if (root == ele)   return true;
        al.add(root.left);
        if (findPath(root.left, ele, al)) return true;
        al.remove(al.size() - 1);
        al.add(root.right);
        if (findPath(root.right, ele, al)) return true;
        al.remove(al.size() - 1); 
        return false;
    }
}