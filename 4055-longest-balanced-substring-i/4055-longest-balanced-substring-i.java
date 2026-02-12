class Solution {
    public int longestBalanced(String s) {
        int n,max;
        n = s.length();
        max = 0;
        for(int i=0;i<n;i++){
            int[] frq = new int[26];
            int dist = 0,mf = 0;
            for(int j=i;j<n;j++){
                if(frq[s.charAt(j)-'a'] == 0)
                    dist++;

                frq[s.charAt(j)-'a']++;

                mf = Math.max(mf,frq[s.charAt(j)-'a']);

                if(j-i+1 == dist*mf)
                    max = Math.max(max,j-i+1);
            }
        }
        return max;
    }
}