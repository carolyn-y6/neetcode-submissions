class Solution {
    public int orangesRotting(int[][] grid) {
        int freshOr = 0;
        int lenR = grid.length;
        int lenC = grid[0].length;
        if(lenR == 0 || lenC == 0) return -1;
        Queue<int[]> q = new LinkedList<>();

        //find the starting rotten oranges
        for(int r = 0; r < lenR; r++){
            for(int c = 0; c < lenC; c++){
                if(grid[r][c] == 2){
                    q.offer(new int[]{r, c});
                } else if (grid[r][c] == 1){
                    freshOr++;
                }
            }
        }

        //no starting rotten oranges
        if(q.isEmpty() && freshOr > 0) return -1;

        int ans = 0;
        int[][] dir = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        while(!q.isEmpty()){
            ArrayList<int[]> rotten = new ArrayList<>();
            while(!q.isEmpty()){
                rotten.add(q.poll());
            }

            for(int[] rotOrg : rotten){
                for(int[] direction : dir){
                    int curR = rotOrg[0] + direction[0];
                    int curC = rotOrg[1] + direction[1];
                    if(curR >= 0 && curR < lenR && curC >= 0 && curC < lenC){
                        if(grid[curR][curC] == 1){
                            q.offer(new int[]{curR, curC});
                            grid[curR][curC] = 2;
                            freshOr--;
                        }
                    }
                }
            }
            if(!q.isEmpty()) ans++;
        }

        if(freshOr > 0) return -1;
        return ans;
    }
}