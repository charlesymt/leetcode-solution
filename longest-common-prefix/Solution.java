class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        if (strs.length == 1) return strs[0];
        //Arrays.sort(strs, Comparator.comparingInt(String::length));
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < strs[0].length(); i++) {
            int j;
            for (j = 1; j < strs.length; j++) {
                if(i > strs[j].length()-1)
                    break;
                if (strs[0].charAt(i) != strs[j].charAt(i)) {
                    break;
                }
            }
            if (j == strs.length) {
                res.append(strs[0].charAt(i));
            } else {
                break;
            }
        }
        return res.toString();
    }
}