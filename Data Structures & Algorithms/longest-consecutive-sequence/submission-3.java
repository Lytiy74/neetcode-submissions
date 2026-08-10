class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        Set<Integer> integerHashSet = new HashSet<>();

        for (int num : nums) {
            integerHashSet.add(num);
        }


        int maxLength = 1;
        for (int i : integerHashSet) {
            
            if (!integerHashSet.contains(i - 1)) {
                int count = 1;
                while (integerHashSet.contains(i + 1)) {
                    i++;
                    count++;
                }
                maxLength = Math.max(maxLength, count);
            }
        }
        return maxLength;
    }
}
