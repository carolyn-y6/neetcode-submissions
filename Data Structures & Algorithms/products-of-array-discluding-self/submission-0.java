class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;

        int[] l = new int[len];
        int[] r = new int[len];
        
        //prefix (l -> r)
        l[0] = nums[0];
        for(int i = 1; i < len; i++){
            l[i] = l[i-1]*nums[i];
        }

        //suffix (r -> l)
        r[len-1] = nums[len-1];
        for(int j = len-2; j >= 0; j--){
            r[j] = r[j+1]*nums[j];
        }

        int[] ans = new int[len];
        ans[0] = r[1];
        ans[len-1] = l[len-2];
        for(int n = 1; n < len-1; n++){
            ans[n] = l[n-1]*r[n+1];
        }
        return ans;
    }
}  
