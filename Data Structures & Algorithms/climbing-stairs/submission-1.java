class Solution {
    public int climbStairs(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0, null);
        list.add(1, 1);
        list.add(2, 2);
        int iter = 3;
        while(iter <= n){
            list.add(iter, list.get(iter - 1) + list.get(iter - 2));
            iter++;
        }
        return list.get(n);
    }
}
