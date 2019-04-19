class Solution {
    public int maxArea(int[] height) {
        int max = 0, tmp;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                tmp = height[i] < height[j] ? height[i] * (j - i) : height[j] * (j - i);
                if (max < tmp) {
                    max = tmp;
                }
            }
        }
        return max;
    }

    
    public int maxArea2(int[] height) {
        int l = 0, r = height.length - 1;
        int max = 0, h = 0;
        while (l < r) {
            h = Math.min(height[l], height[r]);
            max = Math.max(max, (r - l) * h);
            while (height[l] <= h && l < r) ++l;
            while (height[r] <= h && l < r) --r;
        }
        return max;
    }
}