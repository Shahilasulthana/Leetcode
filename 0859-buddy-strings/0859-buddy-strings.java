class Solution {
    public boolean buddyStrings(String s, String goal) {
        // Buddy strings are two strings where swapping exactly one pair of characters in the first string makes it equal to the second string.

        // 1. if the length of s and goal is different, it is not a buddy string

        if(s.length() != goal.length()){
            return false;
        }

        // 2. if both the s and goal are equal, still we have to check whether even after swapping a pair of characters will keep the string equal or does the strings changes

        int n = s.length();
        if(s.equals(goal)){
            // check for duplicates : if duplicates present then true, else false
            Set<Character> temp = new HashSet<>();
            for(char c : s.toCharArray()){
                temp.add(c);
            }
            return temp.size() < goal.length();
        }

        // 3. Iterate both s and goal using two pointers to find the buddy strings
        
        int i = 0;
        int j = n - 1;
        while(i < j && s.charAt(i) == goal.charAt(i)){
            i++;
        }
        while(i < j && s.charAt(j) == goal.charAt(j)){
            j--;
        }
        if(i < j){
            char[] ch = s.toCharArray();
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            s = new String(ch);
        }
        return s.equals(goal);
    }
}