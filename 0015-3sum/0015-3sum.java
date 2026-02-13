class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        
        Set<List<Integer>> s = new HashSet<>();
        //Brute force
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         for(int k=j+1;k<n;k++){
        //             int sum = nums[i] + nums[j] + nums[k];
        //             if(sum == 0){
        //                 List<Integer> list = Arrays.asList(nums[i],nums[j],nums[k]);
        //                 Collections.sort(list);
        //                 s.add(list);
        //             }
        //         }
        //     }
        // }

        //Better approach 
        for(int i=0;i<n;i++){
            Set<Integer> h =new HashSet<>();
            for(int j=i+1;j<n;j++){
                int td = -(nums[i] + nums[j]);
                if(h.contains(td)){
                    List<Integer> list = Arrays.asList(nums[i],nums[j],td);
                    Collections.sort(list);
                    s.add(list); 
                }
                h.add(nums[j]);
            }
        }

        List<List<Integer>> res = new ArrayList<>(s);
        return res;
    }
}