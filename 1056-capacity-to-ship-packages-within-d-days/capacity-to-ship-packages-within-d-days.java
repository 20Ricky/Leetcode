class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int low = 0, high = 0;

        // Determine search range
        for (int w : weights) {
            low = Math.max(low, w); // at least the heaviest package
            high += w;              // at most ship everything in one day
        }

        int ans = high;

        // Binary Search on capacity
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canShip(weights, days, mid)) {
                ans = mid;          // capacity works
                high = mid - 1;     // try smaller capacity
            } else {
                low = mid + 1;      // capacity too small
            }
        }

        return ans;
    }

    private boolean canShip(int[] weights, int days, int capacity) {
        int daysUsed = 1;
        int currentLoad = 0;

        for (int w : weights) {
            if (currentLoad + w <= capacity) {
                currentLoad += w;
            } else {
                daysUsed++;
                currentLoad = w;
                if (daysUsed > days) return false;
            }
        }

        return true;
    }
}
