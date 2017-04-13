public class Piece {
    private Couleur couleur;
    private PieceType type;
    
    public Piece(Couleur couleur, PieceType type) {
        this.couleur = couleur;
        this.type = type;
    }
	
    public Couleur getCouleur() {
        return couleur;
    }

    public PieceType getPieceType() {
        return type;
    }
}
