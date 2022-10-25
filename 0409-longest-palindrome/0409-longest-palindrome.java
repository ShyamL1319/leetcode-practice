class Solution {

    public int longestPalindrome(String s) {
//         HashMap<Character, Integer> store = new HashMap<>();
//         if (s.length() == 1) return 1;
//         for (int i = 0; i < s.length(); i++) {
//             char c = s.charAt(i);
//             store.put(c, store.getOrDefault(c, 0) + 1);
//         }

//         int lenOfMaxPalindrome = 0;
//         int oddEvenCount = 0;
//         int flag = 0;

//         for (int value : store.values()) {
//             if (value % 2 == 0) {
//                 lenOfMaxPalindrome += value;
//             } else {
//                 flag = 1;
//                 if (value >= 1) {
//                     oddEvenCount += (value - 1);
//                 }
//             }
//         }

//         if (flag == 0) {
//             return lenOfMaxPalindrome;
//         } else {
//             return (lenOfMaxPalindrome + oddEvenCount + 1);
//         }
        Set<Character> set = new HashSet<>();
        int len = 0;

        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                len += 2;
                set.remove(c);
            }
            else set.add(c);
        }

        return set.size() > 0 ? len + 1 : len;
    }
}
