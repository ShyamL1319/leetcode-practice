class Solution {
    public int climbStairs(int n) {
     int one=1,two=1;
        int temp =0 ;
        while(--n > 0){
            temp = one;
            one = one+two;
            two = temp;
        }
        return one;
    }
}