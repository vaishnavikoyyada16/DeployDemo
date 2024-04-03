package others;

public class Move {
    private int row;
    private int column;
    private String player;

    // Constructors
    public Move() {}

    public Move(int row, int column, String player) {
        this.row = row;
        this.column = column;
        this.player = player;
    }

    // Getters and setters
    public int getRow() { return row; }
    public void setRow(int row) { this.row = row; }

    public int getColumn() { return column; }
    public void setColumn(int column) { this.column = column; }

    public String getPlayer() { return player; }
    public void setPlayer(String player) { this.player = player; }
}
