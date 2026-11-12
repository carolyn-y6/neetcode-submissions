class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        ArrayList<Integer> cur = new ArrayList<>();
        HashSet<Integer> visited = new HashSet<>();
        dfs(nums, cur, visited);
        return ans;
    }

    public void dfs(int[] nums, ArrayList<Integer> cur, HashSet<Integer> visited){
        if(cur.size() == nums.length){
            ans.add(new ArrayList<>(cur));
        }

        for(int i = 0; i < nums.length; i++){
            if(visited.contains(nums[i])) continue;

            visited.add(nums[i]);
            cur.add(nums[i]);

            dfs(nums, cur, visited);
            
            cur.remove(cur.size() - 1);
            visited.remove(nums[i]);
        }
    }
}