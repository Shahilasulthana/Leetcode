class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            int sum = 0;
            for(int j=i; j<nums.length; j++){
                sum += nums[j];
                if(sum == k){
                    count += 1;
                }

            }
        }
        return count;
        
    }
}

// this is a brute force solution

// count = 0


//  i                     j                                         i j
// [1,1,1] -> sum = 0 -> [1,1,1] -> -> sum = 1 -> 1 != 2 -> j++ -> [1,1,1] -> sum = 1 + 1 = 2 -> sum = 2=2   -> count = 1 
//                   i
// increment i -> [1,1,1] -> again it repeats in the same way
                //  j
 

