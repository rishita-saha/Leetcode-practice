class Solution {
    public int longestBalanced(String s) {
        int n,max;
        n = s.length();
        max = 0;
        for(int i=0;i<n;i++){
            int[] frq = new int[26];
            
            for(int j=i;j<n;j++){
                frq[s.charAt(j)-'a']++;

                int ex = 0;
                boolean val = true;
                for(int k=0;k<26;k++){
                    if(frq[k]>0){
                        if(ex == 0)
                            ex = frq[k];
                        else if(ex != frq[k]){
                            val = false;
                            break;
                        }
                    }

                }
                if(val)
                    max = Math.max(max,j-i+1);
            }
        }
        return max;
    }
}