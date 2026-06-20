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
    int ans,k;
    public int kthSmallest(TreeNode root, int k) {
        this.k=k;
        List<Integer> list = new ArrayList<>();
        bfs(root,list);
        return ans;
    }
    public void bfs(TreeNode root,List<Integer> list){
        if(root==null){return ;}
        //if(root.left==null&&root.right==null){list.add(root.val);return;}
        bfs(root.left,list);
        list.add(root.val);
        if(list.size()==k){ans= root.val;return ;}
        bfs(root.right,list);
    }
}