package connectFour;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class GridTest {

    char[][] EMPTYMATRIX = {
            {'-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-'}};
    char[][] FILLEDMATRIX = {
            {'-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-'},
            {'M', '-', '-', '-', '-', '-', '-'}};
    char[][] FULLMATRIX = {
            {'M', 'M', 'M', 'M', 'M', 'M', 'M'},
            {'M', 'M', 'M', 'M', 'M', 'M', 'M'},
            {'M', 'M', 'M', 'M', 'M', 'M', 'M'},
            {'M', 'M', 'M', 'M', 'M', 'M', 'M'},
            {'M', 'M', 'M', 'M', 'M', 'M', 'M'},
            {'M', 'M', 'M', 'M', 'M', 'M', 'M'},};


    @Test
    public void shouldReturn6x7MatrixOnInit() {

        Grid grid = new Grid();

        int nbLines = grid.getMatrix().length;
        int nbColumns = grid.getMatrix()[0].length;

        assertEquals(6, nbLines);
        assertEquals(7, nbColumns);

    }

    @Test
    public void shouldContainDashInAllPointOnInit() {
        Grid grid = new Grid();
        assertArrayEquals(grid.getMatrix(), EMPTYMATRIX);

    }

    @Test
    public void shouldContainsTheNewInsertedElement() {
        Grid grid = new Grid();
        grid.insert(1,'M');
        assertArrayEquals(grid.getMatrix(), FILLEDMATRIX);

    }

}