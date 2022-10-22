class Solution {
    public boolean isSubsequence(String s, String t) {
        int maxLen = t.length();
        int sLen = s.length();
        if(sLen > maxLen) return false;
        if(s.equals("")) return true;
        int sPointer = 0;
        int tPointer = 0;
        while(tPointer < maxLen && sPointer < sLen){
            char findChar = s.charAt(sPointer);
            if(sPointer == sLen-1 && findChar == t.charAt(tPointer)) return true;
            if(findChar == t.charAt(tPointer)){
                sPointer++;
            }
            tPointer++;
        }
        return false;
    }
}