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
    public List<List<Integer>> verticalOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null)
            return res;
        
        Deque<Pair<TreeNode, Integer>> q = new ArrayDeque<>();
        TreeMap<Integer, List<Integer>> map = new TreeMap<>();

        q.offer(new Pair<>(root, 0));

        while (!q.isEmpty()) {
            Pair<TreeNode, Integer> pair = q.poll();
            TreeNode node = pair.getKey();
            int col = pair.getValue();

            map.computeIfAbsent(col, k -> new ArrayList<>()).add(node.val);

            if (node.left != null)
                q.offer(new Pair<>(node.left, col - 1));
            if (node.right != null)
                q.offer(new Pair<>(node.right, col + 1));
        }

        for (List<Integer> l : map.values())
            res.add(l);

        return res;
    }
}