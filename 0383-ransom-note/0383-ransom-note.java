class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        HashMap<Character,Integer> hmap = new HashMap<>();
        for(int i=0; i<magazine.length(); i++){
            char ch = magazine.charAt(i);
            if(hmap.containsKey(ch)){
                hmap.put(ch, hmap.get(ch)+1);
            }else{
                hmap.put(ch,1);
            }
        }
        
        for(int i =0; i<ransomNote.length(); i++){
            char ch = ransomNote.charAt(i);
            if(!hmap.containsKey(ransomNote.charAt(i))) return false;
            else{
              int cnt =  (int)hmap.get(ch);
                if(cnt <= 0) return false;
                else hmap.put(ch, cnt-1);
            }
        }
        return true;
    }
}