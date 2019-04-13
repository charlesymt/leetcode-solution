class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] charMap = new int[256];
        char[] b = s.toCharArray();
        int i, j;
        int max_len = 0;
        for (i = 0; i < 256; i++) {
            charMap[i] = -1;
        }
        for (j = 0, i = 0; j < b.length; j++) {
            if (charMap[b[j]] >= i) {
                i = charMap[b[j]] + 1;
            }
            charMap[b[j]] = j;
            max_len = Math.max(max_len, j - i + 1);
        }
        return max_len;
    }
}