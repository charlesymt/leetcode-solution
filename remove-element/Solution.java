class Solution {
    public int removeElement(int[] nums, int val) {
        int rubish = nums.length - 1;
        for (int i = 0; i < nums.length && i <= rubish; i++) {
            int tmp;
            while (nums[i] == val&& rubish>=0) {
                if (i == rubish) {
                    rubish--;
                    break;
                }
                tmp = nums[i];
                nums[i] = nums[rubish];
                nums[rubish] = tmp;
                rubish--;
            }
        }
        return rubish + 1;
    }
}