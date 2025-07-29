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
    public boolean checkTree(TreeNode root) {
        if(root == null){
            return true;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            int sum = 0;

            if(curr.left != null){
                sum += curr.left.val;
                q.add(curr.left);
            }

            if(curr.right != null){
                sum += curr.right.val;
                q.add(curr.right);
            }

            // check checksum property
            if((curr.left != null || curr.right != null) && (curr.val != sum)){
                return false;
            }
        }
        return true;
    }
}