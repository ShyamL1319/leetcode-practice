class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum = Integer.MIN_VALUE;
        int maxsum_tillnow = 0;
        for(int i=0; i<nums.length; i++){
            maxsum_tillnow+=nums[i];
            if(maxsum_tillnow > maxsum){
                maxsum = maxsum_tillnow;
            }
            if(maxsum_tillnow < 0){
                maxsum_tillnow = 0;
            }
        }
        return maxsum;
    }
}