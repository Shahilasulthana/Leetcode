class Solution {
    public int smallestRepunitDivByK(int k) {
        if(k == 2 || k == 5) return -1;
        
        int remainder = 0;
        for(int length = 1; length <= k; length ++){
            remainder = (remainder * 10 + 1) % k;
            if(remainder == 0){
                return length;
            }
        }
        return -1;
    }
}

// the digit n contains 1 only for example : 1, 11, 111, 1111, 11111, ...
// and we have to check whether the given number k is completely divisible by any of the number which contatins only ones in it if so we have to return the length of the number i.e, the number of ones in the number
// (1*10 + 1)  = 11
// 11*10 + 1 = 111
// 111*10 + 1 = 1111

// the numbers containing only 1's are never divisible by 2 and 5