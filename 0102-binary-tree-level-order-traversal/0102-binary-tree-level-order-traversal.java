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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        levOrd(ans,root,0);
        return ans;
    }
    public void levOrd(List<List<Integer>> ans,TreeNode root,int i){
        if(root==null){return;}
        if(ans.size()<=i||ans.size()==0){
            List<Integer> list = new ArrayList<>();
            list.add(root.val);
            ans.add(list);
        }
        else{
            List<Integer> listati = ans.get(i);
            listati.add(root.val);
            ans.set(i,listati);
        }
        levOrd(ans,root.left,i+1);
        levOrd(ans,root.right,i+1);
    }
}