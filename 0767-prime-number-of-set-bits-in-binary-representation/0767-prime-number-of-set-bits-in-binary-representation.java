class Solution {
    public int countPrimeSetBits(int left, int right) {
        HashSet<Integer> h = new HashSet<>(
            Arrays.asList(2,3,5,7,11,13,17,19,23,29,31)
        );
        int c = 0;
        for(int i=left;i<=right;i++){
            int sb = Integer.bitCount(i);
            if(h.contains(sb))
                c++;
        }
        return c;
    }
}