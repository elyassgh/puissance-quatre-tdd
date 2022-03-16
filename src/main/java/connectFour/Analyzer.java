package connectFour;

import java.util.Optional;

public class Analyzer {

    public Optional<Character> check(Grid grid) {

        if (grid.isFull())
            return Optional.empty();

        return Optional.of('M');

    }

    public void checkRow(char[][] matrix) {
        char winner;
        int count = 0;
        for (char[] chars : matrix) {
            for (int j = 1; j < matrix[0].length; j++) {
                // TODO
            }
        }
    }

    public void checkColumn(char[][] matrix) {
        // TODO
    }

    public void checkDiagonal(char[][] matrix) {
        // TODO
    }

}
