class Solution {
    public int minimumDeletions(String s) {
        Stack<Character> st = new Stack<>();
        int c=0;
        for(char ch : s.toCharArray()){
            if(ch == 'b'){
                st.push(ch);

            }
            else{
                if(!st.isEmpty()){
                    c++;
                    st.pop();
                }
            }
        }
        return c;
    }
}