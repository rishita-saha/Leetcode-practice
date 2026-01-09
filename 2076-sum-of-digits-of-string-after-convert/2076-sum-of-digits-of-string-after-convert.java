class Solution {
    public int getLucky(String s, int k) {
        StringBuilder str = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            str.append(s.charAt(i) - 'a' + 1);
        }

       while (k-- > 0) {
            int sum = 0;
            for (char c : str.toString().toCharArray()) {
                sum += c - '0';
            }
            str = new StringBuilder(String.valueOf(sum));
        }

        return Integer.parseInt(str.toString());
    }
}