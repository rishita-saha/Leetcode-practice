class Solution {
    public int minElement(int[] nums) {
        int sum;
        int[] a = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            sum = 0;
            while(nums[i] != 0){
                sum = sum + (nums[i]%10);
                nums[i] /= 10;
            }
            a[i] = sum;
        }
        Arrays.sort(a);
        return a[0];
    }
}