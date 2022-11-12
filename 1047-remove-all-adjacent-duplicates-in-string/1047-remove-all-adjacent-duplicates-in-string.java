class Solution {

    public String removeDuplicates(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));
        int i = 1;
        while (i < n) {
            char c = s.charAt(i);
            if (!st.empty() && (char) st.peek() == c) {
                st.pop();
            } else {
                st.push(c);
            }
            i += 1;
        }
        StringBuilder sb = new StringBuilder();

        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}
