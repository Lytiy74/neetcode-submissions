class Solution {
    public static final int ALPHABET_START_CODE = 97;
    public List<List<String>> groupAnagrams(String[] strs) {
                if (strs.length == 0) return List.of(List.of());
        if (strs.length == 1) return List.of(List.of(strs[0]));
        Map<String, List<String>> countLettersWithWords = new HashMap<>();

        for (String str : strs) {
            int[] charCountArray = new int[26];
            for (char c : str.toCharArray()) {
                charCountArray[c- ALPHABET_START_CODE] += 1;
            }
                String key = Arrays.toString(charCountArray);

            if (!countLettersWithWords.containsKey(key)) {
                List<String> stringGroup = new ArrayList<>();
                stringGroup.add(str);
                countLettersWithWords.put(key, stringGroup);
            } else {
                List<String> stringGroup = countLettersWithWords.get(key);
                stringGroup.add(str);
            }
        }

        List<List<String>> result = new ArrayList<>();

        for (String string: countLettersWithWords.keySet()) {
            List<String> stringGroup = countLettersWithWords.get(string);
            result.add(stringGroup);
        }
        return result;
    }
}
