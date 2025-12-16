class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        // List to store the result
        List<Integer> result = new ArrayList<>();

        // Hashmap to store the frequency of the element
        Map<Integer,Integer> map = new HashMap<>();

        // size of the array given
        int n = nums.length;

        // the minimum count
        int min = (n/3) + 1;

        // trace the array and count the frequency and add to the result if the count is >n/3
        for(int i=0; i<n; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);

            if(map.get(nums[i]) == min){ // to check whether the increased freq is greater than
                result.add(nums[i]);     // the min 
            }

            if(result.size() == 2){
                break;  // result size should not exceed more than 2 we have to return only the
            }           // 2 elements which appear more than n/3 times
            
        }
        return result;
    }
}