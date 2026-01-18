class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

        int n = bloomDay.length;

        // Step 0: Impossible case
        if ((long) m * k > n) {
            return -1;
        }

        // Step 1: Find search space
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for (int day : bloomDay) {
            low = Math.min(low, day);
            high = Math.max(high, day);
        }

        int ans = -1;

        // Step 2: Binary Search on days
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canMakeBouquets(bloomDay, m, k, mid)) {
                ans = mid;          // possible, try earlier day
                high = mid - 1;
            } else {
                low = mid + 1;      // not possible, need more days
            }
        }

        return ans;
    }

    private boolean canMakeBouquets(int[] bloomDay, int m, int k, int day) {
        int bouquets = 0;
        int consecutive = 0;

        for (int bloom : bloomDay) {
            if (bloom <= day) {
                consecutive++;
                if (consecutive == k) {
                    bouquets++;
                    consecutive = 0; // flowers used
                }
            } else {
                consecutive = 0; // adjacency breaks
            }
        }

        return bouquets >= m;
    }
}
