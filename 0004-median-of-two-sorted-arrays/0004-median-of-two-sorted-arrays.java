class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int len = len1+len2;
        double combo[] = new double[len];
        
        int i=0,j=0,k=0;
        
        while(i < len1 && j < len2){
            if(nums1[i] < nums2[j]){
                combo[k++] = nums1[i++];
            }else{
                combo[k++] = nums2[j++];
            }
        }
        
        while(i < len1){
            combo[k++] = nums1[i++];
        }
        
        while(j < len2){
            combo[k++] = nums2[j++];
        }
        
        if(len % 2 == 0){
            return (combo[len/2] + combo[len/2 -1])/2.0;
        }else{
            return combo[len/2];
        }
    }
}