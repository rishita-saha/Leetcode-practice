class Solution {
    public int repeatedNTimes(int[] nums) {
    
    HashMap<Integer, Integer> map = new HashMap<>();
    // for (int n : nums) {
    //     if (map.containsKey(n)) {
    //         map.put(n, map.get(n) + 1);
    //     } 
    //     else {
    //         map.put(n, 1);
    //     }
    // }
    for (int n : nums) {
        if (map.containsKey(n)) {
            return n;
        } 
        else {
            map.put(n, 1);
        }
    }

    
    // for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
    //         if (entry.getValue() == (nums.length)/2) {
    //             return entry.getKey();
    //         }
    //     }

    
    return -1;
}
}