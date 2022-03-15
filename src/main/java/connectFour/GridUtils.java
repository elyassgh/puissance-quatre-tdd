package connectFour;

public class GridUtils {

    static char[][] EMPTYMATRIX = {
            { '-', '-', '-', '-', '-', '-', '-' },
            { '-', '-', '-', '-', '-', '-', '-' },
            { '-', '-', '-', '-', '-', '-', '-' },
            { '-', '-', '-', '-', '-', '-', '-' },
            { '-', '-', '-', '-', '-', '-', '-' },
            { '-', '-', '-', '-', '-', '-', '-' } };

    static char[][] FILLEDMATRIX = {
            { '-', '-', '-', '-', '-', '-', '-' },
            { '-', '-', '-', '-', '-', '-', '-' },
            { '-', '-', '-', '-', '-', '-', '-' },
            { '-', '-', '-', '-', '-', '-', '-' },
            { '-', '-', '-', '-', '-', '-', '-' },
            { 'M', '-', '-', '-', '-', '-', '-' } };

    static char[][] PREOVERFLOWMATRIX = {
            { '-', '-', '-', '-', '-', '-', '-' },
            { 'M', '-', '-', '-', '-', '-', '-' },
            { 'M', '-', '-', '-', '-', '-', '-' },
            { 'M', '-', '-', '-', '-', '-', '-' },
            { 'M', '-', '-', '-', '-', '-', '-' },
            { 'M', '-', '-', '-', '-', '-', '-' } };

    static char[][] OVERFLOWMATRIX = {
            { 'M', '-', '-', '-', '-', '-', '-' },
            { 'M', '-', '-', '-', '-', '-', '-' },
            { 'M', '-', '-', '-', '-', '-', '-' },
            { 'M', '-', '-', '-', '-', '-', '-' },
            { 'M', '-', '-', '-', '-', '-', '-' },
            { 'M', '-', '-', '-', '-', '-', '-' } };
    static char[][] FULLMATRIX = {
            { 'M', 'M', 'M', 'M', 'M', 'M', 'M' },
            { 'M', 'M', 'M', 'M', 'M', 'M', 'M' },
            { 'M', 'M', 'M', 'M', 'M', 'M', 'M' },
            { 'M', 'M', 'M', 'M', 'M', 'M', 'M' },
            { 'M', 'M', 'M', 'M', 'M', 'M', 'M' },
            { 'M', 'M', 'M', 'M', 'M', 'M', 'M' } };

}
