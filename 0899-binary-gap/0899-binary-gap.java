class Solution {
    public int binaryGap(int n) {
        String b = Integer.toBinaryString(n);
        int max = 0;
        int prev = -1;

        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) == '1') {
                if (prev != -1) {
                    max = Math.max(max, i - prev);
                }
                prev = i;
            }
        }
        return max;
    }
}