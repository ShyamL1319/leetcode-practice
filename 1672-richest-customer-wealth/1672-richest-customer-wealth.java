class Solution {
    public int maximumWealth(int[][] accounts) {
        int richest=Integer.MIN_VALUE;
        for(int i=0; i<accounts.length; i++){
            int totalAmount=0;
            for(int amount : accounts[i]) totalAmount+=amount;
            richest = Math.max(richest,totalAmount);
        }
        return richest;
    }
}