class Solution {
    public int maximum69Number (int num) {
        // convert the num into char so that we can able to look at each digits uniquely
        char[] digits = String.valueOf(num).toCharArray();
        for(int i=0;i<digits.length;i++){
            if(digits[i] == '6'){
                digits[i] = '9';
                break;
            }
        }
        return Integer.parseInt(new String(digits));
    }
}