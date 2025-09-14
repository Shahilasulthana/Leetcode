class Solution {
    public String restoreString(String s, int[] indices) {
        int len=indices.length;
        Map<Integer,Character>map=new HashMap<>();
        for(int i=0;i<len;i++){
            map.put(indices[i],s.charAt(i));
        }
        String res="";
        for(int i=0;i<len;i++){
            res+=map.get(i);
        }
            return res;
    }
}