class Solution {
    public int numberOfStableArrays(int zero, int one, int limit) {
        long mod = 1000000007;
        // dp[i][j][k] represents number of stable arrays with i zeros, j ones, 
        // ending with digit k (0 or 1).
        long[][][] dp = new long[zero + 1][one + 1][2];

        // Base case: arrays consisting only of zeros (up to limit)
        for (int x = 1; x <= Math.min(zero, limit); x++) {
            dp[x][0][0] = 1;
        }

        // Base case: arrays consisting only of ones (up to limit)
        for (int y = 1; y <= Math.min(one, limit); y++) {
            dp[0][y][1] = 1;
        }

        for (int i = 1; i <= zero; i++) {
            for (int j = 1; j <= one; j++) {
                // Transition for dp[i][j][0] (ending in zero)
                dp[i][j][0] = (dp[i - 1][j][0] + dp[i - 1][j][1]) % mod;
                if (i > limit) {
                    // Subtract sequences that would violate the limit of consecutive zeros
                    dp[i][j][0] = (dp[i][j][0] - dp[i - limit - 1][j][1] + mod) % mod;
                }

                // Transition for dp[i][j][1] (ending in one)
                dp[i][j][1] = (dp[i][j - 1][0] + dp[i][j - 1][1]) % mod;
                if (j > limit) {
                    // Subtract sequences that would violate the limit of consecutive ones
                    dp[i][j][1] = (dp[i][j][1] - dp[i][j - limit - 1][0] + mod) % mod;
                }
            }
        }

        return (int) ((dp[zero][one][0] + dp[zero][one][1]) % mod);
    }
}