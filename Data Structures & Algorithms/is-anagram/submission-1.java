class Solution {
    public boolean isAnagram(String s, String t) {
        int lenS = s.length();
        int lenT = t.length();

        if(lenS != lenT){
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> set = new HashMap<>();

        for(int i = 0; i < lenS; i++){
            if(map.get(s.charAt(i)) == null){
                map.put(s.charAt(i), 1);
            } else if (map.get(s.charAt(i)) != null){
                int num = map.get(s.charAt(i));
                map.remove(s.charAt(i));
                map.put(s.charAt(i), num+1);
            }
        }

        for(int j = 0; j < lenT; j++){
            if(set.get(t.charAt(j)) == null){
                set.put(t.charAt(j), 1);
            } else if (set.get(t.charAt(j)) != null){
                int num = set.get(t.charAt(j));
                set.remove(t.charAt(j));
                set.put(t.charAt(j), num+1);
            }
        }

        if(set.equals(map)){
            return true;
        }

        return false;
    }
}
