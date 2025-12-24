class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int n = left; n <= right; n++){
            if(isSelfDivide(n)){
                result.add(n);
            }
        }
        return result;
    }

    private boolean isSelfDivide(int n){
        int temp = n;
        while(temp > 0){
            int digit = temp % 10;
            if(digit == 0 || n % digit != 0){
                return false;
            }
            temp = temp/10;
        }
        return true;
    }
}