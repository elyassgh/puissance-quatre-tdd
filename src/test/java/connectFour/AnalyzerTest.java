package connectFour;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AnalyzerTest {

    Analyzer analyzer;

    Grid grid = new Grid();
    Grid gridMock = Mockito.spy(grid);


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

        when(gridMock.getRows()).thenReturn(
                GridUtils.LIST_ROWS
        );

        Optional<Character> result = analyzer.check(gridMock);
        Optional<Character> expected = Optional.of('R');

        assertEquals(expected, result);
    }

    @Test
    public void itShouldReturnOptionalContainPlayerOneWhenHas4TokensVertically() {

        when(gridMock.getColumns()).thenReturn(
                GridUtils.LIST_COLUMNS
        );


        Optional<Character> result = analyzer.check(gridMock);
        Optional<Character> expected = Optional.of('M');

        assertEquals(expected, result);

    }

    @Test
    public void itShouldReturnOptionalContainPlayerOneWhenHas4TokensDiagonally() {

        when(gridMock.getDiagonals()).thenReturn(
                GridUtils.LIST_DIAGONALS
        );

        Optional<Character> result = analyzer.check(gridMock);
        Optional<Character> expected = Optional.of('M');

        assertEquals(expected, result);

    }

}