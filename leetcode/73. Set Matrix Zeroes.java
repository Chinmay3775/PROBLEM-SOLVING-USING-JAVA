class Solution {
    public void setZeroes(int[][] matrix) {
        int len1 = matrix.length;
        int len2 = matrix[0].length;
        int [] row =new int[len1];
        int[]  column =new int[len2];
        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                if (matrix[i][j] == 0) {
                    row[i]=1;
                    column[j]=1;
                }
            }
        }

        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                if (row[i]==1|| column[j]==1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
