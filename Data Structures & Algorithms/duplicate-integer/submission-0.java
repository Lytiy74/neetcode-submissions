class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> integerSet = new HashSet<>();
        for(int num : nums){
            if (integerSet.contains(num)) return true;
            integerSet.add(num);
        } 
        return false;
    }
}