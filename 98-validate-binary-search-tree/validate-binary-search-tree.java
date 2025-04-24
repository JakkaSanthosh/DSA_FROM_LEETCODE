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
    static List<Integer> al;
    public boolean isValidBST(TreeNode root) {
        al=new ArrayList<>();
        inorder(root);
        for(int i=1;i<al.size();i++){
            if(al.get(i)<=al.get(i-1)) return false;
        }
        return true;
    }
    static void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        al.add(root.val);
        inorder(root.right);
    }
}