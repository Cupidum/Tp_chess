public class Pion extends Piece{
    private Couleur couleur;
    private PieceType type;
	
    public Pion(PieceType type, Couleur couleur) {
        super(type, couleur);
    }
	
	public Couleur getCouleur() {
        return couleur;
    }
	
    public PieceType getType() {
        return type;
    }
	
    
}