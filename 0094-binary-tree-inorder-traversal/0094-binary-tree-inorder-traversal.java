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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root==null){return list;}
        if(root.left==null&&root.right==null){list.add(root.val);return list;}
        Stack<TreeNode> s = new Stack<>();
        s.push(root);
        while(!s.isEmpty()){
            TreeNode main =s.pop();
            if(main.left==null&&main.right==null){list.add(main.val);}
            else{
                TreeNode leftbranch=main.left;
                TreeNode rightbranch=main.right;
                main.left=null;main.right=null;
                if(rightbranch!=null){s.push(rightbranch);}
                if(main!=null){s.push(main);}
                if(leftbranch!=null){s.push(leftbranch);}
            }
        }
        return list;
    }
}