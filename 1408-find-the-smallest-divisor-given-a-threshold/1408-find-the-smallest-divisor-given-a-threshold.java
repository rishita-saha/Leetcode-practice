class Solution {
    public int smallestDivisor(int[] nums, int threshold) {

        int left = 1;
        int right = 0;

        // find max element
        for (int num : nums) {
            right = Math.max(right, num);
        }

        int answer = right;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            int sum = 0;
            for (int num : nums) {
                sum += (num + mid - 1) / mid; // ceiling division
            }

            if (sum <= threshold) {
                answer = mid;        // valid divisor
                right = mid - 1;     // try smaller
            } else {
                left = mid + 1;      // need bigger divisor
            }
        }

        return answer;
    }
}
