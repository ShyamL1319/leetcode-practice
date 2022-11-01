class Solution {
    public char findTheDifference(String s, String t) {
        int charM[] = new int[26];
        int n = s.length();
        for(int i=0; i < n; i++){
            charM[(int) s.charAt(i) - 97] += 1;
            charM[(int) t.charAt(i) - 97] -= 1;
        }
        charM[(int) t.charAt(n) - 97] -= 1;
        char c = t.charAt(0);
        for(int i=0; i<26; i++){
            if(charM[i] != 0){
                int ch = i+97;
                c = (char) ch;
                break;
            }
        }
        return c;
    }
}