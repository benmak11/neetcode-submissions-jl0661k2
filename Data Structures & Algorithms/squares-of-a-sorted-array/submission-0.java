class Solution {
    public int[] sortedSquares(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int l = 0, r = nums.length - 1;

        while (l <= r) {
            if (nums[l] * nums[l] > nums[r] * nums[r]) {
                res.add(nums[l] * nums[l]);
                l++;
            } else {
                res.add(nums[r] * nums[r]);
                r--;
            }
        }

        Collections.reverse(res);
        return res.stream().mapToInt(i -> i).toArray();
    }
}