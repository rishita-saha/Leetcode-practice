class Solution {
    public boolean hasAllCodes(String s, int k) {
        int need = 1 << k;
        HashSet<Integer> seen = new HashSet<>();
        for(int i=0;i<=s.length()-k;i++){
            String sub = s.substring(i,i+k);
            seen.add(Integer.parseInt(sub,2));
            if (seen.size() == need)
                    return true;
        }
        return false;
    }
}