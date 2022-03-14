package connectFour;

import org.junit.Test;

import static org.junit.Assert.*;

public class GridTest {

    @Test
    public void shouldReturn6x7MatrixOnInit() {

        Grid grid = new Grid();

        int nbLines = grid.getNbLines();
        int nbColumns = grid.getNbColumns();

        assertEquals(6, nbLines);
        assertEquals(7, nbColumns);

    }

    @Test
    public void shouldContainDashInAllPointOnInit() {
        Grid grid = new Grid();
        assertArrayEquals(grid.getMatrix(), GridUtils.EMPTYMATRIX);

    }

    @Test
    public void shouldContainsTheNewInsertedElement() {
        Grid grid = new Grid();
        grid.insert(0,'M');
        assertArrayEquals(grid.getMatrix(), GridUtils.FILLEDMATRIX);
    }

    @Test
    public void shouldThrowExceptionOnColumnFull() {
        Grid grid = new Grid();
        for (int i = 0; i < grid.getNbLines(); i++) {
            grid.insert(1, 'M');
        }
        assertThrows(IllegalArgumentException.class, () -> grid.insert(1, 'M'));
    }

    @Test
    public void shouldThrowExceptionOnColumnNegative() {
        Grid grid = new Grid();
        assertThrows(IllegalArgumentException.class, () -> grid.insert(-1, 'M'));
    }

    @Test
    public void shouldThrowExceptionOnColumnOverflow() {
        Grid grid = new Grid();
        assertThrows(IllegalArgumentException.class, () -> grid.insert(grid.getNbColumns(), 'M'));
    }

}