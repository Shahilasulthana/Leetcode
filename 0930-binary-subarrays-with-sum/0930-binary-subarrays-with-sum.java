class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int count = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for(int num : nums){
            sum += num;
            if(map.containsKey(sum - goal)){
                count += map.get(sum - goal);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}

// Prefix Sum + HashMap
// Instead of checking every subarray (which is slow), we use this fact:        
// If
// currentPrefixSum − previousPrefixSum = goal
// then the subarray between them has sum = goal.