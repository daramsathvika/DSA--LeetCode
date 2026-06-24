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
    public void flatten(TreeNode root) {
        if(root==null){return;}
        if(root.left==null&&root.right==null){return;}
        else if(root.right==null){
            root.right=root.left;
            root.left=null;}
        TreeNode next = root.right;
        root.right=null;
        flatten(root.left);
        if(next!=null){flatten(next);}
        root.right=root.left;
        root.left=null;
        while(root.right!=null){root=root.right;}
        root.right=next;
        return;
    }
}