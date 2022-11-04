class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        for(int num : nums){
            if(hm.getOrDefault(num,0) != 0) return true;
            hm.put(num,1);
        }
        return false;
    }
}