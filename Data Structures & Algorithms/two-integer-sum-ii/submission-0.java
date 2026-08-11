class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //have for loops on both sides go inwards. Stop at the middle

        int len = numbers.length ;
        int[] ans = new int[2];

        int curFront = 0;
        int curBack = len - 1;

        for(int i = 0; i < len; i++){
            //at the front
            int tot = numbers[curFront] + numbers[curBack];

            if(tot == target){
                ans[0] = curFront + 1;
                ans[1] = curBack + 1;
                return ans;
            } else if (tot > target){
                curBack--;
            } else if (tot < target) {
                curFront++;
            }
        }
        return ans;
    }
}
