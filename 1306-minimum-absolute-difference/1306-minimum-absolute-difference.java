class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        List<List<Integer>> r = new ArrayList<>();
        for(int i=1;i<n;i++){
            min = Math.min(min, arr[i]-arr[i-1]);
        }
        for(int i=1;i<n;i++){
            if(arr[i]-arr[i-1] == min)
                r.add(Arrays.asList(arr[i - 1], arr[i]));
        }
        return r;
    }
}