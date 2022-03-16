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

        Grid expected = new Grid(GridUtils.EMPTY_MATRIX);

        assertEquals(expected, grid);
    }

    @Test
    public void shouldContainsTheNewInsertedElement() {
        Grid grid = new Grid();
        grid.insert(0, 'M');

        Grid expected = new Grid(GridUtils.FILLED_MATRIX);

        assertEquals(expected, grid);
    }

    @Test
    public void shouldContainsTheNewInsertedElement2() {
        Grid grid = new Grid();

        for (int i = 0; i < grid.getNbLines() - 1; i++) {
            grid.insert(0, 'M');
        }

        Grid expected = new Grid(GridUtils.PREOVERFLOW_MATRIX);

        assertEquals(expected, grid);
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

    @Test
    public void shouldEmptyTheGivenMatrix() {
        Grid grid = new Grid();

        for (int i = 0; i < grid.getNbLines(); i++) {
            grid.insert(1, 'M');
        }

        grid.empty();
        assertTrue(grid.isEmpty());

    }

    @Test
    public void shouldFormatTheGridAsAnEmptyGrid() {

        Grid grid = new Grid();

        String format = grid.format();

        String expected =
                "#===============#\n" +
                        "| - - - - - - - |\n" +
                        "| - - - - - - - |\n" +
                        "| - - - - - - - |\n" +
                        "| - - - - - - - |\n" +
                        "| - - - - - - - |\n" +
                        "| - - - - - - - |\n" +
                        "#===============#";

        assertEquals(expected, format);
    }

    @Test
    public void shouldFormatTheGridWithOneStep() {

        Grid grid = new Grid();

        grid.insert(0, 'M');

        String format = grid.format();

        String expected =
                "#===============#\n" +
                        "| - - - - - - - |\n" +
                        "| - - - - - - - |\n" +
                        "| - - - - - - - |\n" +
                        "| - - - - - - - |\n" +
                        "| - - - - - - - |\n" +
                        "| M - - - - - - |\n" +
                        "#===============#";

        assertEquals(expected, format);
    }

}