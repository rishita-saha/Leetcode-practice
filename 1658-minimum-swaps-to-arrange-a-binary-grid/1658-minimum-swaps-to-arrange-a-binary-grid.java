class Solution {
    public int minSwaps(int[][] grid) {
        int n = grid.length;
        int[] zero = new int[n];
        for(int i=0;i<n;i++){
            int count = 0;
            for(int j=n-1;j>=0;j--){
                if(grid[i][j] == 0)
                    count++;
                else
                    break;
            }
            zero[i] = count;

        }
        int swap = 0;
        for(int i=0;i<n;i++){
            int need = n-1-i;
            int j = i;
            while(j<n && zero[j]<need)
                j++;
            if(j == n)
                return -1;
            while(j>i){
                int t = zero[j];
                zero[j] = zero[j-1];
                zero[j-1] = t;
                swap++;
                j--;
            }
        }
        return swap;
    }
}