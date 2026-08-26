class Solution {
    public int search(int[] nums, int target) {
                int lowerBound = 0;
        int upperBound = nums.length - 1;

        while (lowerBound <= upperBound) {
            int middle = (upperBound + lowerBound) / 2;

            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] > target) {
                upperBound = middle - 1;
            } else {
                lowerBound = middle + 1;
            }
        }

        return -1;
    }
}
