class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int left=0,right=n-1;
        int [] res=new int[n];
        int pos=n-1;
        while(left<=right){
            int lsq=nums[left]*nums[left];
            int rsq=nums[right]*nums[right];
                if(lsq<rsq){
                    res[pos]=rsq;
                    right--;
                }
                else {
                    res[pos]=lsq;
                    left++;
                }
                pos--;
        }
                return res;
    }
}