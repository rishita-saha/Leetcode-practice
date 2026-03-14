class Solution {
    static char[] letters = {'a','b','c'};

    public static void generate(int n, String curr, List<String> res){
        if(curr.length() == n){
            res.add(curr);
            return;
        }

        for(char c : letters){
            if(curr.isEmpty() || curr.charAt(curr.length()-1) != c){
                generate(n, curr + c, res);
            }
        }
    }

    public String getHappyString(int n, int k) {
        if(3*(Math.pow(2,n-1))<k)
            return "";
        List<String> result = new ArrayList<>();

        generate(n, "", result);

        return result.get(k-1); 
    }
}