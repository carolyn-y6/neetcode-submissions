class Solution {
    public boolean hasDuplicate(int[] nums) {
        if(nums.length == 0 || nums.length == 1){
            return false;
        }
        int len = nums.length;

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < len; i++){
            if(set.contains(nums[i]) == true){
                return true;
            }
            set.add(nums[i]);
        }

        return false;
    }
}