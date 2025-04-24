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
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        int leftdepth=minDepth(root.left);
        int rightDepth=minDepth(root.right);
        if(rightDepth==0) return leftdepth+1;
        else if( leftdepth==0) return rightDepth+1;
        return Math.min(leftdepth,rightDepth)+1;
    }
}