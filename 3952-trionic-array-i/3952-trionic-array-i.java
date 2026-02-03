class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        if (n < 3) return false;

        int i = 0;
        while (i + 1 < n && nums[i] < nums[i + 1]) {
            i++;
        }
        if (i == 0) return false;   
        int j = i;
        while (j + 1 < n && nums[j] > nums[j + 1]) {
            j++;
        }
        if (j == i || j == n - 1) return false; 

        while (j + 1 < n && nums[j] < nums[j + 1]) {
            j++;
        }

            return j == n - 1;
    }
}