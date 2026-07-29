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
    int ans=0;
    int height=0;
    public int findBottomLeftValue(TreeNode root) {
        ans=root.val;
        leftmost(root,0);
        return ans;
    }
    public void leftmost(TreeNode root,int depth){
        if(root==null){return ;}
        if(depth>height){height=depth;ans=root.val;}
        leftmost(root.left,depth+1);
        leftmost(root.right,depth+1);
    }
}