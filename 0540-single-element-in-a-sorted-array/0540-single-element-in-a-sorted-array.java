class Solution {
    public int singleNonDuplicate(int[] nums) {

        int n = nums.length;

        if (nums.length == 0) return -1;
        if (nums.length == 1) return nums[0];

        if(nums[0] != nums[1]) return nums[0];
        if(nums[n-1] != nums[n-2]) return nums[n-1];

        int start = 1, end = n-2;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if((nums[mid] != nums[mid - 1]) && (nums[mid] != nums[mid + 1])){
                return nums[mid];
            }
            else if((((mid % 2) == 1) && nums[mid] == nums[mid - 1]) 
                     || ((mid % 2) == 0) && (nums[mid] == nums[mid + 1])){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
        
    }
}