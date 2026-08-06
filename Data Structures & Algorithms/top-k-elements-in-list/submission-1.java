class Solution {
    public int[] topKFrequent(int[] nums, int k) {
          Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] buckets = new ArrayList[nums.length + 1];

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int num = entry.getKey();
            int frequency = entry.getValue();

            if (buckets[frequency] == null) {
                buckets[frequency] = new ArrayList<>();
            }
            buckets[frequency].add(num);
        }

        int[] result = new int[k];

        for (int i = buckets.length - 1, resultIndex = 0; i >= 0 && resultIndex < k; i--) {
            if (buckets[i] != null) {
                for (int num : buckets[i]) {
                    result[resultIndex++] = num;
                    if (resultIndex == k) {
                        return result;
                    }
                }
            }
        }
        return result;
    }
}
