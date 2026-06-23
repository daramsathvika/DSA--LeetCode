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
    public boolean isValidBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root==null){return true;}
        else if(root.left==null&&root.right==null){return true;}
        return isvalid(root,list);
    }
    public boolean isvalid(TreeNode root,List<Integer> list){
        if(root==null){return true;}
        if(root.left==null&&root.right==null){
            if(list.size()>0&&list.get(list.size()-1)>=root.val){return false;}
            else{list.add(root.val);return true;}
        }
        boolean one=isvalid(root.left,list);
        if(list.size()>0&&list.get(list.size()-1)>=root.val){return false;}
        else{list.add(root.val);}
        boolean two=isvalid(root.right,list);
        return one&&two;

    }
}