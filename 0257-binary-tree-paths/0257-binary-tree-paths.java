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
        StringBuffer strl = new StringBuffer("");
        strl.append(root.val);
        paths(root.left,strl,set);
        if(root.left==null&&root.right==null){
            set.add(strl.toString());return set;}
        StringBuffer strr = new StringBuffer("");
        strr.append(root.val);
        paths(root.right,strr,set);
        return set;
    }
    public void paths(TreeNode root,StringBuffer str,List<String> set){
        if(root==null){return;}
        if(root.left==null&&root.right==null){str.append("->");str.append(root.val);set.add(str.toString());return;}
        str.append("->");str.append(root.val);
        StringBuffer strl = new StringBuffer(str);
        paths(root.left,strl,set);
        StringBuffer strr = new StringBuffer(str);
        paths(root.right,strr,set);
    }
}