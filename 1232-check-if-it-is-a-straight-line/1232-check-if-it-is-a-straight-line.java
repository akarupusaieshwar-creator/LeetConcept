class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int n = coordinates.length;
        if(n <= 2) return true;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    int x1 = coordinates[i][0] , y1 = coordinates[i][1];
                    int x2 = coordinates[j][0] , y2 = coordinates[j][1];
                    int x3 = coordinates[k][0] , y3 = coordinates[k][1];
                    if((y3 - y1) * (x2 - x1) != (x3 - x1) * (y2 - y1)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}