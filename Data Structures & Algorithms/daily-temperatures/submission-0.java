class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
                Stack<Integer> waitingDays = new Stack<>();
        int[] result = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {

                while(!waitingDays.empty() && temperatures[waitingDays.peek()] < temperatures[i]) {
                    int waitedDayIndex = waitingDays.pop();

                    result[waitedDayIndex] = i - waitedDayIndex;

                }

                waitingDays.push(i);

        }

        return result;
    }
}
