class MinStack {

    private Stack<Integer> minimalValuesStack;
    private Stack<Integer> stack;

    public MinStack() {
        minimalValuesStack = new Stack<>();
        stack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);

        if (minimalValuesStack.isEmpty() || minimalValuesStack.peek() >= val) {
            minimalValuesStack.push(val);
        }


    }

    public void pop() {

        int popped = stack.pop();

        if (minimalValuesStack.peek() == popped) minimalValuesStack.pop();

    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minimalValuesStack.peek();
    }
}
