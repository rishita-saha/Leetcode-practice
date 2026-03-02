class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(numbers[i] + numbers[j] == target)
        //             return new int[]{i+1,j+1};
        //     }
        // }
        HashMap<Integer,Integer> s = new HashMap<>();

        for(int i=0;i<n;i++){
            
            if(s.containsKey(target-numbers[i]))
                return new int[]{s.get(target-numbers[i])+1,i+1};

            s.put(numbers[i],i);
        }

        return new int[]{-1,-1};
    }
}