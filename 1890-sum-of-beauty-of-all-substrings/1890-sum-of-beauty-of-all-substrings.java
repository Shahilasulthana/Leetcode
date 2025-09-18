class Solution {
    public int beautySum(String s) {
        int sum=0;
        for (int i=0;i<s.length();i++){
            int num[]=new int[26];
            for (int j=i;j<s.length();j++) {
                num[s.charAt(j)-'a']++;
                int high=1,low=s.length();
                for(int k=0;k<26;k++) {
                    if(num[k]>0){
                        low=Math.min(num[k],low);
                        high=Math.max(num[k],high);
                    }                    
                }
                sum+=high-low;
            }
        }
        return sum;
    }
}