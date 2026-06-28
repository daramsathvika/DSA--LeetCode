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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> set = new ArrayList<>();
        Deque<TreeNode> deq = new LinkedList<>();
        if(root==null){return set;}
        else if(root.left==null&&root.right==null){
            List<Integer> list = new ArrayList<>();
            list.add(root.val);set.add(list);return set;
        }
        deq.offerFirst(root);int count=0;
        while(!deq.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int k = deq.size();
            for(int i=0;i<k;i++){
                if(count%2==1){
                    TreeNode pop = deq.pollFirst();
                    list.add(pop.val);
                    if(pop.right!=null){deq.offerLast(pop.right);}
                    if(pop.left!=null){deq.offerLast(pop.left);}
                }
                else{
                    TreeNode pop = deq.pollLast();
                    list.add(pop.val);
                    if(pop.left!=null){deq.offerFirst(pop.left);}
                    if(pop.right!=null){deq.offerFirst(pop.right);}
                }
            }
            set.add(list);
            count++;
        }
        return set;
    }
}