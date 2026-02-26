class Solution {
    public int numSteps(String s) {
        int n = s.length();
        int c = 0;
        int ans = 0;
        for(int i=n-1;i>=1;i--){
            if(((s.charAt(i)- '0')+c)%2 == 1){
                ans += 2;
                c = 1;
            }
            else
                ans++;
        }
        return c+ans;
    }
}