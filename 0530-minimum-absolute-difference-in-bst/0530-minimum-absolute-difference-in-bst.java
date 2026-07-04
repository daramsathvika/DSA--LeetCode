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
    public int getMinimumDifference(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        dfs(root,list);
        int mad=Integer.MAX_VALUE;
        for(int i=0;i<list.size()-1;i++){
            if(Math.abs(list.get(i+1)-list.get(i))<mad){mad=Math.abs(list.get(i+1)-list.get(i));}
        }
        return mad;
    }
    public void dfs(TreeNode root,List<Integer> list){
        if(root==null){return ;}
        else{
            dfs(root.left,list);
            list.add(root.val);
            dfs(root.right,list);
        }
    }
}