class Solution {
    public double average(int[] salary) {
        double totalSum = 0.0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int i =0; i<salary.length; i++){
            totalSum += (double)salary[i];
            min = Math.min(salary[i],min);
            max = Math.max(salary[i],max);
        }
        return (totalSum-min-max)/(salary.length-2);
    }
}