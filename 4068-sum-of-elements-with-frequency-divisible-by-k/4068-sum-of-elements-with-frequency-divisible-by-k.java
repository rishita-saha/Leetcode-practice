class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i]))
                map.put(nums[i],map.get(nums[i])+1);
            else
                map.put(nums[i],1);
        }

        for (int key : map.keySet()) {
            if (map.get(key)%k == 0) {
                sum += (map.get(key)*key);
            }
        }
        return sum;
    }
}