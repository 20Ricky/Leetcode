class Solution {
    public int maxSubArray(int[] nums) {
      int csum=0,msum=Integer.MIN_VALUE;
      for(int num:nums){
        csum=Math.max(num,csum+num);
        msum=Math.max(csum,msum);
      } 
            return msum;
    }
}