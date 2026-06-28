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
        List<List<Integer>> set = new ArrayList<>();
        if(root==null){return set;}
        else if(root.left==null&&root.right==null){
            List<Integer> list = new ArrayList<>();
            list.add(root.val);set.add(list);
            return set;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int k=q.size();
            for(int i=0;i<k;i++){
                TreeNode out = q.poll();
                list.add(out.val);
                if(out.left!=null){q.offer(out.left);}
                if(out.right!=null){q.offer(out.right);}
            }
            set.add(list);
        }
        return set;
    }
}