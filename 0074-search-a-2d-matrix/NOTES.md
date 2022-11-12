int i = 0, j = matrix[0].length - 1;
while(i < matrix.length && j >= 0) {
if(matrix[i][j] == target)
return true;
else if(matrix[i][j] > target)
j --;
else if(matrix[i][j] < target)
i ++;
}
return false;
}
// int mn = matrix.length * matrix[0].length;
// int arr[] = new int[mn];
// int k = 0;
// for (int i = 0; i < matrix.length; i++) {
//     for (int j = 0; j < matrix[0].length; j++) {
//         arr[k++] = matrix[i][j];
//     }
// }
// // int rowMid = rl+(rr-rl)/2;
// int l = 0;
// int r = arr.length-1;
// int mid = 0;
// while (l <= r) {
//     mid = l+((r - l) / 2);
//     if (arr[mid] == target) return true;
//     else if (arr[mid] > target) r = mid - 1;
//     else l = mid + 1;
// }