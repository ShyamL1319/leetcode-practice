class Solution {
    public int diagonalSum(int[][] mat) {
        int size = mat.length;
        int sum=0;
        if(size==0) return mat[0][0];
        for(int row=0; row<size; row++){
            sum += (mat[row][row] + mat[row][size-row-1]);
        }
        //optimization little bit
        if(size%2 != 0){
            sum-=mat[size/2][size/2];
        }
        return sum;
    }
}