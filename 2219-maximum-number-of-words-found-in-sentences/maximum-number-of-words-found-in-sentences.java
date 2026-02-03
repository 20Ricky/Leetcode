class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;

        for (int i = 0; i < sentences.length; i++) {
            String sentence = sentences[i];
            int spaces = 0;

            for (int j = 0; j < sentence.length(); j++) {
                if (sentence.charAt(j) == ' ') {
                    spaces++;
                }
            }

            int words = spaces + 1;
            maxWords = Math.max(maxWords, words);
        }

        return maxWords;
    }
}
