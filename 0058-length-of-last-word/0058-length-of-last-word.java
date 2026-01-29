class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length()-1;
        int c = 0;
        while(n>=0 && s.charAt(n) == ' ')
            n--;
        for(int i=n;i>=0;i--){
            if(s.charAt(i) != ' ')
                c++;
            if(s.charAt(i) == ' ')
                break;
        }
        return c;
    }
}