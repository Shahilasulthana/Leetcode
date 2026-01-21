class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atmost(nums, k) - atmost(nums, k-1);
    }
    private int atmost(int[] nums, int k){
        int left = 0; // Start of the window
        int count = 0; // to count the no.of.subarrays
        int odd = 0; // no.of.odds within a subarray
        for(int right = 0; right < nums.length; right ++){
            if(nums[right] % 2 != 0){
                odd ++;
            }
            while(odd > k){ // if there are more odds in a subarray than expected
                if(nums[left] % 2 != 0){
                    odd--; // reduce the count of odd
                }
                left++; // shrink the window
            }
            count = count + (right - left + 1);
        }
        return count;
    }
}