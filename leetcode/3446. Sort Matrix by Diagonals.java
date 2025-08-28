class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;
        PriorityQueue<Integer> diag = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer>[] above = new PriorityQueue[n];
        PriorityQueue<Integer>[] below = new PriorityQueue[n];

        for (int d = 1; d < n; d++) {
            above[d] = new PriorityQueue<>(); 
            below[d] = new PriorityQueue<>(Collections.reverseOrder()); 
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    diag.add(grid[i][j]);
                } else if (i < j) {
                    int d = j - i;       
                    above[d].add(grid[i][j]);
                } else {
                    int d = i - j;        
                    below[d].add(grid[i][j]);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    grid[i][j] = diag.remove();              
                } else if (i < j) {
                    grid[i][j] = above[j - i].remove();      
                } else {
                    grid[i][j] = below[i - j].remove();      
                }
            }
        }
        return grid;
    }
}
