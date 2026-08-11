class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int ans = target - nums[i];
            if(map.get(ans) != null){
                int[] ret = {Math.min(map.get(ans), i), Math.max(map.get(ans), i)};
                return ret;
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[2];
    }
}
