class Solution {

    public boolean wordPattern(String pattern, String s) {
        //         char patternArr[] = pattern.toCharArray();
        //         String strArr[] = s.split(" ");

        //         if (patternArr.length != strArr.length) return false;
        //         HashMap<Character, String> map = new HashMap<>();
        //         HashMap<String, Character> viceMap = new HashMap<>();
        //         for (int i = 0; i < patternArr.length; i++) {
        //             if (map.containsKey(patternArr[i]) && viceMap.containsKey(strArr[i])) {
        //                 if (!map.get(patternArr[i]).equals(strArr[i]) || !viceMap.get(strArr[i]).equals(patternArr[i])) {
        //                     return false;
        //                 }
        //             } else {
        //                 if (!(map.getOrDefault(patternArr[i], " ").equals(" ") && viceMap.getOrDefault(strArr[i], ' ') == ' ')) return false;
        //                 map.put(patternArr[i], strArr[i]);
        //                 viceMap.put(strArr[i], patternArr[i]);
        //             }
        //         }
        //         return true;
        String[] arr = s.split(" ");
        if (pattern.length() != arr.length) return false;
        HashMap<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            boolean containsKey = map.containsKey(ch);
            if (map.containsValue(arr[i]) && !containsKey) return false;
            if (containsKey && !map.get(ch).equals(arr[i])) return false; else map.put(ch, arr[i]);
        }
        return true;
    }
}
