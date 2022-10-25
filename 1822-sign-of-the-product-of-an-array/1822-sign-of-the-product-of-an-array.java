class Solution {
    public int arraySign(int[] nums) {
        int countEven = 1;
        for(int num : nums){
            if(num == 0) return 0;
            else if (num < 0){
              countEven =  countEven > 0 ? -1 : 1;
            }
        }
        return countEven;
    }
}