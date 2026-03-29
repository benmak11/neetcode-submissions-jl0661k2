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
    /**
    Update the targetSum by subtracting root.val from it till we reach zero (we have reached the targetSum)

    our base case from the top will be if root is null return false

    otherwise return hasPathSum(root.left, targetSum) or root.right, targetSum && targetSum == 0 plus is it a leaf node 
    Time O(n) Space is O(h)
    */
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null)
            return false;

        targetSum -= root.val;

        return hasPathSum(root.left, targetSum)
            || hasPathSum(root.right, targetSum)
            || (targetSum == 0 && root.left == null && root.right == null);
    }
}