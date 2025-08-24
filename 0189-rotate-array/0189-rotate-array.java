class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums,0,n-1);//for rotating the entire array
        reverse(nums,0,k-1); // for rotating only the k elements of the array
        reverse(nums,k,n-1); // for rotating the rest of the elements
        
    }
    private void reverse(int[] nums, int l, int r){
        while(l < r){
            swap(nums,l++,r--); //performing the reverse operation in-place 
        }
    }
    private void swap(int[] nums, int l, int r){
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
}
// we can use in-place rotation without the use of the temp array what we can do is

// flip the entire array -> flip the k elements -> flip the remaining array

//  nums = [1,2,3,4,5,6,7], k = 3
//  [7,6,5,4,3,2,1] => reversing the entire array
//  [5,6,7,4,3,2,1] => reversing the k elements
//  [5,6,7,1,2,3,4] => reversing the remaining elements