class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int cdiff=arr[1]-arr[0];
        for(int i=2; i<arr.length;i++ ){
            if(cdiff != (arr[i]-arr[i-1])) return false;
        }
        return true;
    }
}