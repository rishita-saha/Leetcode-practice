class Solution {
    public boolean isHappy(int n) {
        if(n<0)
            return false;
        HashSet<Integer> s = new HashSet<>();
        while(true){
            int sum = 0;
            while(n>0){
                int d = n%10;
                sum = sum + d*d;
                n /= 10;
            }
            if(sum == 1)
                return true;
            n = sum;
            if(s.contains(n))
                return false;
            s.add(n);
        }
    }
}