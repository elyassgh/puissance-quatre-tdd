package connectFour;

import java.util.Arrays;

public class Grid {

    private char[][] matrix;
    private int nbLines = 6;
    private int nbColumns = 7;

    public Grid() {
        this.matrix = new char[nbLines][nbColumns];
        for (char[] chars : matrix) {
            Arrays.fill(chars, '-');
        }
    }

    public char[][] getMatrix() {
        return matrix;
    }

    public int getNbLines() {
        return nbLines;
    }

    public int getNbColumns() {
        return nbColumns;
    }

    public void insert(int i, char m) {

        if (i < 0 || i > nbColumns - 1) {
            throw new IllegalArgumentException("Column should be within 0 and " + (nbColumns - 1));
        }

        boolean foundEmptySpot = false;
        for (int j = nbLines - 1; j >= 0; j--) {

            if (this.matrix[j][i] == '-') {
                foundEmptySpot = true;
                this.matrix[j][i] = m;
                break;
            }

        }
        if (!foundEmptySpot)
            throw new IllegalArgumentException("Column is full");

    }
}
