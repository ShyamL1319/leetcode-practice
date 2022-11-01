class Solution {
    public String mergeAlternately(String word1, String word2) {
        String res = "";
        int n1 = word1.length();
        int n2 = word2.length();
        if(n1 > n2)
        {
            for(int i =0; i<n2; i++){
                res+=(""+word1.charAt(i)+word2.charAt(i));
            }
            
            for(int i =0; i<n1-n2; i++){
                res+=(""+word1.charAt(i+n2));
            }
        }
           
        else
        {
            for(int i =0; i<n1; i++){
                res+=(""+word1.charAt(i)+word2.charAt(i));
            }
            
            for(int i =0; i<n2-n1; i++){
                res+=(""+word2.charAt(i+n1));
            }
        }
        
        return res;
        
    }
    
    
    
}