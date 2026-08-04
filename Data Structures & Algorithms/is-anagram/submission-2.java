class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return  false;

        Map<Character, Integer> charactersOfFirstString = new HashMap<>();
        Map<Character, Integer> charactersOfSecondString = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            charactersOfFirstString.put(s.charAt(i), charactersOfFirstString.getOrDefault(s.charAt(i), 0) + 1);
            charactersOfSecondString.put(t.charAt(i), charactersOfSecondString.getOrDefault(t.charAt(i), 0) + 1);
        }

        return charactersOfFirstString.equals(charactersOfSecondString);
    }
}
