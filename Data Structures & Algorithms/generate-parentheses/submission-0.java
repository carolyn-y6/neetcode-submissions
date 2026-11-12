class Solution {
    List<String> ans = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        String cur = "";
        dfs(n, 0, 0, cur);
        return ans;
    }

    public void dfs(int n, int open, int close, String cur){
        if(close == open && open == n){
            ans.add(cur);
        }

        if(open < n){
            String temp = cur + "(";
            dfs(n, open + 1, close, temp);
        }
        if(close < open){
            String temps = cur + ")";
            dfs(n, open, close + 1, temps);
        }
    }
}