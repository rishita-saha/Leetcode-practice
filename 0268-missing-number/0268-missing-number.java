class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0,nsum = 0;
        for(int i=0;i<n;i++){
            sum += nums[i];
        }
        for(int i=0;i<=n;i++){
            nsum += i;
        }
        return nsum-sum;

    }
}