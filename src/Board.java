public class Board {

    private Square[][] board;

    public Board(Square[][] board) {
        this.board = board;
    }

    public Square getSquare(int x, int y) {
        return board[x][y];
    }

    public Piece getPiece(int x, int y) {
        return getSquare(x, y).getPiece();
    }

    public void setPiece(Piece piece, int x, int y) {
        getSquare(x, y).setPiece(piece);
    }
}
