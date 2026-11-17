class Solution {
    public boolean hasDuplicate(int[] nums) {

        boolean answer = false;
        Set<Integer> numSet = new HashSet<>();

        for(int i : nums) {
            if(!numSet.add(i)) {
                answer = true; 
                break;
            }
        }

        return answer;
    }
}