class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
       if(n < 3 || m < 3) return 0;

        int ans=0;
        for(int i=0;i<=m-3;i++){
         for(int j=0;j<=n-3;j++){
           if(fun(grid,i,j)) ans++; 
         }
        }
        return ans;
    }
    public boolean fun(int[][] grid,int r,int c){
        boolean []vis=new boolean[10];
        for(int i=r;i<r+3;i++){
            for(int j=c;j<c+3;j++){
                int val=grid[i][j];
                if(val<1 || val>9 || vis[val]) return false;
                vis[val]=true;
            }
        }
        for(int i=r;i<r+3;i++){
            if((grid[i][c] + grid[i][c+1] + grid[i][c+2])!=15) return false;
        }
        for(int j=c;j<c+3;j++){
            if((grid[r][j] + grid[r+1][j] + grid[r+2][j])!=15) return false;
        }
        if((grid[r][c] + grid[r+1][c+1] + grid[r+2][c+2])!=15) return false;
        if((grid[r][c+2] + grid[r+1][c+1] + grid[r+2][c])!=15) return false;
        return true;
        
    }   
}