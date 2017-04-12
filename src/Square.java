public class Square {

    private Piece piece;
    private int x;
    private int y;

    public Square(Piece piece, int x, int y) {
        this.piece = piece;
        this.x = x;
        this.y = y;
    }

    public Piece getPiece() {
        return piece;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public boolean isEmpty() {
        return piece == null;
    }
    public boolean equals(Object o) {
        if (o instanceof Square) {
            Square s = (Square) o;
            return x == s.x && y == s.y;
        }
        return false;
    }
}
