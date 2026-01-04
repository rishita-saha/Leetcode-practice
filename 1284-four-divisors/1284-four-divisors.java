class Solution {

    public int sumFourDivisors(int[] nums) {
        int ans = 0;

        for (int n : nums) {

            // ---- Case 1: p^3 ----
            int k = (int)Math.round(Math.cbrt(n));
            if (k * k * k == n && isPrime(k)) {
                ans += (1 + k + k * k + n);
                continue;
            }

            // ---- Case 2: p * q ----
            int d = -1;
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    d = i;
                    break;
                }
            }

            if (d == -1) continue;

            int other = n / d;
            if (d != other && isPrime(d) && isPrime(other)) {
                ans += (1 + d + other + n);
            }
        }

        return ans;
    }

    private boolean isPrime(int x) {
        if (x < 2) return false;
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) return false;
        }
        return true;
    }
}
