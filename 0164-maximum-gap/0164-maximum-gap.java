class Solution {
    public int maximumGap(int[] nums) {
        int c=0,max=0, n = nums.length;
        if(n<2) return 0;
        Arrays.sort(nums);
        for(int i=0;i<n-1;i++){
            c = nums[i+1] - nums[i];
            if(c>max)
                max = c;

        }
        return max;
    }
}