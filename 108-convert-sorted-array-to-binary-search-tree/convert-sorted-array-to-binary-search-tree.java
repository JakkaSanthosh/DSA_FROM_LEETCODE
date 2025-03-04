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
    public TreeNode sortedArrayToBST(int[] nums) {
        return tree(nums,0,nums.length-1);
    }
    static TreeNode tree(int a[],int l,int h){
        if(l>h) return null;
        int m=l+(h-l)/2;
        TreeNode root=new TreeNode(a[m]);
        root.left= tree(a,l,m-1);
        root.right=tree(a,m+1,h);
        return root;
    }
}