package others;

import org.springframework.stereotype.Service;

@Service
public class GameService {
    private GameState gameState = new GameState();
    private final String[][] board = gameState.getBoard();

    public GameState makeMove(Move move) {
        if (board[move.getRow()][move.getColumn()] == null) {
            board[move.getRow()][move.getColumn()] = move.getPlayer();
            gameState.getMoves().add(move);
            checkWinCondition();
            checkDrawCondition();
        }
        return gameState;
    }
    // Inside the GameService class
    public GameState getGameState() {
        return gameState;
    }

    private void checkWinCondition() {
        String[][] lines = {
                {board[0][0], board[0][1], board[0][2]},
                {board[1][0], board[1][1], board[1][2]},
                {board[2][0], board[2][1], board[2][2]},
                {board[0][0], board[1][0], board[2][0]},
                {board[0][1], board[1][1], board[2][1]},
                {board[0][2], board[1][2], board[2][2]},
                {board[0][0], board[1][1], board[2][2]},
                {board[2][0], board[1][1], board[0][2]},
        };

        for (String[] line : lines) {
            if (line[0] != null && line[0].equals(line[1]) && line[0].equals(line[2])) {
                gameState.setWinner(line[0]);
                return;
            }
        }
    }

    private void checkDrawCondition() {
        for (String[] row : board) {
            for (String cell : row) {
                if (cell == null) {
                    return;
                }
            }
        }
        // If no winner and board is full, it's a draw
        if (gameState.getWinner() == null) {
            gameState.setDraw(true);
        }
    }

    public void resetGame() {
        gameState = new GameState();
    }
}
