class Solution {
    public int subtractProductAndSum(int n) {
        int prodDigit = 1;
        int sumDigit = 0;
        int rem = 0;
        while(n!=0){
            rem = n%10;
            prodDigit *= rem;
            sumDigit += rem;
            n /= 10;
        }
        
        return prodDigit - sumDigit;
    }
}