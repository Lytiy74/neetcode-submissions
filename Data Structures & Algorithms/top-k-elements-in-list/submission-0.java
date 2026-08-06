class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        List<Integer>[] bucket = new List[nums.length + 1];

        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = new ArrayList<>();
        }

        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        for (Integer number : frequencyMap.keySet()) {
            Integer frequency = frequencyMap.get(number);
            bucket[frequency].add(number);
        }

        int[] result = new int[k];

        for (int i = bucket.length - 1, resultIndex = 0; i >= 0; i--) {
            List<Integer> integers = bucket[i];
            if (resultIndex >= k)
                return result;
            for (Integer integer : integers) {
                result[resultIndex] = integer;
                resultIndex++;
            }
        }
        return result;
    }
}
