class Solution {
    public int[] sortByBits(int[] arr) {
        int n = arr.length;
        Integer[] t = new Integer[n];
        for(int i=0;i<n;i++)
            t[i] = arr[i]; 

        Arrays.sort(t, (a,b) ->{
            Integer d = Integer.bitCount(a) - Integer.bitCount(b);
            return d == 0 ? a-b : d;
        });


        for(int i=0;i<n;i++)
            arr[i] = t[i]; 

        return arr;
    }
}