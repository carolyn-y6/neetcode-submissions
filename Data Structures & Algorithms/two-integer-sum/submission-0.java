class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < len; i++){
            int other = target - nums[i];
            if(map.get(other) != null){
                int[] ans = {Math.min(i, map.get(other)), Math.max(i, map.get(other))};
                return ans;
            }
            map.put(nums[i], i);
        }
        return new int[2];
    }
}
