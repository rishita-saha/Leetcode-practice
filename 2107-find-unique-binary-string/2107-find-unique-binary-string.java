class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
        StringBuilder s = new StringBuilder();
        for(int i=0;i<n;i++){
            char c =nums[i].charAt(i)=='0'? '1' : '0';
            s.append(c);
        }
        return s.toString();
    }
}