class Solution {
    public int longestBalanced(String s) {
       int ca=0,cb=0,cc=0,max=0;
       int n = s.length();

       HashMap<String,Integer> map = new HashMap<>();
       map.put("0#0" , -1);
    //case 1 only one char
    for(int i=0;i<n;){
        char ch = s.charAt(i);
        int l=0;
        while(i<n && ch == s.charAt(i)){
            i++;
            l++;
        }
        max= Math.max(max,l);
    }

    //case 2 only 2 char
    max= Math.max(max,getLen(s,'a'));
    max= Math.max(max,getLen(s,'b'));
    max= Math.max(max,getLen(s,'c'));

    //case 3 where 3char is available 
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch == 'a')
                ca++;
            else if(ch == 'b')
                cb++;    
            else 
                cc++;

            int d1 = ca-cb;
            int d2 = ca-cc;
            String key = d1+"#"+d2;

            if(map.containsKey(key))
                max = Math.max(max,i-map.get(key));
            else
                map.put(key,i);
            
        }
        return max;
    }
    public static int getLen(String s,char skip){
        int ml=0;
        char fst = (skip == 'a') ? 'b' : 'a';
        char sec = (skip == 'c') ? 'b' : 'c';
        
        int i=0;
        int n= s.length();
        while(i<n){
            int c1=0,c2=0,len=0;
            HashMap<Integer,Integer> map = new HashMap<>();
            map.put(0,i-1);
            while(i<n && skip != s.charAt(i)){
                if(s.charAt(i) == fst)
                   c1++;
                else
                   c2++;
                if(map.containsKey(c1-c2))
                  ml = Math.max(ml,i-map.get(c1-c2));
                else
                   map.put(c1-c2,i);
                i++;
            }
            i++;
        }
        return ml;
    }
}