package connectFour;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Optional;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.Silent.class)
public class GameTest {

    @Mock
    Grid grid;
    @Mock
    Analyzer analyzer;
    @Mock
    Vue vue;
    @Mock
    Arbitre arbitre;

    @InjectMocks
    Game game;

    @Test
    public void itShouldCallWriteWhenGameIsStarted() {

        when(grid.isUncompleted()).thenReturn(false);
        doNothing().when(vue).write(any());
        when(vue.read()).thenReturn(0);
        doNothing().when(vue).display(any());
        when(arbitre.getCurrentPlayer()).thenReturn('B');
        doNothing().when(arbitre).switchPlayer('B');
        doNothing().when(grid).insert(anyInt(), anyChar());
        when(analyzer.check(any())).thenReturn(Optional.of('B'));

        game.launch();

        InOrder inOrder = inOrder(vue, grid, analyzer, arbitre);

        inOrder.verify(vue).write(any());
        inOrder.verify(vue).read();
        inOrder.verify(arbitre).getCurrentPlayer();
        inOrder.verify(grid).insert(anyInt(), anyChar());
        inOrder.verify(arbitre).switchPlayer('B');
        inOrder.verify(analyzer).check(any());
        inOrder.verify(grid).isUncompleted();

    }
}