class Solution {
    public int maxArea(int[] height) {
        int result = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {

            int containerHeight = Math.min(height[left], height[right]);
            int containerWidth = right - left;
            result = Math.max(result, containerWidth * containerHeight);


            if (height[left] < height[right]) {
                left++;
            } else if (height[left] > height[right]){
                right--;
            } else {
                left++;
                right--;
            }

        }

        return result;
    }
}
