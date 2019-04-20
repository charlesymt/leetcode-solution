class Solution {
    public String intToRoman(int num) {
        StringBuilder res = new StringBuilder();
        String[] romanValue = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] romanKey = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        for (int i = 0; i < romanKey.length; i++) {
            while (num >= romanKey[i]) {
                num -= romanKey[i];
                res.append(romanValue[i]);
            }
        }

        return res.toString();
        
    }
}