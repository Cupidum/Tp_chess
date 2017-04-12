import java.util.ArrayList;
import java.util.List;

public class Ruleset {

    private Board board;
    private Move move;

    public Ruleset(Board board, Move move) {
        this.board = board;
        this.move = move;		
    }

    public void rulePion(Move move) {
        Square from = move.getFrom();
        Square to = move.getTo();

        Square allowed = null;
        if (move.getPiece().getCouleur() == Couleur.BLANC) {
            allowed = board.getSquare(from.getX(), from.getY() + 1);
        } else {
            allowed = board.getSquare(from.getX(), from.getY() - 1);
        }

        if (allowed.getX() != to.getX() || allowed.getY() != to.getY()) {
            // ERROR
        }

        // Il y a une piece dans la position possible
        else if (!allowed.isEmpty()) {
            // ERROR
        } else {
            board.setPiece(move.getPiece(), to.getX(), to.getY());
            board.setPiece(null, from.getX(), from.getX());
        }        
    }

    public void ruleTour(Move move) {
        List<Square> allowed = new ArrayList<>();
        Square from = move.getFrom();
        Square to = move.getTo();

        Square current;

        // Right
        for (int i = from.getX(); i < 8; i++) {
            current = board.getSquare(i, from.getY());
            if (!current.isEmpty()) {
                if (move.getPiece().getCouleur() != current.getPiece().getCouleur()) {
                    allowed.add(current);
                }
                break;
            }
            allowed.add(current);    
        }

        // Left
        for (int i = from.getX(); i >=0; i--) {
            current = board.getSquare(i, from.getY());
            if (!current.isEmpty()) {
                if (move.getPiece().getCouleur() != current.getPiece().getCouleur()) {
                    allowed.add(current);
                }
                break;
            }
            allowed.add(current);
        }

        // Above
        for (int i = from.getY(); i < 8; i++) {
            current = board.getSquare(from.getX(), i);
            if (!current.isEmpty()) {
                if (move.getPiece().getCouleur() != current.getPiece().getCouleur()) {
                    allowed.add(current);
                }
                break;
            }
            allowed.add(current);
        }

        // Below
        for (int i = from.getY(); i >= 0; i--) {
            current = board.getSquare(from.getX(), i);
            if (!current.isEmpty()) {
                if (move.getPiece().getCouleur() != current.getPiece().getCouleur()) {
                    allowed.add(current);
                }
                break;
            }
            allowed.add(current);
        }

        if (!allowed.contains(to)) {
            // ERROR
        } else {
            board.setPiece(move.getPiece(), to.getX(), to.getY());
            board.setPiece(null, from.getX(), from.getX());
        }
    }
	
	public void ruleRoi() {
        List<Square> allowed = new ArrayList<>();
        Square from = move.getFrom();
        Square to = move.getTo();

        Square current;

        // Right
        current = board.getSquare(from.getX, from.getY());
        if (!current.isEmpty()) {
            if (move.getPiece().getCouleur() != current.getPiece().getCouleur()) {
                allowed.add(current);
            }
            break;
        }
        allowed.add(current);    
    }

        // Left
    
        current = board.getSquare(from.getX, from.getY());
        if (!current.isEmpty()) {
            if (move.getPiece().getCouleur() != current.getPiece().getCouleur()) {
                allowed.add(current);
            }
            break;
        }
        allowed.add(current);
    }

        // Above
        current = board.getSquare(from.getX(), from.getY);
        if (!current.isEmpty()) {
            if (move.getPiece().getCouleur() != current.getPiece().getCouleur()) {
                allowed.add(current);
            }
            break;
        }
        allowed.add(current);
    }

        // Below
        current = board.getSquare(from.getX(), from.getY);
        if (!current.isEmpty()) {
            if (move.getPiece().getCouleur() != current.getPiece().getCouleur()) {
                allowed.add(current);
            }
            break;
        }
        allowed.add(current);
    }

        if (!allowed.contains(to)) {
            // ERROR
        } else {
            board.setPiece(move.getPiece(), to.getX(), to.getY());
            board.setPiece(null, from.getX(), from.getX());
        }
    }
	public void ruleCheval() {
        List<Square> allowed = new ArrayList<>();
        Square from = move.getFrom();
        Square to = move.getTo();
    
        Square current;
		
		//up right
		if(move.)
    }
}
