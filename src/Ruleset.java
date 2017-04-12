public class Ruleset {

    private Board[][] board;
    private Move move;

    public Ruleset(Board[][] board, Move move) {
        this.board = board;
        this.move = move;		
    }
	
    public void rulePion() {
        if(move.getPiece().getCouleur() == BLANC) {
			if(board[x][move.getTo])
                if(move.getTo().getX() - move.getfrom().getX() == 0 && move.getTo().getY() - move.getfrom().getY() == 1)
                    board[x][move.getTo()];
        }
        else
            if(move.getTo().getX() - move.getfrom().getX() == 0 && move.getTo().getY() - move.getfrom().getY() == -1)
                board[x][move.getTo()];
    }
	
    public void ruleTour() {
        if(move.getPiece().getCouleur() == BLANC) {
			if()
			    if(move.getTo().getX() - move.getfrom().getX() == 0 && move.getTo().getY() - move.getfrom().getY() == 1)
			        board[x][move.getTo()];
        }
        else
            if(move.getTo().getX() - move.getfrom().getX() == 0 && move.getTo().getY() - move.getfrom().getY() == -1)
                board[x][move.getTo()];        
    }
}