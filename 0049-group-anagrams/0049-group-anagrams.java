class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();
        for(String s:strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String sort = new String(c);
            if(map.containsKey(sort))
                map.get(sort).add(s);
            else{
                map.put(sort, new ArrayList<>(List.of(s)));
            }
        }

        for(List<String> list : map.values()){
            ans.add(list);
        }
        return ans;
    }
}