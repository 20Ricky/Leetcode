class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int []sola=new int[n];
        int pp=0,np=1;
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                sola[np]=nums[i];
                np=np+2;
            }
            else{
                sola[pp]=nums[i];
                pp=pp+2;
            }
        }
            return sola;
    }
}