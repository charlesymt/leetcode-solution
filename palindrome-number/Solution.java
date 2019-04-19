class Solution {
    public boolean isPalindrome(int x) {
        String sx = new Integer(x).toString();
        int len = sx.length();
        for (int i = 0; i < len / 2; i++) {
            if (sx.charAt(i) != sx.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }
}