class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        for (int[] ints : matrix) {
            int left = 0;
            int right = ints.length - 1;

            if (ints[left] > target && ints[right] > target) {
                return false;
            } else if (ints[left] < target && ints[right] < target) {
                continue;
            }

            while (left <= right) {
                int middle = (right + left) / 2;

                if (ints[middle] > target) {
                    right = middle - 1;
                } else if (ints[middle] < target) {
                    left = middle + 1;
                } else {
                    return true;
                }
            }

        }

        return false;
    }
}
