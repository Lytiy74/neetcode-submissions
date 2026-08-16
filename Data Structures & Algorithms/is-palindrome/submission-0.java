class Solution {
    public boolean isPalindrome(String s) {
                s = s
                .toLowerCase()
                .replaceAll("[^a-zA-Z\\d]", "");


        char[] charArray = s.toCharArray();
        for (int front = 0, back = charArray.length-1; front < charArray.length/2 ; front++, back--) {
            if (charArray[front] != charArray[back]) return false;
        }

        return true;
    }
}
