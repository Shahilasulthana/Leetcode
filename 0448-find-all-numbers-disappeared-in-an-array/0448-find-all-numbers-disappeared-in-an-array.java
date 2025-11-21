class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        int n = nums.length;
        boolean[] seen = new boolean[n+1];
        ArrayList<Integer> res = new ArrayList<>();

        // for already present numbers
        for(int num : nums){
            seen[num] = true;
        }

        // to find missing numbers
        for(int i=1; i <= n; i++){
            if(!seen[i]){
                res.add(i);
            }
        }
        return res;
    }
}


/*

Arrays.sort(nums);
        int n = nums.length;
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=1; i<n-1; i++){
            if(i != nums[i]){
                res.add(i);
            }
        }
        return res; 

        This approach is not applicable as any number can present any times in the array so it is not suitable
*/ 