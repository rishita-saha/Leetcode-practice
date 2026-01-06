class Solution {
    public int pivotInteger(int n) {
        int total = (n*(n+1))/2;
        int p = (int) Math.sqrt(total);
        if(p*p == total)
            return p;
        else
            return -1;
    }
}