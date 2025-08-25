class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> frequency = new HashMap<>();
        for(int i:nums){
            frequency.put(i, frequency.getOrDefault(i,0)+1); // In default the each number occurs 0 times
        }
        // Loop through the frequency or map to find the only once occured number
        for(Map.Entry<Integer,Integer> entry : frequency.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return -1;
    }
}

// We can use a hashmap to find the single number in the array