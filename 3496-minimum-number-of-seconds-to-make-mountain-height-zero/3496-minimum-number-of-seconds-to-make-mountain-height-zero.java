class Solution {
    public boolean check(long m,int[] wt,int mh){
        long h = 0;
        for(int i : wt){
            h += (long)((Math.sqrt(1.0 + 8.0 * m / i) - 1) / 2);
            if(h >= mh)
                return true;
        }
        return false;
    }

    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {
        int max = Arrays.stream(workerTimes).max().getAsInt();

        long l = 1;
        long r = (long)max * mountainHeight * (mountainHeight + 1) / 2;

        long ans = 0;

        while(l <= r){
            long mid = l + (r - l) / 2;

            if(check(mid, workerTimes, mountainHeight)){
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return ans;
    }
}