class Solution {
    public int findMin(int[] nums) {
        int start = 0, end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[end]) {
                // Minimum is in the right half
                start = mid + 1;
            } else {
                // Minimum is in the left half (including mid)
                end = mid;
            }
        }

        // At the end, start == end → pointing to the smallest element
        return nums[start];
    }
}
