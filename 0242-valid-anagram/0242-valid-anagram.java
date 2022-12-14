class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char chars1[] = s.toCharArray();
        char chars2[] = t.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        for(int i=0; i<s.length(); i++){
            if(chars1[i] != chars2[i]) return false;
        }
        return true;
    }
}