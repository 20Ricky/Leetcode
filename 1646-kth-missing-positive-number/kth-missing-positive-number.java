class Solution {
    public int findKthPositive(int[] arr, int k) {

        int i = 1;
        ArrayList<Integer> list = new ArrayList<>();
        int idx = 0;

        while (list.size() < k) {

            if (idx < arr.length && arr[idx] == i) {
                idx++;   // move in given array
            } else {
                list.add(i); // i is missing
            }
            i++;
        }

        return list.get(k - 1);
    }
}
