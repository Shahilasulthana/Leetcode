class Solution {
    public int maxProduct(int[] nums) {
        int max_product = nums[0];
        int min_product = nums[0];
        int ans = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] < 0){
                int temp = max_product;
                max_product = min_product;
                min_product = temp;
            }
            max_product = Math.max(nums[i], max_product * nums[i]);
            min_product = Math.min(nums[i], min_product * nums[i]);

            ans = Math.max(ans, max_product);
        }
        return ans;
    }
}