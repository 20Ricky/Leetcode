class Solution {
    public int strStr(String haystack, String needle) {
        int n=0;
        int m=needle.length();
        while(m<=haystack.length()){
            if(haystack.substring(n, m).equals(needle)
) 
                return n;
            else {
                n++;
                m++;
            }
        }
            return -1;
    }
}