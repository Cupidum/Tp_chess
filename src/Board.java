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

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == null) {
                    continue;
                }
                switch (board[i][j].getPiece().getPieceType()) {
                    case ROI:
                        s.append('K');
                        break;
                    case REINE:
                        s.append('Q');
                        break;
                    case TOUR:
                        s.append('R');
                        break;
                    case CHEVAL:
                        s.append('H');
                        break;
                    case FOU:
                        s.append('B');
                        break;
                    case PION:
                        s.append('P');
                        break;
                    default:
                        System.err.println("Wut");
                        throw new RuntimeException();
                }
            }
            s.append(System.getProperty("line.separator"));
        }
        return s.toString();
    }
}
