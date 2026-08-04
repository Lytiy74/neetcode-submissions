class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> charactersOfFirstString = new HashMap<>();
        Map<Character, Integer> charactersOfSecondString = new HashMap<>();

        for (char c : s.toCharArray()) {
            charactersOfFirstString.put(c, charactersOfFirstString.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            charactersOfSecondString.put(c, charactersOfSecondString.getOrDefault(c, 0) + 1);
        }

        return charactersOfFirstString.equals(charactersOfSecondString);
    }
}
