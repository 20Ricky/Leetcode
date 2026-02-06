class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int left=m-1,right=n-1;
        int ns=(m+n)-1;
        while(left>=0&&right>=0){
            if(nums1[left]>=nums2[right]){
                nums1[ns]=nums1[left];
                left--;
            }
            else{
                nums1[ns]=nums2[right];
                right--;
            }
                ns--;
        }
        while (right >= 0) {   
            nums1[ns] = nums2[right];
            right--;
            ns--;
        }
    }
}