class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        int csum = nums[0] + nums[1] + nums[2];
        for(int i=0;i<n;i++){
            int j = i+1;
            int k = n-1;
            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];

                if(Math.abs(sum - target) < Math.abs(csum - target))
                    csum = sum;
                if(sum<target)
                    j++;
                else if(sum>target)
                    k--;
                else
                    return sum;
                }

            }
        
        return csum;
    
    }
}