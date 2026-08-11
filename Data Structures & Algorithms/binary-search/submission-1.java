class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = (right - left)/2 + left;

        while(left <= right){
            // if((mid == left || mid == right) && nums[mid] != target){
            //     return -1;
            // }

            if(nums[mid] == target){
                return mid;
            } else if (nums[mid] > target){
                right = mid - 1;
            } else if (nums[mid] < target){
                left = mid + 1;
            }

            mid = (right - left)/2 + left;
        }
        return -1;
    }
}
