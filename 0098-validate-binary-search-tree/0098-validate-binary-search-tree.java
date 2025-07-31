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
    public boolean isValidBST(TreeNode root) {
        // we have to create a stack for pushing the currently visited elements
        Stack<TreeNode> s = new Stack<>();

        //pop out the element to traverse
        TreeNode curr = root;
        Integer prev = null;// initially there is no prev element

        while(!s.isEmpty() || curr != null){
            while(curr != null){
                s.push(curr);
                curr = curr.left;
            }
            curr = s.pop();
            if(prev != null && curr.val <= prev){
                return false;
            }

            prev = curr.val;
            curr = curr.right;
        }

    return true;

    }
}