class Solution {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int n = nums.length;
        int res[] = new int[2];
        for (int i = 0; i < n; i++) {
            if (!hashMap.containsKey(target - nums[i])) {
                hashMap.put(nums[i], i);
            } else {
                res[0] = hashMap.get(target - nums[i]);
                res[1] = i;
                break;
            }
        }
        return res;
    }
}
