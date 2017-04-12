public class Ruleset {

    private Board[][] board;
    private Move move;

    public Ruleset(Board[][] board, Move move) {
        this.board = board;
        this.move = move;		
    }
	
    public void rulePion(Move move) {
        Square from = move.getFrom();
        Square to = move.getTo();
    
        Square allowed = null;
        if (move.getPiece().getColor() == Color.BLANC) {
            allowed = board[from.getX()][from.getY() + 1];
    } else {
        allowed = board[from.getX()][from.getY() - 1];
    }
    
    if (allowed.getX() != to.getX() || allowed.getY() != to.getY()) {
        // ERROR
    }
    
    // Il y a une piece dans la position possible
    else if (!allowed.isEmpty()) {
        // ERROR
    } else {
        board[to.getX()][to.getY()].setPiece(move.getPiece());
        board[from.getX()][to.getY()].setPiece(null);
    }        
}
	
    public void ruleTour(Move move) {
    List<Square> allowed = new ArrayList<>();
    Square from = move.getFrom();
    Square to = move.getTo();
    
    Square current;
    
    // Right
    for (int i = from.getX(); i < 8; i++) {
        current = board[i][from.getY()];
        if (!current.isEmpty()) {
            if (move.getPiece().getColor() != current.getPiece().getColor()) {
                allowed.add(current);
            }
            break;
        }
        allowed.add(current);    
    }
    
    // Left
    for (int i = from.getX(); i >=0; i--) {
        current = board[i][from.getY()];
        if (!current.isEmpty()) {
            if (move.getPiece().getColor() != current.getPiece().getColor()) {
                allowed.add(current);
            }
            break;
        }
        allowed.add(current)    
    }
    
    // Above
    for (int i = from.getY(); i < 8; i++) {
        current = board[from.getX()][i];
        if (!current.isEmpty()) {
            if (move.getPiece().getColor() != current.getPiece().getColor()) {
                allowed.add(current);
            }
            break;
        }
        allowed.add(current)    
    }
    
    // Below
    for (int i = from.getY(); i >= 0; i--) {
        current = board[from.getX()][i];
        if (!current.isEmpty()) {
            if (move.getPiece().getColor() != current.getPiece().getColor()) {
                allowed.add(current);
            }
            break;
        }
        allowed.add(current)
    }
    
    if (!allowed.contains(to)) {
        // ERROR
    } else {
        board[to.getX()][to.getY()].setPiece(move.getPiece());
            board[from.getX()][to.getY()].setPiece(null);
    }
}
}