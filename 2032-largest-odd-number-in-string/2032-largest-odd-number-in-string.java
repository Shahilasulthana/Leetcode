class Solution {
    public String largestOddNumber(String num) {
        // start finding the odd number from the last, if you found it return until the number found
        for(int i = num.length()-1; i >= 0; i--){
            if(Character.getNumericValue(num.charAt(i)) % 2 == 1){
                return num.substring(0, i+1);
            }
        }
        return "";
    }
}