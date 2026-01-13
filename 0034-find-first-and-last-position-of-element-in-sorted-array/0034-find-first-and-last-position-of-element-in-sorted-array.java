class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] a = {-1,-1};
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) { //first occurance of the num
            int mid = left + (right - left) / 2; 

            if (nums[mid] == target) {
                a[0] = mid;
                right = mid - 1;           
            } else if (nums[mid] < target) {
                left = mid + 1;       
            } else {
                right = mid - 1;      
            }
        }
        a[1] = a[0];
        if(a[0] != -1){
            for(int i=a[0]+1;i<nums.length;i++){
                if(nums[i] == target){
                    a[1] = i;
                }
                else
                    break;
            }
        }

        // int left = 0;
        // int right = nums.length - 1;

        // while (left <= right) {
        //     int mid = left + (right - left) / 2; 

        //     if (arr[mid] == target) {
        //         a[1] = mid;
        //         left = mid + 1;           
        //     } else if (arr[mid] < target) {
        //         left = mid + 1;       
        //     } else {
        //         right = mid - 1;      
        //     }
        // }

        return a;
    }
}