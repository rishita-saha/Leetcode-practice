class Solution {
    public int minPartitions(String n) {
        int maxd = 0;
        for(int i=0;i<n.length();i++){
            int d = n.charAt(i) - '0';
            maxd = Math.max(maxd, d);
        }
        return maxd;
    }
}