class Solution {
    public int concatenatedBinary(int n) {
        //String s = new String();
        long d = 0;
        int mod = 1000000007;
        for(int i=1;i<=n;i++){
            //s += Integer.toBinaryString(i);
            int bits = (int) (Math.log(i) / Math.log(2)) + 1;
            d = (d << bits) % mod;
            d = (d + i) % mod;
        }
        // for(int i=0;i<s.length();i++){
        //     int digi = s.charAt(i) - '0';
        //     d = (d*2 +digi) % mod;
        // }

        return (int) d;
    }
}