class Solution {
    public void dfs(int[] node,boolean[][] vist,char[][] grid) {
        int i=node[0];
        int j=node[1];
        vist[i][j] = true;
        int[][] child ={{i+1, j},{i-1,j},{i,j+1},{i,j-1},{i-1,j+1},{i+1,j-1},{i+1,j+1},{i-1,j-1}};
        for(int k=0;k<8;k++){
            int ci = child[k][0];
            int cj = child[k][1];
            if(ci >= 0 && ci<grid.length && cj >= 0 && cj <grid[0].length && grid[ci][cj] == 'L'){
                if(!vist[ci][cj]){
                    dfs(new int[]{ci,cj},vist,grid);
                }
            }
        }
    }
    
    public int countIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visited = new boolean[n][m];
        int cnt = 0;
        for(int i=0;i<n;i++){
            for(int j =0;j<m;j++){
                if(grid[i][j] == 'L' && !visited[i][j]){
                    cnt++;
                    dfs(new int[]{i,j},visited,grid);
                }
            }
        }
        return cnt;
    }
}