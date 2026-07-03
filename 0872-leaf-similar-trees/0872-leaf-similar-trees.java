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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if(root1==null||root2==null){return root1==root2;}
        ArrayList<Integer> list1=leaves(root1,new ArrayList<>());
        ArrayList<Integer> list2=leaves(root2,new ArrayList<>());
        if(list1.size()!=list2.size()){return false;}
        for(int i=0;i<list1.size();i++){
            if(!list1.get(i).equals(list2.get(i))){return false;}
        }
        return true;
    }
    public ArrayList<Integer> leaves(TreeNode root,ArrayList<Integer> list){
        if(root==null){return list;}
        if(root.left==null&&root.right==null){list.add(root.val);return list;}
        else{
            leaves(root.left,list);
            leaves(root.right,list);
        }
        return list;
    }
}