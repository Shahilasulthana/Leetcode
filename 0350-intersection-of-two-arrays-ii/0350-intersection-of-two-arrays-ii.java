class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2){
            if(nums1[i] > nums2[j]) j++;

            else if(nums1[i] < nums2[j]) i++;

            else{
                nums1[k++] = nums1[i++];
                j++;
            
            } 
        }
        return Arrays.copyOfRange(nums1, 0, k);
    }
}