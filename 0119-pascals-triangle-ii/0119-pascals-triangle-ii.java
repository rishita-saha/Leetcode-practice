class Solution {
    public List<Integer> getRow(int rowIndex) {
        long ans = 1;
        List<Integer> r = new ArrayList<>();
        r.add(1);
        for(int i=1;i<=rowIndex;i++){
            ans = ans * (rowIndex-i+1) / i;

            r.add((int) ans);
        }
        return r;
    }
}