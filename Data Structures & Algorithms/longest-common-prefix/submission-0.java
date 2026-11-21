class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        List<String> list = new ArrayList<>(Arrays.asList(strs));
        list.sort(Comparator.comparingInt(String::length));

        StringBuilder sb = new StringBuilder();

        String firstWord = list.get(0);
        for(int i = 0; i < firstWord.length(); i++) {
            char c = firstWord.charAt(i);
            for(int j = 0; j < list.size(); j++) {
                if(list.get(j).charAt(i) != c){
                    return sb.toString();
                }
            }
            sb.append(c);
        }

        return sb.toString();
    }
}