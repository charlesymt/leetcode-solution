class Solution {
    public int reverse(Integer x) {
        if (x == 0) return 0;
        int flag = x / Math.abs(x);
        x = Math.abs(x);
        char[] xs = x.toString().toCharArray();
        for (int i = 0; i < xs.length / 2; i++) {
            char c = xs[i];
            xs[i] = xs[xs.length - i - 1];
            xs[xs.length - i - 1] = c;
        }
        try {
            x = new Integer(new String(xs));
        }
        catch(NumberFormatException e) {
            return 0;
        }
        x = x * flag;

        return x;
    }
    
    public int reverse(int x) {
        long res = 0;
        for (; x != 0; x /= 10)
            res = res * 10 + x % 10;
        return res > Integer.MAX_VALUE || res < Integer.MIN_VALUE ? 0 : (int) res;
    }
}