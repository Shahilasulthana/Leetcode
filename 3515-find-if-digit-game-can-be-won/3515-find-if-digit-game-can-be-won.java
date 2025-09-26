class Solution {
    public boolean canAliceWin(int[] nums) {
        int sumsingle=0;
        int sumdouble=0;
        for(int x : nums){
            if(x<10){
                sumsingle+=x;
            }else{
                sumdouble+=x;            }
        }
        return sumsingle!=sumdouble;
    }
}