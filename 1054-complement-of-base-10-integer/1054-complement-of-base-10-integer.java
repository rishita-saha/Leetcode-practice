class Solution {
    public int bitwiseComplement(int n) {
        String s = Integer.toBinaryString(n);
        String b = "";
        for(char c: s.toCharArray()){
            if(c == '1')
                b = b + '0';
            else
                b = b + '1';
        }
        return Integer.parseInt(b, 2);
    }
}