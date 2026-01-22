class Solution {
    public static int minPair(List<Integer> nums){
        int minIdx = -1;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.size()-1;i++){
            int sum = nums.get(i) + nums.get(i+1);
            if(sum < min){
                minIdx = i;
                min = sum;
            }
        }
        return minIdx;
    }
    public static boolean isSorted(List<Integer> nums) {
    for (int i = 0; i < nums.size() - 1; i++) {
        if (nums.get(i) > nums.get(i + 1)) {
            return false;
        }
    }
    return true;
}
    public int minimumPairRemoval(int[] nums) {
        
        List<Integer> l = new ArrayList<>();
        for(int i : nums){
            l.add(i);
        }

        if(isSorted(l))
            return 0;

        int op = 0;
        while(!isSorted(l)){
            int index = minPair(l);

            // Merge the minimum-sum pair
            int merged = l.get(index) + l.get(index + 1);
            l.set(index, merged);
            l.remove(index + 1);

            op++;
        }
        return op;
    }
}