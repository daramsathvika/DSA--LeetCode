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
    public boolean isSymmetric(TreeNode root) {
        if(root==null){return true;}
        else if(root.left==null||root.right==null){return root.left==null&&root.right==null;}
        if(root.left.val!=root.right.val){return false;}
        return isit(root.left,root.right);
    }
    public boolean isit(TreeNode leftn,TreeNode rightn){
        if(leftn==null||rightn==null){return leftn==rightn;}
        return isit(leftn.left,rightn.right)&&isit(leftn.right,rightn.left)&&leftn.val==rightn.val;
    }
}