class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = null;
        
        for (int front = 0, end = numbers.length - 1; front < numbers.length && end >= 0;) {
            
            if (numbers[front] + numbers[end] > target) end--;
            if (numbers[front] + numbers[end] < target) front++;
            if (numbers[front] + numbers[end] == target) {
                result = new int[]{front+1, end+1};
                break;
            }
        }
        return result;
    }
}
