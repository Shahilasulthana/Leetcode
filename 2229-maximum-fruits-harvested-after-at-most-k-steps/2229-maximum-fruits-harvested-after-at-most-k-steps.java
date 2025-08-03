class Solution {
    public int maxTotalFruits(int[][] fruits, int startPos, int k) {
        int max = 0, left = 0, sum = 0;
        for(int right=0;right<fruits.length;right++){
            sum += fruits[right][1];
            while(left <= right && getMinSteps(fruits[left][0], fruits[right][0], startPos)> k){
                sum -= fruits[left][1];
                left ++;
            }
            max = Math.max(max,sum);
        }
        return  max;

    }

    private int getMinSteps(int left, int right,int start){
        int leftGo = Math.abs(start - left) + (right - left);
        int rightGo = Math.abs(start - right) + (right - left);
        return Math.min(leftGo, rightGo);
    }
}


// Here we are using a sliding window approach to collect the maximum number of fruits within k steps by moving either left or right

// Initially we are using some helper functions to decide whether we have to first move to left then right or vice versa

// We use two pointers, left and right, to represent a window of fruit positions we're currently looking at.

// For each window, we calculate:

// How many total fruits are inside this range (by adding them up).
// The minimum number of steps it would take to visit all positions from the starting point.
// There are two ways:
// Go left first, then all the way to the right:
// (startPos - left) + (right - left)
// Go right first, then swing back to the left:
// (right - startPos) + (right - left)
// We choose the cheapest option (fewer steps).
// If the total steps required is more than k, it means the window is too far—so we shrink it by moving the left pointer forward.

// While doing this, we keep track of the maximum fruits collected across all valid windows.


// We only scan the array once.
// We adjust the window size instead of checking every possible path.
// It balances step limits and fruit collection smartly.