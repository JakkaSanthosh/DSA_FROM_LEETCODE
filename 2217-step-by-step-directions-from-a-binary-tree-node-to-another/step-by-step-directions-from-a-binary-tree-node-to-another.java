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
    public String getDirections(TreeNode root, int startValue, int destValue) {
        if(root==null) return "";
        List<Character> src=new ArrayList<>();
        findPath(root,src,startValue);
        List<Character> dest=new ArrayList<>();
        findPath(root,dest,destValue);
        int min=Math.min(src.size(),dest.size());
        int cnt=0;
        for(int i=0;i<min;i++){
            if(src.get(i)==dest.get(i)) cnt++;
            else break;
        }
      StringBuilder sb=new StringBuilder();
      for(int i=0;i<src.size()-cnt;i++) sb.append("U");
      for(int i=cnt;i<dest.size();i++) sb.append(dest.get(i));
      return sb.toString();
    }
    static boolean findPath(TreeNode root,List<Character> al,int k){
        if(root==null) return false;
        if(root.val==k) return true;
            al.add('L');
            if(findPath(root.left,al,k)) return true;
            al.remove(al.size()-1);                                                          
            al.add('R');
            if(findPath(root.right,al,k)) return true;
            al.remove(al.size()-1); 
        return false;
    }
}