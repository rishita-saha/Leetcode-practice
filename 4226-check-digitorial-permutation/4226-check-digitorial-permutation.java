class Solution {
    public int fact(int n){
        if(n == 1 || n ==0){
            return 1;
        }
        return n*fact(n-1);
    }
    public boolean isDigitorialPermutation(int n) {
        int sum = 0;
        int x = n;
        while(x>0){
            int d = x%10;
            sum += fact(d);
            x /= 10;
        }
        char[] a = String.valueOf(n).toCharArray();
        char[] b = String.valueOf(sum).toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a,b);
    }
}