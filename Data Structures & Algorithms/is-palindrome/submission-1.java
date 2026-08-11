class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^0-9a-zA-Z]", "");
        s = s.toLowerCase();

        int ind = 0;
        int mid = (s.length() / 2) + 1;
        int len = s.length() - 1;

        StringBuilder org = new StringBuilder(s);
        StringBuilder str = new StringBuilder(s);

        str.reverse();

        String str1 = org.toString();
        String str2 = str.toString();
        if(str1.equals(str2)){
            return true;
        }
        return false;

        // while(ind < mid){
        //     str.setCharAt(index, str.len - ind);
        // }
    }
}
