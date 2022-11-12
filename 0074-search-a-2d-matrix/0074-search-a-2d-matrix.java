class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {
        //         int rl = 0;
        //         int rr = matrix.length-1;
        //         while(rl <= rr){
        //             int rowMid = rl+(rr-rl)/2;
        //             int lc = 0;
        //             int rc = matrix[rowMid].length-1;
        //             if(matrix[rowMid][lc] <= target && matrix[rowMid][rc] >= target){
        //                 while(lc <= rc){
        //                     int colMid = lc+(rc-lc)/2;
        //                     if(matrix[rowMid][colMid] == target) return true;
        //                     else if(matrix[rowMid][colMid] > target ) lc = colMid+1;
        //                     else rc = colMid-1;
        //                 }
        //             }else if(matrix[rowMid][rc] < target){
        //                 rl = rowMid+1;
        //             }else rr = rowMid-1;

        //         }
        int mn = matrix.length * matrix[0].length;
        int arr[] = new int[mn];
        int k = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                arr[k++] = matrix[i][j];
            }
        }
        // int rowMid = rl+(rr-rl)/2;
        int l = 0;
        int r = arr.length-1;
        int mid = 0;
        while (l <= r) {
            mid = l+((r - l) / 2);
            if (arr[mid] == target) return true; 
            else if (arr[mid] > target) r = mid - 1; 
            else l = mid + 1;
        }
        return false;
    }
}
