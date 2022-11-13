class Solution {

    public String reverseWords(String s) {
        String[] words = s.split("\\s+");// ignores all spaces around the word
        StringBuilder str = new StringBuilder();

        for (int i = words.length - 1; i >= 0; --i) {
            str.append(words[i] + " ");
        }

        return str.toString().trim();
        // String[] strArr= s.trim().split(" ");
        // String res = "";
        // for(int i=strArr.length-1; i>=0; i--){
        //     res = res.trim()+" "+strArr[i].trim();
        // }
        // //System.out.println(res);
        // return res.trim();
    }
}
