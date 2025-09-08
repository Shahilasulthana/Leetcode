class Solution {
    public String largestOddNumber(String num) {
        
        String fAns="";

        for(int i=num.length()-1;i>=0;i--){
           int n = num.charAt(i)-'0';
           if(n%2==1){
             fAns=num.substring(0,i+1);
             break;
           }
        }
        return fAns;
    }
}