class Solution {
    public int bulbSwitch(int n) {
        int count = 1;
        while( (count * count) <= n){
            count += 1;
        }
        return count-1;
    }
}