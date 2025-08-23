class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        
        int i = 0; //slow pointer
        for(int j = 1;j<n;j++){ //fast pointer
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}
// we can use a two pointer with a slow and fast pointer
//  i j
// [1,1,2] => nums[i] == nums[j] => do nothing
//  i   j                  i j                             i 
// [1,1,2] => 1 != 2 => [1,1,2] => nums[i] = nums[j] => [1,2,2]

// i = 1

// return i+1 => return 2

// output 2



