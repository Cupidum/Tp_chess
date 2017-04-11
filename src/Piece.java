public abstract class Piece {
    protected Couleur couleur;
    protected PieceType type;
    
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