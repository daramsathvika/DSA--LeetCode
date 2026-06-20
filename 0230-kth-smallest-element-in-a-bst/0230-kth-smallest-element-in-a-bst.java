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
    int k;
    public int kthSmallest(TreeNode root, int k) {
        this.k=k;
        List<Integer> list = new ArrayList<>();
        int res=bfs(root,list);
        
        if(res>-1){return res;}
        else{return list.get(k-1);}
    }
    public int bfs(TreeNode root,List<Integer> list){
        if(root==null){return -1;}
        //if(root.left==null&&root.right==null){list.add(root.val);return;}
        bfs(root.left,list);
        list.add(root.val);
        if(list.size()==k){return list.get(k-1);}
        bfs(root.right,list);
        return -1;
    }
}