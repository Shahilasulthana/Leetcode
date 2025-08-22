class Solution {
    public boolean check(int[] nums) {
        int inversion_count = 0;
        int n = nums.length;

       for(int i=0;i<n-1;i++){
        if(nums[i] > nums[i+1]){
            inversion_count ++;
        }
       }
        if(nums[n-1] > nums[0]){
            inversion_count ++;
        }
       return inversion_count <= 1;
        
    }
    
}

// The concept here we have used is that when the previous elt is greater than the next elt then there is a rotation happened and if there are more than 