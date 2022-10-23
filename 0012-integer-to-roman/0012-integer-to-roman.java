class Solution {

    public String intToRoman(int num) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "I");
        map.put(2, "II");
        map.put(3, "III");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(6, "VI");
        map.put(7, "VII");
        map.put(8, "VIII");
        map.put(9, "IX");

        int i = 1;
        String res = "";
        String currStr = "";
        int rem = 0;
        while (num != 0) {
            switch (i) {
                case 1:
                    rem = num % 10;
                    if (rem != 0) res = map.get(rem);
                    break;
                case 10:
                    rem = (num % 10);
                    currStr = "";
                    if ((rem * i) < 40) {
                        for (int j = 0; j < rem; j++) {
                            currStr += "X";
                        }
                    } else if ((rem * i) == 40) {
                        currStr += "XL";
                    } else if ((rem * i) <= 80) {
                        currStr += "L";
                        for (int j = 5; j < rem; j++) {
                            currStr += "X";
                        }
                    } else {
                        currStr += "XC";
                    }
                    res = currStr + res;
                    break;
                case 100:
                    rem = (num % 10);
                    currStr = "";
                    if ((rem * i) < 400) {
                        for (int j = 0; j < rem; j++) {
                            currStr += "C";
                        }
                    } else if ((rem * i) == 400) {
                        currStr += "CD";
                    } else if ((rem * i) <= 800) {
                        currStr += "D";
                        for (int j = 5; j < rem; j++) {
                            currStr += "C";
                        }
                    } else {
                        currStr += "CM";
                    }
                    res = currStr + res;
                    break;
                case 1000:
                    rem = (num % 10);
                    currStr = "";
                    if ((rem * i) < 4000) {
                        for (int j = 0; j < rem; j++) {
                            currStr += "M";
                        }
                    }
                    res = currStr + res;
                    break;
            }
            num /= 10;
            i *= 10;
        }
        return res;
    }
}
