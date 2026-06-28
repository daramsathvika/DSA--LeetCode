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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        Queue<TreeNode> q= new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int k = q.size();double sum=0;
            for(int i = 0;i<k;i++){
                TreeNode pop = q.poll();
                sum+=pop.val;
                if(pop.left!=null){q.offer(pop.left);}
                if(pop.right!=null){q.offer(pop.right);}
            }
            sum=sum/k;
            list.add(sum);
        }
        return list;
    }
}