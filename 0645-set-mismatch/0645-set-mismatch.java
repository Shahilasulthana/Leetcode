class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int duplicate = -1;
        int missing = 1;

        for(int i=1; i<n; i++){
            if(nums[i] == nums[i-1]){
                duplicate = nums[i];
            }else if(nums[i] > nums[i-1] + 1){
                missing = nums[i-1] + 1;
            }
        }
        if(nums[n-1] != n ){
            missing = n;
        }
        return new int[]{duplicate, missing};
    }
}