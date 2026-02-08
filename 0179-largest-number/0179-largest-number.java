class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length;
        String[] s = new String[n];
        for(int i=0;i<n;i++){
            s[i] = Integer.toString(nums[i]);
        }

        Arrays.sort(s,new Comparator<String>(){
            public int compare(String a,String b){
                String fst = a+b;
                String sec = b+a;
                return sec.compareTo(fst);
            }
        });
        if(s[0].equals("0"))
            return "0";
        StringBuilder sb = new StringBuilder();
        for(String i:s){
            sb.append(i);
        }
        return sb.toString();
    }
}