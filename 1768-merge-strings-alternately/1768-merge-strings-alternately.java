class Solution {
    public String mergeAlternately(String w1, String w2) {
//         String res = "";
//         int n1 = word1.length();
//         int n2 = word2.length();
//         if(n1 > n2)
//         {
//             for(int i =0; i<n2; i++){
//                 res+=(""+word1.charAt(i)+word2.charAt(i));
//             }
            
//             for(int i =0; i<n1-n2; i++){
//                 res+=(""+word1.charAt(i+n2));
//             }
//         }
           
//         else
//         {
//             for(int i =0; i<n1; i++){
//                 res+=(""+word1.charAt(i)+word2.charAt(i));
//             }
            
//             for(int i =0; i<n2-n1; i++){
//                 res+=(""+word2.charAt(i+n1));
//             }
//         }
        int n = w1.length(), m = w2.length(), i = 0, j = 0;
        StringBuilder res = new StringBuilder();
        while (i < n || j < m) {
            if (i < n)
                res.append(w1.charAt(i++));
            if (j < m)
                res.append(w2.charAt(j++));
        }
        return res.toString();
        
    }
    
    
    
}