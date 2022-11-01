class Solution {

    public int uniquePaths(int m, int n) {
        int memo[][] = new int[2][n];
        for (int i = 0; i < n; i++) {
            memo[0][i] = 1;
        }
        for (int i = 0; i < 2; i++) {
            memo[i][0] = 1;
        }
        
        for(int i =1; i < m; i++){
            for(int j = 1; j<n; j++){
                memo[i & 1 ][j] = (memo[ 1 & (i-1)][j] + memo[i & 1][j-1]);
            }
        }
        
        return memo[(m-1) & 1][n-1];
    }
}
