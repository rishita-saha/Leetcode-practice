class Solution {
    public int longestBalanced(int[] nums) {
        int e,o,max=0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            HashSet<Integer> s = new HashSet<>();
            e=0;
            o=0;
            for(int j=i;j<n;j++){
                if (!s.contains(nums[j])){
                    s.add(nums[j]);
                    if(nums[j]%2 == 0)
                        e++;
                    else
                        o++;
                }
                if(e == o)
                    max = Math.max(max,j-i+1);
            }
        }
        return max;
    }
}