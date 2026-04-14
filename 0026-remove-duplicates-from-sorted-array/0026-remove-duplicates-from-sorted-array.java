class Solution {
    public int removeDuplicates(int[] nums) {
        // two pointer approach 
        int n = nums.length;
        int i = 0; // slow pointer pointing only the unique elements
        for(int j=1; j<n; j++){// fast pointer
            if(nums[j] != nums[i]){ //found unique element
                i++;
                nums[i] = nums[j]; //grouped the unique element in the starting
            }
        }
        return i+1; //as i track only of the unique element the place where the i is standing is the number of unique elements present
    }
}