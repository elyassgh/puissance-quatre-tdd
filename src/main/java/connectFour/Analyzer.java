package connectFour;

import java.util.Optional;

public class Analyzer {

    public Optional<Character> check(Grid grid) {

        if (grid.isFull())
            return Optional.empty();

        Character winnerR = findWinner(grid.getRows());
        if (winnerR != null) return Optional.of(winnerR);

        Character winnerC = findWinner(grid.getColumns());
        if (winnerC != null) return Optional.of(winnerC);

        Character winnerD = findWinner(grid.getDiagonals());
        if (winnerD != null) return Optional.of(winnerD);

        return Optional.empty();

    }

    public Character findWinner(char[][] list) {
        char winner;
        int count;
        for (char[] chars : list) {
            count = 1;
            winner = chars[0];
            for (int i = 1; i < chars.length; i++) {
                if (winner == chars[i]) {
                    count++;
                    if (count >= 4) return winner;
                } else {
                    count = 1;
                    winner = chars[i];
                }
            }
        }
        return null;
    }


}
