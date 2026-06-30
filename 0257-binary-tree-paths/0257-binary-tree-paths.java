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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> set = new ArrayList<>();
        if(root==null){return set;}
        StringBuilder strl = new StringBuilder("");
        strl.append(root.val);
        paths(root.left,strl,set);
        if(root.left==null&&root.right==null){
            set.add(strl.toString());return set;}
        StringBuilder strr = new StringBuilder("");
        strr.append(root.val);
        paths(root.right,strr,set);
        return set;
    }
    public void paths(TreeNode root,StringBuilder str,List<String> set){
        if(root==null){return;}
        if(root.left==null&&root.right==null){str.append("->");str.append(root.val);set.add(str.toString());return;}
        str.append("->");str.append(root.val);
        StringBuilder strl = new StringBuilder(str);
        paths(root.left,strl,set);
        StringBuilder strr = new StringBuilder(str);
        paths(root.right,strr,set);
    }
}