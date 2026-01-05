class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        int r = 0 ,n = x;
        while(n!=0){
            int d = n % 10;
            n /= 10;
            if(r >= Integer.MAX_VALUE || r <= Integer.MIN_VALUE)
                return false;
            r = r*10 + d;
        }
        if(x == r)
            return true;
        else
            return false;
    }
}