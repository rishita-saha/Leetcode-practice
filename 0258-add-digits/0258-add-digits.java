class Solution {
    public int addDigits(int num) {
        if(num == 0)    return 0;
        
        while(num >= 10){
           int d = 0;
           while(num != 0){
             d = d + (num%10);
            num /= 10;
           }
           num = d;
        }
        return num;
    }
}