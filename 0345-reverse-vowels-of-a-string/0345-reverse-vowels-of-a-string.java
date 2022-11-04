class Solution {

    public String reverseVowels(String s) {
        String res = "";
        String tempVowel = "";
        for (char ch : s.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                tempVowel += ch;
            }
        }
        //System.out.println(tempVowel);
        int j = tempVowel.length()-1;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'|| ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') && j < tempVowel.length()) {
                res += tempVowel.charAt(j--)+"";
                //System.out.println(res);
            } else {
                res += ch;
            }
        }
        return res;
    }
}
