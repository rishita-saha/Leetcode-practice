class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j = height.length-1;
        int maxw = 0;
        while(i<j){
            int w = (Math.min(height[i],height[j]))*(j-i);
            if(height[i] < height[j])
                i++;
            else    j--;
            maxw = Math.max(maxw,w);
        }
        return maxw;
    }
}