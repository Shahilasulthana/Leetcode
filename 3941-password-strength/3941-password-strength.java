class Solution {
    public int passwordStrength(String password) {
        int points = 0;
        // create a hashset
        HashSet<Character> set = new HashSet<>();

        for(char ch : password.toCharArray()){
            if(set.contains(ch)) continue;
            else{
                set.add(ch);
                if(ch >= 'a' && ch <= 'z') points += 1;
                else if(ch >= 'A' && ch <= 'Z') points += 2;
                else if(ch >= '0' && ch <= '9') points += 3;
                else points += 5;            }
        }
    return points;
        
    }
}

// use hashset 
// there is no value for duplicates
// if we find any new char in password we will just add it to the set and calculate the points based on that