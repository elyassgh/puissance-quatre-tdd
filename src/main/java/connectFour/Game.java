package connectFour;

import java.util.Optional;

public class Game {

    private final Grid grid;
    private final Vue vue;
    private final Analyzer analyzer;
    private final Arbitre arbitre;

    public Game(Grid grid, Vue vue, Analyzer analyzer, Arbitre arbitre) {
        this.grid = grid;
        this.vue = vue;
        this.analyzer = analyzer;
        this.arbitre = arbitre;
    }

    private Optional<Character> play() {

        vue.write(grid);

        int atColumn = vue.read();
        char currentPlaying = arbitre.getCurrentPlayer();

        grid.insert(atColumn, currentPlaying);
        arbitre.switchPlayer(currentPlaying);

        return analyzer.check(grid);
    }

    public void launch() {

        boolean weHaveAWinner = false;

        boolean yet = true;

        while (true) {

            Optional<Character> winner;

            try {

                winner = play();
                yet = grid.isUncompleted();

                if (winner.isPresent()) {
                    drawWinner(winner.get());
                    weHaveAWinner = true;
                    break;
                }


            } catch (Exception ignored) {
            }


            if (!yet) break;
        }

        if (!weHaveAWinner) vue.display(showDraw());


    }

    private String showWinner(char color) {
        return "Player with color : '" + color + "' wins.";
    }

    private void drawWinner(char winner) {
        vue.write(grid);
        vue.display(
                "                                 _       \n" +
                        "                                | |      \n" +
                        "  ___ ___  _ __   __ _ _ __ __ _| |_ ___ \n" +
                        " / __/ _ \\| '_ \\ / _` | '__/ _` | __/ __|\n" +
                        "| (_| (_) | | | | (_| | | | (_| | |_\\__ \\\n" +
                        " \\___\\___/|_| |_|\\__, |_|  \\__,_|\\__|___/\n" +
                        "                  __/ |                  \n" +
                        "                 |___/  \n");

        vue.display(showWinner(winner));
    }

    private String showDraw() {
        return "No one wins, it's a draw";
    }

}
