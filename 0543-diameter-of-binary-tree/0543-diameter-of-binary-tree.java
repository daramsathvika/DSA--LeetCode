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
    int dia;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){return 0;}
        dia = Math.max(maxdepth(root.left)+maxdepth(root.right),Math.max(diameterOfBinaryTree(root.left),diameterOfBinaryTree(root.right)));
        return dia;
    }
    public int maxdepth(TreeNode root){
        if(root==null){return 0;}
        return 1+Math.max(maxdepth(root.left),maxdepth(root.right));
    }
}