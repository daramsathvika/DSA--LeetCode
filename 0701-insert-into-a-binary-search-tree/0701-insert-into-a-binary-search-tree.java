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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null){return new TreeNode(val,null,null);}
        if(root.val>val){
            if(Max(root.left)<val){
                TreeNode temp = root.left;
                root.left=new TreeNode(val,temp,null);
            }
            else{
                if(root.left==null){root.left=new TreeNode(val);return root;}
                else{insertIntoBST(root.left,val);}
            }
        }
        else{
            if(Min(root.right)>val){
                TreeNode temp = root.right;
                root.right=new TreeNode(val,null,temp);
            }
            else{
                if(root.right==null){root.right=new TreeNode(val);return root;}
                else{insertIntoBST(root.right,val);}
            }
        }
        return root;
    }
    public int Max(TreeNode root){
        if(root==null){return 0;}
        if(root.left==null&&root.right==null){return root.val;}
        else{
            while(root.right!=null){root=root.right;}
            return root.val;
        }
    }
    public int Min(TreeNode root){
        if(root==null){return 0;}
        if(root.left==null&&root.right==null){return root.val;}
        else{
            while(root.left!=null){root=root.left;}
            return root.val;
        }
    }
}