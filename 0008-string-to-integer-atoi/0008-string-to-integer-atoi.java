class Solution {
    public int myAtoi(String s) {
        if (s == null || s.length() == 0)
            return 0;
        int n = s.length();
        int i=0,sign=1;
        long num=0;
        //ignore whitw spaces
        while(i<n && s.charAt(i) == ' ')
            i++;
        //check sign
        if(i<n && (s.charAt(i) == '+' || s.charAt(i) == '-')){
            if(s.charAt(i) == '-')
                sign = -1;
            i++;
        }
        //convert number 
        while(i<n && (s.charAt(i)>= '0' && s.charAt(i) <= '9')){
            int d = s.charAt(i) - '0';
            num = num*10 + d;
            i++;
            if (sign * num > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            if (sign * num < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;

        }
        return (int)(sign*num);
    }
}