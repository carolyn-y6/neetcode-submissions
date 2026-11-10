class Solution {
    public String longestPalindrome(String s) {
        int len = s.length();
        String[] ans = new String[len + 1];
        ans[1] = "" + s.charAt(0);

        for(int i = 1; i < len; i++){
            //for odd palidrome
            int oddLow = i - 1;
            int oddHigh = i + 1;
            String curOdd = s.charAt(i) + "";
            while(oddLow >= 0 && oddHigh < len && s.charAt(oddLow) == s.charAt(oddHigh)){
                curOdd = s.charAt(oddLow) + curOdd + s.charAt(oddHigh);
                oddLow--;
                oddHigh++;
            }
            //for even palidrome
            int evenLow = i - 1;
            int evenHigh = i;
            String curEven = "";
            while(evenLow >= 0 && evenHigh < len && s.charAt(evenLow) == s.charAt(evenHigh)){
                curEven = s.charAt(evenLow) + curEven + s.charAt(evenHigh);
                evenLow--;
                evenHigh++;
            }
            ans[curEven.length()] = curEven;
            ans[curOdd.length()] = curOdd;
        }

        for(int i = len; i >= 0; i--){
            if(ans[i] != null){
                return ans[i];
            }
        }
        return null;
    }
}
