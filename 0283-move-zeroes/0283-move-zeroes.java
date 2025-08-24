class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int j = 0;
        for(int i=0;i<n;i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}

// we have used 2 pointer approach here 
// If we found an element which is not zero we will swap it and move it to the initial of the /array it will automatically makes the 0 to assemble in the last