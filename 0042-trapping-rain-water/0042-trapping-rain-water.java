class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int total = 0;
        int[] l = new int[n];
        int[] r = new int[n];
        l[0] = height[0];
            for(int j=1;j<n;j++){
                l[j] = Math.max(l[j-1],height[j]);
            }
        r[n-1] = height[n-1];
            for(int j=n-2;j>=0;j--){
                r[j] = Math.max(r[j+1],height[j]);
            }
            for(int i=0;i<n;i++){
            total += Math.min(l[i],r[i]) - height[i];
            }
        return total;
    }
}