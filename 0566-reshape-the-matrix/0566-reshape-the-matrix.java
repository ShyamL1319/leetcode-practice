class Solution {

    public int[][] matrixReshape(int[][] mat, int r, int c) {
        // if(r * c != mat.length * mat[0].length) return mat;
        // int newM[][] = new int[r][c];
        // int newR=0,newC=0;
        // for(int i=0; i< mat.length; i++)
        // {
        //     for(int j=0; j<mat[0].length; j++){
        //         if(newR < r && newC < c){
        //             newM[newR][newC] = mat[i][j];
        //             if(newC == c-1){
        //                 newR++;
        //                 newC=0;
        //             }else{
        //                 newC++;
        //             }
        //         }
        //     }
        // }
        // return newM;

        final int mr = mat.length;
        final int mc = mat[0].length;
        final int n = mr * mc;

        // check arguments
        if (r * c != n) {
            return mat;
        }

        // create reshaped matrix
        final int[][] ret = new int[r][c];
        for (int i = 0; i < n; i++) {
            ret[i / c][i % c] = mat[i / mc][i % mc]; // see explanation above
        }
        return ret;
    }
}
