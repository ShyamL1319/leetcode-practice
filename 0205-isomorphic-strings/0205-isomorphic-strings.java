class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        return isUnique(s,t) && isUnique(t,s);
    }
    
    public boolean isUnique(String s, String t){
        HashMap<Character,Character> hm = new HashMap<>();
        int i = 0;
        while(i<s.length()){
            if(hm.containsKey(s.charAt(i))){
                if(hm.get(s.charAt(i)) != t.charAt(i)){
                    return false;
                }
            }else{
                hm.put(s.charAt(i),t.charAt(i));
            }
            i++;
        }
        return true;
    }
}