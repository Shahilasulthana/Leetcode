class Solution {
    static final long MOD = 1000000007;
    public int countGoodNumbers(long n) {

       long even_count = (n+1)/2;
       long odd_count = n/2;
       
       long even_power = power(5, even_count);
       long odd_power = power(4, odd_count);

       return (int)((even_power * odd_power) % MOD);
    }
    private long power(long base, long exp){
        long result = 1;
        base = base % MOD;
        while(exp > 0){
            if((exp % 2) == 1){
                result = (result * base) % MOD;
            }
            base = (base * base) % MOD;
            exp /= 2;
        }
        return result;
    }
}

