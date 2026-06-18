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
    public boolean hasPathSum(TreeNode root, int target) {
        if(root==null){return false;}
        return pathsum(root,0,target);
    }
    public boolean pathsum(TreeNode root,int sum,int target){
        if(root==null){return target==sum;}
        if(root.left==null&&root.right==null){return sum+root.val==target;}
        if(root.left==null){return pathsum(root.right,sum+root.val,target);}
        else if(root.right==null){return pathsum(root.left,sum+root.val,target);}
        else{
            return pathsum(root.left,sum+root.val,target)||pathsum(root.right,sum+root.val,target);
        }
    }
}