class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = null;

        int front = 0, end = numbers.length - 1;
        while (front < end) {

            if (numbers[front] + numbers[end] > target) {
                end--;
            } else if (numbers[front] + numbers[end] < target) {
                front++;
            } else {
                result = new int[]{front+1, end+1};
                break;
            }
        }
        return result;
    }
}
