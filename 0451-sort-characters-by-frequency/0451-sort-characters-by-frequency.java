class Solution {
    public String frequencySort(String s) {
        HashMap <Character, Integer> hm = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0)+1);
        }
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(hm.entrySet());
        list.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : list) {
            for(int i=0; i<entry.getValue(); i++){
                sb.append(entry.getKey());
            }
        }
        return sb.toString();
    }
}