class Solution {
    public boolean isPalindrome(String s) {
        String temp = s.replaceAll("[^a-zA-Z0-9]", "");
        String cur = temp.toLowerCase();

        int len = cur.length() - 1;
        int iter = len / 2;
        if(len%2 == 0 && cur.length() > 2){
            iter--;
        }

        if(len <= 0){ 
            return true;
        }

        for(int i = 0; i <= iter; i++){
            if(cur.charAt(i) != cur.charAt(len - i)){
                return false;
            }
        }
        return true;
    }
}

