class Solution {
    private final Map<String, java.util.function.BiFunction<Integer, Integer, Integer>> operators =
            Map.of("+", Integer::sum,
                    "-", (p1, p2) -> p1 - p2,
                    "*", (p1, p2) -> p1 * p2,
                    "/", (p1, p2) -> p1 / p2
            );

    public int evalRPN(String[] tokens) {
        Stack<Integer> operands = new Stack<>();

        for (String token : tokens) {
            if (operators.containsKey(token)) {
                int firstOperand = operands.pop();
                int secondOperand = operands.pop();

                operands.push(operators.get(token).apply(secondOperand, firstOperand));


            } else {
                operands.push(Integer.parseInt(token));
            }
        }
        return operands.pop();
    }
}