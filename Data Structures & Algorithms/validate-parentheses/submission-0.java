class Solution {
    public boolean isValid(String s) {
        Stack<Character> bracketsStack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (isOpenedBracket(c)) bracketsStack.push(getEnclosedPair(c));

            if (isClosedBracket(c)) {
                if (bracketsStack.isEmpty()) return false;
                if (bracketsStack.pop() != c) return false;
            }
        }

        return bracketsStack.isEmpty();
    }

    private char getEnclosedPair(char bracket) {
        if (bracket == '[') {
            return ']';
        } else if (bracket == '(') {
            return ')';
        } else {
            return '}';
        }
    }


    private boolean isClosedBracket(char c) {
        return c == ']' || c == ')' || c == '}';
    }

    private boolean isOpenedBracket(char c) {
        return c == '[' || c == '(' || c == '{';
    }
}
