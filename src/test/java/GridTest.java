import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class GridTest {

    char [][] EMPTYMATRIX = {
            {'-', '-', '-', '-', '-', '-','-'},
            {'-', '-', '-', '-', '-', '-','-'},
            {'-', '-', '-', '-', '-', '-','-'},
            {'-', '-', '-', '-', '-', '-','-'},
            {'-', '-', '-', '-', '-', '-','-'},
            {'-', '-', '-', '-', '-', '-','-'}};



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
        assertArrayEquals(grid.getMatrix(),EMPTYMATRIX);


    }

}