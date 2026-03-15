class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] a = new int[n+m];
        int i=0,j=0,k=0;
        while(i<n && j<m){
            if(nums1[i]<nums2[j]){
                a[k] = nums1[i];
                i++;
                k++;
            }
            else{
                a[k] = nums2[j];
                j++;
                k++;
            }
        }
        while(i<n){
            a[k] = nums1[i];
            i++;
            k++;
        }
        while(j<m){
            a[k] = nums2[j];
            j++;
            k++;
        }
        if((n+m)%2 != 0)
            return a[(n+m)/2];
        else{
            int mid = (n+m)/2;
            double r = (a[mid]+a[mid-1])/2.0; 
            return r;
        }
    }
}