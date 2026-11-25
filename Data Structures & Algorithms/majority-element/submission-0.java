class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        int n = nums.length;
        for(int i = 0; i < n; i++) {

            int num = nums[i];
            int cnt = map.getOrDefault(num, 0) + 1;
            
            if(cnt > n/2) {
                return num;
            } else {
                map.put(num, cnt);
            }
        }

        return 0;
    }
}