class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n <= 2) return n;

        int left = 2;   // next write position
        int right = 2;  // scanner

        while (right < n) {
            // Compare current with the element 2 positions behind in the kept region
            if (nums[right] != nums[left - 2]) {
                nums[left] = nums[right];
                left++;
            }
            right++;
        }
        return left;
    }
}
