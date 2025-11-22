class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0,d=0;
        for(int i=0;i<nums.length;i++){
            
            if(nums[i] == 1){
                c++;
                if(d<c)
                    d = c;
            }
            
            else{  
                c=0;
            }
        }
        return d;
    }
}