class Solution {
    public String toLowerCase(String s) {
        
        StringBuilder st = new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            int c = s.charAt(i);
            if(c>=65 && c<=90){
               char str = (char)(c+32);
                st.setCharAt(i,str);
            }
        }
        return st.toString();
    }
}