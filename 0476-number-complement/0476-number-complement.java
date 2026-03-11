class Solution {
    public int findComplement(int num) {
        if(num == 0)
            return 1;
        long m = 1;
        while(m<=num){
            m <<= 1;
        }
        return (int)((m-1)^num);
    }
}