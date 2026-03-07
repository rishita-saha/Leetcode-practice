class Solution {
    public int minFlips(String s) {
        String str = s + s;
        int min = Integer.MAX_VALUE;
        int st0 = 0;
        int st1 = 0;
        for(int i=0;i<2*s.length();i++){
            char ch = str.charAt(i);
            if(i%2 == 0){
                if(ch == '0')
                    st1++;
                else
                    st0++;
            }
            else{
                if(ch == '0')
                    st0++;
                else
                    st1++;
            }
            if(i >= s.length()-1){
                min = Math.min(min, Math.min(st0,st1));
                int p = i-s.length()+1;
                char c = str.charAt(p);
                if(p%2 == 0){
                    if(c == '0')
                        st1--;
                    else
                        st0--;
                }
                else{
                    if(c == '0')
                        st0--;
                    else
                        st1--;
                }
            }
        }
        return min;
    }
}