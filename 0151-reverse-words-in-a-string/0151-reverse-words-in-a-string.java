class Solution {
    public String reverseWords(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        int n = s.length();
        String ans = "";
        for(int i=0;i<n;i++){
            String w = "";
            while(i<n && rev.charAt(i) == ' ')
                i++;
            while(i<n && rev.charAt(i) != ' '){
                w += rev.charAt(i);
                i++;
            }
            if(w.length() > 0)
                ans += " " + (new StringBuilder(w).reverse().toString());
        }
        return ans.substring(1);
    }
}