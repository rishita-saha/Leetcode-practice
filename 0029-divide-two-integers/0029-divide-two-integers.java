class Solution {
    public int divide(int dividend, int divisor) {
        if(divisor == 0)    return Integer.MAX_VALUE;
        if(dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;
        
        int s = (dividend < 0) ^ (divisor < 0) ? -1 : 1;

        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        
        int c = 0;
        while(a >= b){
            long t = b;
            int m = 1;

            while (a >= (t*2)) {
                t *= 2;
                m *= 2;
            }

            a -= t;
            c += m;
        }
        return c*s;

    }
}