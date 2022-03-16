package connectFour;

import org.junit.Before;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class AnalyzerTest {

    Analyzer analyzer;

    @Before
    public void setUp() throws Exception {
        analyzer = new Analyzer();
    }

    @Test
    public void itShouldReturnEmptyOptionalWhenGridIsFull() {

        Grid grid = new Grid(GridUtils.FULL_MATRIX);

        Optional<Character> expected = Optional.empty();

        assertEquals(expected, analyzer.check(grid));
    }

    @Test
    public void itShouldReturnOptionalContainPlayerOneWhenHas4TokensHorizontally() {

        Grid grid = new Grid(GridUtils.MATRIX_WITH_M_WINNER_IN_COLUMN);

        Optional<Character> result = analyzer.check(grid);
        Optional<Character> expected = Optional.of('M');

        assertEquals(expected, result);
    }

    @Test
    public void itShouldReturnOptionalContainPlayerOneWhenHas4TokensVertically() {

        Grid grid = new Grid(GridUtils.MATRIX_WITH_M_WINNER_IN_ROW);

        Optional<Character> result = analyzer.check(grid);
        Optional<Character> expected = Optional.of('M');

        assertEquals(expected, result);

    }

    @Test
    public void itShouldReturnOptionalContainPlayerOneWhenHas4TokensDiagonally() {

        Grid grid = new Grid(GridUtils.MATRIX_WITH_M_WINNER_IN_DIAGONAL);

        Optional<Character> result = analyzer.check(grid);
        Optional<Character> expected = Optional.of('M');

        assertEquals(expected, result);

    }

}