/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *     // Constructor initializes an empty nested list.
 *     public NestedInteger();
 *
 *     // Constructor initializes a single integer.
 *     public NestedInteger(int value);
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // The result is undefined if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // Set this NestedInteger to hold a single integer.
 *     public void setInteger(int value);
 *
 *     // Set this NestedInteger to hold a nested list and adds a nested integer to it.
 *     public void add(NestedInteger ni);
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // The result is undefined if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */

class Solution {
    public int depthSum(List<NestedInteger> nestedList) {
        Deque<Pair<NestedInteger, Integer>> q = new ArrayDeque<>();

        for (NestedInteger ni : nestedList)
            q.offer(new Pair<>(ni, 1));
        
        int res = 0;

        while (!q.isEmpty()) {
            Pair<NestedInteger, Integer> pair = q.poll();
            NestedInteger nest = pair.getKey();
            int depth = pair.getValue();

            if (nest.isInteger())
                res += depth * ((int) nest.getInteger());
            else {
                List<NestedInteger> list = nest.getList();
                for (NestedInteger ni : list)
                    q.offer(new Pair<>(ni, depth + 1));
            }
        }

        return res;
    }
}
