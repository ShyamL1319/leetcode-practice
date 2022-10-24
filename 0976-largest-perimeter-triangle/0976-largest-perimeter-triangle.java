class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = n; i>=3; i--){
            if(nums[i-1] + nums[i-2] > nums[i-3] && nums[i-2] + nums[i-3] > nums[i-1] && nums[i-3] + nums[i-1] > nums[i-2]){
           return nums[i-1]+nums[i-2]+nums[i-3];     
            }
        }
        return 0;
        
    }
}