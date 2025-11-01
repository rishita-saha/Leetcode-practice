class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "");
        String st = str.toLowerCase();
        int l=0;
        int r = st.length()-1;
        while(l<=r){
            if(st.charAt(l) != st.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}