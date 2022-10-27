class Solution {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for (int i = 0; i < nums1.length; i++) {
            boolean found = false;
            int val = -1;
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == nums1[i]) {
                    found = true;
                    continue;
                }

                if (found && nums2[j] > nums1[i]) {
                    val = nums2[j];
                    break;
                }
            }

            nums1[i] = val;
        }

        return nums1;
    }
}
