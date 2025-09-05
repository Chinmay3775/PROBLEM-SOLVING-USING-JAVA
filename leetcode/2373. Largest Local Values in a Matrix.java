class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n=grid.length;
        int[][] result = new int[n-2][n-2];
        for(int i=0;i<n-2;i++){
            for(int j=0;j<n-2;j++){
                int maxVal=grid[i][j];

                for(int a=i;a<i+3;a++){
                    for(int b=j;b<j+3;b++){
                        maxVal=Math.max(maxVal,grid[a][b]);
                    }
                }
                result[i][j]=maxVal;
            }
        }
        return result;
    }
}
