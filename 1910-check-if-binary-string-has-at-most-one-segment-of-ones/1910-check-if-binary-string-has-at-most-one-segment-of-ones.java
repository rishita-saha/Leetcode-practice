class Solution {
    public boolean checkOnesSegment(String s) {
        // for(int i=1;i<s.length();i++){
        //     if(s.charAt(i-1)=='0' && s.charAt(i)=='1')
        //         return false;
        // }
        // return true;
        int i=0,n=s.length();
        while(i<n && s.charAt(i)=='1')
            i++;
        while(i<n && s.charAt(i)=='0')
            i++;
        return i>=n ? true : false;
    }
}