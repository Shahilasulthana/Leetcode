class Solution {
    public int pivotInteger(int n) {
        int total = n * (n+1) / 2;
        int x = (int) Math.sqrt(total);
        if(x * x == total){
            return x;
        }
        return -1;
    }
}

// Compute total = n(n+1)/2
// Check if total has a perfect square
// If yes → sqrt(total) is pivot
// Else → no pivot 

// total = 8 * 9 / 2 = 36
// x = sqrt(36) = 6 → perfect square
