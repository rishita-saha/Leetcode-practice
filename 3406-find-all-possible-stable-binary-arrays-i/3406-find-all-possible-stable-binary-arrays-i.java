class Solution {
    int m = 1000000007;
    int[][][][] memo;
    public int numberOfStableArrays(int zero, int one, int limit) {
        memo = new int[zero+1][one+1][2][limit+1];
        for(int i=0;i<=zero;i++)
        for(int j=0;j<=one;j++)
            for(int k=0;k<2;k++)
                for(int s=0;s<=limit;s++)
                    memo[i][j][k][s] = -1;

        return (helper(zero-1,one,0,1,limit)+helper(zero,one-1,1,1,limit))%m;
    }
    public int helper(int z,int o,int ld,int s,int l){
        if(s>l)
            return 0;
        if(z == 0 && o == 0)
            return 1;
        if(memo[z][o][ld][s] != -1)
            return memo[z][o][ld][s];
        long w = 0;
        if(ld == 0){
            if(z > 0){
                w = (w + helper(z-1,o,0,s+1,l)%m);
            }
            if(o > 0)
                w = (w + helper(z,o-1,1,1,l))%m;
        
        }
        else{
            if(z > 0){
                w = (w + helper(z-1,o,0,1,l))%m;
            }
            if(o > 0)
                w = (w + helper(z,o-1,1,s+1,l))%m;
        }
        return memo[z][o][ld][s] = (int) (w%m);
    }
}