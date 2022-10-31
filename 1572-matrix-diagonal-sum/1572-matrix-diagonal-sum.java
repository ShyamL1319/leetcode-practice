class Solution {

    public int diagonalSum(int[][] mat) {
        // int size = mat.length;
        // int sum=0;
        // if(size==0) return mat[0][0];
        // for(int row=0; row<size; row++){
        //     sum += (mat[row][row] + mat[row][size-row-1]);
        // }
        // //optimization little bit
        // if(size%2 != 0){
        //     sum-=mat[size/2][size/2];
        // }
        // return sum;
        int sum = 0;
        for (int i = 0; 2 * i < mat.length; i++) { //IMPROVEMENT IS THAT WE ONLY DO HALF ROW IN THE FOR LOOP
            sum += mat[i][i] + mat[mat.length - i - 1][mat.length - i - 1] + mat[i][mat.length - i - 1] + mat[mat.length - i - 1][i];           //COUNT INTO OTHER CORRESPONDING THREE ELEMENT
        }

        return mat.length % 2 == 1 ? sum -= mat[mat.length / 2][mat.length / 2] * 3 : sum;
    }
}
