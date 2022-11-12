class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {
        int rl = 0;
        int rr = matrix.length - 1;
        int flag =0;
        while (rl <= rr) {
            int rowMid = rl + (rr - rl) / 2;
            int lc = 0;
            int rc = matrix[rowMid].length - 1;
            if (matrix[rowMid][lc] <= target && matrix[rowMid][rc] >= target) {
                flag =1;
                while (lc <= rc) {
                    int colMid = lc + (rc - lc) / 2;
                    if (matrix[rowMid][colMid] == target) return true; 
                    else if (matrix[rowMid][colMid] > target) rc = colMid - 1; 
                    else lc = colMid + 1;
                }
            } else if (matrix[rowMid][rc] < target) {
                rl = rowMid + 1;
            } else rr = rowMid - 1;
            if(flag == 1) return false;
        }
        return false;
    }
}
