class Solution {
    public int rob(int[] nums) {
        int len = nums.length;
        if(len == 0){
            return 0;
        }
        if(len == 1){
            return nums[0];
        }
        if(len == 2){
            return Math.max(nums[1], nums[0]);
        }
        //check these bounds
        int[] tab = new int[len];
        tab[0] = nums[0];
        tab[1] = nums[1];
        tab[2] = tab[0] + nums[2];
        for(int i = 3; i < len; i++){
            tab[i] = Math.max(tab[i - 2] + nums[i], tab[i - 3] + nums[i]);
        }
        return Math.max(tab[len - 1], tab[len - 2]);
    }
}
