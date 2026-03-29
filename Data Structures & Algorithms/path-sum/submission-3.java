/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) {
 *         this.val = val;
 *     }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        int curr = 0;
        return checkPath(root, targetSum, curr);
    }

    private boolean checkPath(TreeNode root, int k, int curr) {
        if (root == null)
            return false;

        curr += root.val;

        if (root.left == null && root.right == null)
            return curr == k;
        if (checkPath(root.left, k, curr))
            return true;
        if (checkPath(root.right, k, curr))
            return true;

        return false;
    }
}