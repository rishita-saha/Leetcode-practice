class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0;
        int sumB = 0;
        int[] ans = new int[2];
        for(int i : aliceSizes)
            sumA += i;
        for(int i : bobSizes)
            sumB += i;
        int d = (sumA - sumB) / 2;
        HashSet<Integer> s = new HashSet<>();
        for(int i : aliceSizes)
            s.add(i);
        for(int i : bobSizes)
            if(s.contains(i+d)){
                ans[0] = i+d;
                ans[1] = i;
            }
        return ans;

        
        

    }
}