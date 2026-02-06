class Solution {
    public boolean checkIfPangram(String sentence) {
        int lenOfInput = sentence.length();
        if(lenOfInput < 26) return false;
        int[] freqArray = new int[26];
        for(char ch : sentence.toCharArray()) {
            freqArray[ch - 'a']++;
        }

        for(int element : freqArray) {
            if(element < 1 || element == 0) {
                return false;
            }
        }

        return true;
    }
}