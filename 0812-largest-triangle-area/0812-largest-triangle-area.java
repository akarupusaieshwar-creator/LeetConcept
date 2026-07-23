class Solution {
    public double largestTriangleArea(int[][] points) {
        int n = points.length;
        // if(n < 3) return 
        double area = 0;
        double max = Double.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    int x1 = points[i][0], y1 = points[i][1];
                    int x2 = points[j][0], y2 = points[j][1];
                    int x3 = points[k][0], y3 = points[k][1];
                    // int a = (x1 * y2) + (x2 * y3);
                    // int b = (x2 * y1) + (x3 * y2);
                    // area += 0.5 * (a - b); 
                    area = Math.abs(x1*(y2 - y3) + x2*(y3 - y1) + x3*(y1 - y2))/2.0;
                    max = Math.max(max,area);
                }
            }
        }
        return max;
    }
}