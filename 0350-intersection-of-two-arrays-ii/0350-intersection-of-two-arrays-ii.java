class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n = n1 < n2 ? n1 : n2;
        
        int temp[] = new int [n];
        
        HashMap<Integer,Integer> dict = new HashMap<Integer,Integer>();
        
        for(int i=0; i < n1; i++){
            dict.put(nums1[i],dict.getOrDefault(nums1[i], 0)+1);
        }
        int j=0;
        for(int i=0; i< n2; i++){
            if(dict.getOrDefault(nums2[i],0) != 0){
                temp[j]= nums2[i];
                j+=1;
                dict.put(nums2[i],dict.get(nums2[i])-1);
            }
        }
        
        int ret[] = new int[j];
        int k = 0;
        while(k < j){
            ret[k] = temp[k];
            k+=1;
        }
        return ret;
    }
}