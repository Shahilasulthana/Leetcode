class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        ArrayList<Boolean> result = new ArrayList<>();
        
        int max = 0;
        for(int c : candies){
            if(c > max){
                max = c;
            }
        }
        for(int i=0; i<candies.length; i++){
            if(candies[i] + extraCandies >= max){
                result.add(true);
            }else{
                result.add(false);
            }
        }
    return result;
    
    }
}