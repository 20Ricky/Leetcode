class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1,high=0;
        for(int n:piles){
            high = Math.max(high, n);
        }
        int ans=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isPossible(piles,h,mid)){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
            return ans;
    }
    public boolean isPossible(int piles[],int h,int k){
        int hour=0;
        for(int n:piles){
            hour+=(n+k-1)/k;
            if(hour>h) return false;
            
        }
             return true;
    }
}