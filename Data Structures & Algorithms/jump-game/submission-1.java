class Solution {
    public boolean canJump(int[] nums) {
        int step = nums[0];
        int len = nums.length;
        
        if(len == 1){
            return true;
        }
        if(step == 0){
            return false;
        }
        
        for(int i = 1; i < len; i++){
            step--;
            step = Math.max(nums[i], step);

            if(i == len - 1 && step >= 0){
                return true;
            }

            if(step <= 0){
                return false;
            }
        }
        return true;
    }
}
