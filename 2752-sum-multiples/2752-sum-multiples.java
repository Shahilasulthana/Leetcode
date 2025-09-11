class Solution {
    public int sumOfMultiples(int n) {
        // store all the numbers from 1 to n in an array
        int sum = 0;
        for(int i=1; i<=n; i++){
            if ((i % 3) == 0 || (i % 5) == 0 || (i % 7) == 0 ){
                sum = sum + i;
            }
        }
        return sum;
    }
}