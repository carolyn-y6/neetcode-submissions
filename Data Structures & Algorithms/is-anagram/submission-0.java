class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> checks = new HashMap<>();
        HashMap<Character, Integer> checkt = new HashMap<>();

        if(s.length() != t.length()){
            return false;
        }
        
        // char[] chs = s.toCharArray();
        // char[] cht = s.toCharArray();
        for(int i = 0; i < s.length(); i++){
            //for s
            char chars = s.charAt(i);
            // char chars = chs[i];
            if(checks.get(chars) == null){
                checks.put(chars, 1);
            } else {
                checks.put(chars, checks.get(chars) + 1);
            }
            //for t
            char chart = t.charAt(i);
            // char chart = cht[i];
            if(checkt.get(chart) == null){
                checkt.put(chart, 1);
            } else {
                checkt.put(chart, checkt.get(chart) + 1);
            }
        }

        for(int j = 0; j < s.length(); j++){
            char chars = s.charAt(j);
            if(checkt.get(chars) == null){
                return false;
            }
            if(!checkt.get(chars).equals(checks.get(chars))){
                return false;
            }
        }
        return true;
    }
}
