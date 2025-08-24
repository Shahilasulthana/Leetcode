class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // if k is greater than the length of the array given
        int[] temp = new int[n]; //temp is the rotated array and it's size is equal to the array given

        for(int i=0;i<n;i++){
            temp[(i+k)%n] = nums[i]; // it contains the elements from the nums array
        }
        for(int i=0;i<n;i++){
            nums[i] = temp[i];
        }
    }
}
// here we have to use the remainder concept to create a rotate an array so what we have to do is 

// nums = [1,2,3,4,5,6,7], k=3

// i=0 → temp[(0+3)%7] = temp[3] = 1

// i=1 → temp[(1+3)%7] = temp[4] = 2

// i=2 → temp[(2+3)%7] = temp[5] = 3

// i=3 → temp[(3+3)%7] = temp[6] = 4

// i=4 → temp[(4+3)%7] = temp[0] = 5

// i=5 → temp[(5+3)%7] = temp[1] = 6

// i=6 → temp[(6+3)%7] = temp[2] = 7

// So temp = [5,6,7,1,2,3,4] ✅