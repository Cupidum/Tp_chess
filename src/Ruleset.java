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
    Square from = move.getFrom();
    Square to = move.getTo();
    
    Square allowed = null;
    if (move.getPiece().getColor() == Color.BLANC) {
        allowed = board[from.getX()][from.getY() + 1];
    } else {
        allowed = board[from.getX()][from.getY() - 1];
    }
    
    if (allowed.getX() != to.getX() && allowed.getY() != to.getY()) {
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
}