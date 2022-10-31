class Solution {
    public int diagonalSum(int[][] mat) {
        int size = mat.length - 1;
        int sum=0;
        if(size==0) return mat[0][0];
        for(int row=0; row<mat.length; row++){
            if(row == size-row){
                sum += mat[row][row];
                System.out.println(mat[row][row]);
            }else{
                System.out.println(mat[row][row]+"    "+mat[row][size-row]);
                sum += (mat[row][row] + mat[row][size-row]);
            }
        }
        return sum;
    }
}