class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int leftSum =0; int rightSum =0;
	
		for(int i=0; i<n;i++){
            rightSum+=nums[i];
		}
        
        for(int j =0; j <n; j++){
            rightSum -= nums[j];
            if(rightSum == leftSum) return j;
            leftSum+=nums[j];
        }
        return -1;
    }
    
//     public int pivotIdx(int[] nums){ // BruteForce Approach
//         int n = nums.length;
//         int leftPreSum[] = new int[n];
//         int rightPreSum[] = new int[n];
		
// 		for(int i=0; i<n;i++){
// 			leftPreSum[i] = nums[i];
// 			rightPreSum[i] = nums[i];
// 		}
//         for(int i =1; i<n; i++){
//             leftPreSum[i] += leftPreSum[i-1];
//             rightPreSum[n-i-1] += rightPreSum[n-i];
//         }
        
//         for(int j =0; j <n; j++){
//             if(leftPreSum[j] == rightPreSum[j]) return j;
//         }
//         return -1;   
//     }
}