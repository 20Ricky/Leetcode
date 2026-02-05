class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length==1) return;
        int left=0,right=0;
        while(right<nums.length){
            if(nums[right]==0) right++;
            else{
                nums[left]=nums[right];
                left++;
                right++;
            }
        }
        for(int i=left;i<nums.length;i++){
            nums[i]=0;
        }
    }
}