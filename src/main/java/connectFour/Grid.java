package connectFour;

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

    public void insert(int i, char m) {

        boolean flag = false;
        for (int j = this.matrix.length - 1 ; j >= 0 ; j--) {

            if (this.matrix[j][i] == '-') {
                flag = true;
                this.matrix[j][i] = m ;
                break;
            }


        }
        if( !flag ) throw new IllegalArgumentException("overflow");

    }
}
