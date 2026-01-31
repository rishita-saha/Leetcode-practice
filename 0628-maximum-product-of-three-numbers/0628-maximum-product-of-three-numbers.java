class Solution {
    public int maximumProduct(int[] nums) {
        // Arrays.sort(nums);
        int n = nums.length;
        
        int max1,max2,max3,min1,min2;
        max1 = max2 = max3 = Integer.MIN_VALUE;
        min1 = min2 = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(max1<nums[i]){
                max3 = max2;
                max2 = max1;
                max1 = nums[i];
                
            }
            else if(max2<nums[i]){
                max3 = max2;
                max2 = nums[i];

            }
            else if(max3 < nums[i]){
                max3 = nums[i];
            }
        }

        for(int i : nums){
            if(min1 > i){
                min2 = min1;
                min1 = i;
            }
            else if(min2 > i)
                min2 = i;
        }
        int mul = Math.max((max1*max2*max3),(min1*min2*max1));
        return mul;
    }   
}