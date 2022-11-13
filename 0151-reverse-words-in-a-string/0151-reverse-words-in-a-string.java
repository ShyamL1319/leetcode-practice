class Solution {
    public String reverseWords(String s) {
        String[] strArr= s.trim().split(" ");
        String res = "";
        for(int i=strArr.length-1; i>=0; i--){
            res = res.trim()+" "+strArr[i].trim();
        }
        //System.out.println(res);
        return res.trim();
    }
}