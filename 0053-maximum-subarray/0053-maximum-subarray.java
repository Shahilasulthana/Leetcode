class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0]; // start with first element
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (sum > max) {
                max = sum; // update max
            }

            if (sum < 0) {
                sum = 0; // reset but continue
            }
        }

        return max;
    }
}
