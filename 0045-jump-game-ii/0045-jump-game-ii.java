class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int j = 0,l=0,r=0;
        while(r<n-1){
            int far = 0;
            for(int i=l;i<=r;i++){
                far = Math.max(far, i+nums[i]);
            }
            j++;
            l = r+1;
            r = far;
        }
        return j;
    }
}