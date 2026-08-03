class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int result = 0;
        for (int num : nums) {
            result = num == 1 ? ++result : 0;
            max = Math.max(result, max);
        }
        return max;
    }
}