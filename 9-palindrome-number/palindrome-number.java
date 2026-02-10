class Solution {
    public boolean isPalindrome(int x) {
       if(x<0 || (x%10==0 && x!=0 )) return false;
            int revhalf=0;
            while(x>revhalf){
                int ld = x%10;
                revhalf = revhalf*10 + ld;
                x = x/10;
            }
            return (x == revhalf || x==revhalf/10) ;
    }
}