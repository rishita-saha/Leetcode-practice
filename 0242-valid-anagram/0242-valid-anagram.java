class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> sh = new HashMap<>();
        HashMap<Character,Integer> th = new HashMap<>();
        for(char c: s.toCharArray()){
            if(sh.containsKey(c))
                sh.put(c,sh.get(c)+1);
            else
                sh.put(c,1);
        }
        for(char c: t.toCharArray()){
            if(th.containsKey(c))
                th.put(c,th.get(c)+1);
            else
                th.put(c,1);
        }
        if(sh.equals(th))
            return true;
        else
            return false;
    }
}