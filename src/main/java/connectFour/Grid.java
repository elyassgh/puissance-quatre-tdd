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

    public Grid(char[][] matrix) {
        this.matrix = matrix;
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

    public void empty() {
        this.matrix = GridUtils.EMPTYMATRIX;
    }

    public boolean isEmpty() {
        return Arrays.deepEquals(this.matrix, GridUtils.EMPTYMATRIX);
    }

    @Override
    public boolean equals(Object other) {
        Grid g = (Grid) other;
        return Arrays.deepEquals(this.matrix, g.matrix);
    }

    public String format() {
        StringBuilder builder = new StringBuilder();
        builder.append("#===============#");
        for (char[] chars : matrix) {
            builder.append("\n| ");
            for (char c : chars) {
                builder.append(c).append(' ');
            }
            builder.append("|");
        }
        builder.append("\n#===============#");
        return builder.toString();
    }

}
