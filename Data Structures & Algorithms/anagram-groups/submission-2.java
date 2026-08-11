class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, Integer> map = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();
        for(int i = 0; i < strs.length; i++){
            int[] key = new int[26];
            char a = 'a';
            for(char cur : strs[i].toCharArray()){ 
                int temp = key[cur - a];
                key[cur - a] = temp + 1;
            }

            if(map.containsKey(Arrays.toString(key))){
                int index = map.get(Arrays.toString(key));
                List<String> add = ans.get(index);
                add.add(strs[i]);
                // ans.add(add);
            } else {
                List<String> add = new ArrayList<>();
                add.add(strs[i]);
                ans.add(add);
                map.put(Arrays.toString(key), ans.size() - 1);
            }
        }
        return ans;
    }
}
