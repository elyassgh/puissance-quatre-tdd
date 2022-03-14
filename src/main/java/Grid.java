import java.util.Arrays;

public class Grid {

    private char[][] matrix;

    public Grid() {
        this.matrix = new char[6][7];
        for (char[] chars : matrix) {
            Arrays.fill(chars, '-');
        }
    }

    public char[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(char[][] matrix) {
        this.matrix = matrix;
    }
}
