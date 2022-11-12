class Solution {
    public int firstUniqChar(String s) {
        int arr[] = new int[26];
        
        for(char ch : s.toCharArray()){
            arr[(int)ch-'a']+=1;
        }
        
        for(int i=0; i<s.length(); i++){
            if(arr[(int)s.charAt(i)-'a'] == 1) return i;
        }
        
        return -1;
    }
}