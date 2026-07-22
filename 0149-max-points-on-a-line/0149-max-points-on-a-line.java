class Solution {
    public int maxPoints(int[][] points) {
        int sum = 0;
        int n = points.length;
        if(n <= 2) return n;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
               int c = 2;
                for(int k=j+1;k<n;k++){
                    int x1 = points[i][0] , y1 = points[i][1];
                    int x2 = points[j][0] , y2 = points[j][1];
                    int x3 = points[k][0] , y3 = points[k][1];
                    if((y2- y1)*(x3 - x1) == (y3 - y1)*(x2 - x1)){
                        c++;
                    }
                }
                sum = Math.max(sum,c);
                // System.out.print(points[i][j] + "==" + i + "," + j);
            }
            // System.out.println();
        }
        return sum;
    }
}