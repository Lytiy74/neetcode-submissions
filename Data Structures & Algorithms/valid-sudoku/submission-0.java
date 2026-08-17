class Solution {
    public boolean isValidSudoku(char[][] board) {
        List<Set<Character>> rows = new ArrayList<>();
        List<Set<Character>> columns = new ArrayList<>();
        List<Set<Character>> squares = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {
            rows.add(i, new HashSet<>());
            columns.add(i, new HashSet<>());
            squares.add(i, new HashSet<>());

        }

        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board[row].length; column++) {
                int squareIndex = (row / 3) * 3 + (column / 3);
                Character cellValue = board[row][column];

                if (!Character.isDigit(cellValue)) continue;

                if (rows.get(row).contains(cellValue)
                        || columns.get(column).contains(cellValue)
                        || squares.get(squareIndex).contains(cellValue)) {
                    return false;
                }
                rows.get(row).add(cellValue);
                columns.get(column).add(cellValue);
                squares.get(squareIndex).add(cellValue);
            }

        }

        return true;
    }
}
