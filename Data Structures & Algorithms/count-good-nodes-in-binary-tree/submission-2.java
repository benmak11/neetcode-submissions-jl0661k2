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
    public int goodNodes(TreeNode root) {
        return count(root, root.val);
    }

    private int count(TreeNode node, int value) {
        if (node == null) return 0;

        int good = (node.val >= value) ? 1 : 0;
        int next = Math.max(node.val, value);

        return good + count(node.left, next) + count(node.right, next);
    }
}
