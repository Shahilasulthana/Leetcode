class Solution {
    public int countCollisions(String directions) {
        int n = directions.length();
        int left = 0; int right = n-1;
        
        // Ignoring the left cars
        while(left < n && directions.charAt(left) == 'L'){
            left ++;
        }
        // Ignoring the right cars
        while(right >= 0 && directions.charAt(right) == 'R'){
            right --;
        }

        int collisions = 0;
        for(int i = left; i <= right; i++){
            if(directions.charAt(i) != 'S'){
                collisions ++;
            }
        }
        return collisions;
    }
}

// So, what's the concept here is
// If the car in the left side is moving towards L then no collision will happen
// If the car in the right side is moving towards R then no collision will happen
// So we need to ignore the Trailing L cars in the left and trailing R cars in the Right
// and find the collision that happens in between these cars
// In that too we have to ignore the stationary cars that are already stopped because they don't cause any collision at all


// The trick is just find the no of cars that are not stationary between the left and right