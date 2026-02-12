class Solution {
    public int longestPalindrome(String s) {
        int[] freq = new int[128]; // ASCII safe

        // 1. Count frequencies
        for (char ch : s.toCharArray()) {
            freq[ch]++;
        }

        int length = 0;
        boolean hasOdd = false;

        // 2. Compute palindrome length
        for (int f : freq) {
            if (f % 2 == 0) {
                length += f;
            } else {
                length += f - 1;
                hasOdd = true;
            }
        }

        // 3. One odd allowed in the center
        if (hasOdd) length += 1;

        return length;
    }
}
