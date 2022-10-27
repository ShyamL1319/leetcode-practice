class Solution {

    public int[] nextGreaterElement(int[] findNums, int[] nums) {
//         for (int i = 0; i < nums1.length; i++) {
//             boolean found = false;
//             int val = -1;
//             for (int j = 0; j < nums2.length; j++) {
//                 if (nums2[j] == nums1[i]) {
//                     found = true;
//                     continue;
//                 }

//                 if (found && nums2[j] > nums1[i]) {
//                     val = nums2[j];
//                     break;
//                 }
//             }

//             nums1[i] = val;
//         }

//         return nums1;
        Map<Integer, Integer> map = new HashMap<>(); // map from x to next greater element of x
        Stack<Integer> stack = new Stack<>();
        for (int num : nums) {
            while (!stack.isEmpty() && stack.peek() < num)
                map.put(stack.pop(), num);
            stack.push(num);
        }   
        for (int i = 0; i < findNums.length; i++)
            findNums[i] = map.getOrDefault(findNums[i], -1);
        return findNums;
    }
}
