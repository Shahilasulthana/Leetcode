class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       int count = 0; //to increase the count when we encounter ones
       int max_count = 0; // to keep track of the maximum number of consecutive ones
       int n = nums.length;

       for(int i=0;i<n;i++){
        if(nums[i] == 1){
            count++;
            max_count = Math.max(max_count, count);// finding the maximum of count and max_count
        }else{
            count = 0;
        }

       }
       return max_count;
    }
}

