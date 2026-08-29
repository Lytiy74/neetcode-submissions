class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = Integer.MIN_VALUE;
        for (int pile : piles) {
            right = Integer.max(pile, right);
        }
        int result = right;

        while (left <= right) {
            int middle = (right + left) / 2;

            long takedTime = 0;
            for (int pile : piles) {
                takedTime +=  (pile + middle - 1) / middle;
            }

            if (takedTime > h) {
                left = middle + 1;
            } else {
                result = middle;
                right = middle - 1;
            }

        }

        return result;

    }
}
