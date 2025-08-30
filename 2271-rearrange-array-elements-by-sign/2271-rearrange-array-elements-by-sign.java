class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();
        

        for(int i=0 ; i< nums.length; i++){
            if(nums[i] > 0){
                positive.add(nums[i]);
            }else{
                negative.add(nums[i]);
            }
        }
        int[] result = new int[nums.length];
        int i=0, p=0, n=0;

        while(p < positive.size() && n < negative.size()){
            result[i++] = positive.get(p++);
            result[i++] =  negative.get(n++);
        }

        while(p < positive.size()){
            result[i++] = positive.get(p++);
        }
        while(n < negative.size()){
            result[i++] = negative.get(p++);
        }
        return result;
        
    }
    
}

// here we are storing the positive elements in the separate array and negative elements in the separate array and creating a new array to store the rearranged elements of both positive and negative elements

// i for keeping track of the result array, where to add the next element
// p for keeping track of the positive array
// n for negative