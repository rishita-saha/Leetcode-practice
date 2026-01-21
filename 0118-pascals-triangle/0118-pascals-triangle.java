class Solution {
    public static List<Integer> genRow(int row){
        int ans = 1;
        List<Integer> r = new ArrayList<>();
        r.add(ans);
        for(int i=1;i<row;i++){
            ans *= (row-i);
            ans /= i;
            r.add(ans);
        }
        return r;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            ans.add(genRow(i));
        }
        return ans;
    }
}