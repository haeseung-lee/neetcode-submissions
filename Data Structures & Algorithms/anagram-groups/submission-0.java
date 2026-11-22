class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> map = new HashMap<>();

        for(int i = 0; i < strs.length; i++) {
            char[] cArr = strs[i].toCharArray();
            Arrays.sort(cArr);
            String s = new String(cArr);

            List<String> list = map.containsKey(s) ? map.get(s) : new ArrayList<>();
            list.add(strs[i]);
            map.put(s, list);
        }

        List<List<String>> answer = new ArrayList<>();

        map.forEach((k, v) -> {
            answer.add(v);
        });

        return answer;
    }
}
