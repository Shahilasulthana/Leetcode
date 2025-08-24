class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //Initilize 3 pointers namely i,j and k each starts their iteration with last the size of the nums1 array is equal to the sum of m and n
        int i = m - 1;
        int j = n-1;
        int k = m + n -1;

        while(i >= 0 && j >= 0){
            if(nums1[i] > nums2[j]){ // If the element i is greater then add it to the end and decrement i
                nums1[k--] = nums1[i--];
            }else{
                nums1[k--] = nums2[j--];
            }
        }
        while(j >= 0){ //if j has still elements left out
            nums1[k--] = nums2[j--];
        }
    }
}

