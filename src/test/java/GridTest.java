import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class GridTest {

    @Test
    public void shouldReturn6x7MatrixOnInit() {

        Grid grid = new Grid();

        int nbLines = grid.getMatrix().length;
        int nbColumns = grid.getMatrix()[0].length;

        assertEquals(6, nbLines);
        assertEquals(7, nbColumns);

    }

}