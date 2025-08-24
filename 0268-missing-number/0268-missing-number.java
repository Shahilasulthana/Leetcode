class Solution {
    public int missingNumber(int[] nums) {
        // we can use index numbering to find the missing element after sorting the nums array
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i != nums[i]){
                return i;
            }
        }
     return nums.length; // If everyting is matched then it is the final number which is missing
    }
}