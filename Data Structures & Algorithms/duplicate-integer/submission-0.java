class Solution {
    public boolean hasDuplicate(int[] nums) {
        int len = nums.length;
        if(len == 0 || len == 1){
            return false;
        }
        
        HashSet<Integer> check = new HashSet<>();
        for(int i = 0; i < len; i++){
            if(check.contains(nums[i])){
                return true;
            }
            check.add(nums[i]);
        }
        return false;
    }
}