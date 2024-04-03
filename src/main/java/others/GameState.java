package others;

import java.util.ArrayList;
import java.util.List;

public class GameState {
    private String[][] board = new String[3][3];
    private List<Move> moves = new ArrayList<>();
    private String winner;
    private boolean draw;

    // Initialize the board with null values
    public GameState() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = null;
            }
        }
    }

    // Getters and setters
    public String[][] getBoard() { return board; }
    public void setBoard(String[][] board) { this.board = board; }

    public List<Move> getMoves() { return moves; }
    public void setMoves(List<Move> moves) { this.moves = moves; }

    public String getWinner() { return winner; }
    public void setWinner(String winner) { this.winner = winner; }

    public boolean isDraw() { return draw; }
    public void setDraw(boolean draw) { this.draw = draw; }
}
