class Solution {

    public int longestPalindrome(String s) {
        HashMap<Character, Integer> store = new HashMap<>();
        if (s.length() == 1) return 1;
        for (int i = 0; i < s.length(); i++) {
            store.put(s.charAt(i), store.getOrDefault(s.charAt(i), 0) + 1);
        }

        int lenOfMaxPalindrome = 0;
        int oddEvenCount = 0;
        int flag = 0;

        for (int value : store.values()) {
            if (value % 2 == 0) {
                lenOfMaxPalindrome += value;
            } else {
                flag = 1;
                if (value >= 1) {
                    oddEvenCount += (value - 1);
                }
            }
        }

        if (flag == 0) {
            return lenOfMaxPalindrome;
        } else {
            // if (lenOfMaxPalindrome + oddEvenCount == 0) return 2;
            return (lenOfMaxPalindrome + oddEvenCount + 1);
        }
    }
}
