/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node parent;
};
*/

class Solution {
    public Node lowestCommonAncestor(Node p, Node q) {
        Set<Node> path = new HashSet<>();
        Node currP = p;

        path.add(currP);
        while (currP.parent != null) {
            path.add(currP.parent);
            currP = currP.parent;
        }

        Node currQ = q;
        while (currQ != null) {
            if (path.contains(currQ))
                return currQ;
            currQ = currQ.parent;
        }

        return null;
    }
}