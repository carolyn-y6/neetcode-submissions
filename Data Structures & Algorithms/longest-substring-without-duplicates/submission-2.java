class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.equals(null) || s.length() == 0){
            return 0;
        }
        if(s.length() == 1){
            return 1;
        }

        int ans = 0;
        int left = 0;
        HashSet<Character> set = new HashSet<>();
        set.add(s.charAt(0));

        for(int right = 1; right < s.length(); right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left += 1;
            }

            if((right - left + 1) > ans){
                ans = right - left + 1;
            }
            set.add(s.charAt(right));
        }
        return ans;
    }
}
