class Solution {
    public int compress(char[] chars) {
        // they have clearly mentioned that you have to use the constant extra space

        int ans = 0; // keeps track of the index within the char array

        for(int i=0; i<chars.length;){ // only increment when the next char is different from the current one
            final char letter = chars[i]; // keep track of the current char
            int count = 0;
            while(i < chars.length && chars[i] == letter){ // increment both count and i if the next char is same else again start it from scratch
                ++count;
                ++i;
            }
            chars[ans++] = letter;

// when the count is greater than 1 then we have to enter it as a string in the array
            if(count > 1){
                for(final char c : String.valueOf(count).toCharArray()){
                    chars[ans++] = c;
                }
            }
        }
        return ans;
    }
}

// the approach we are using here is we have to return the output without any extra space we have to modify the input array i.e using inplace 

