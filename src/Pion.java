public class Pion {
	private PieceType type;
	private Couleur couleur;
	
	public Pion(PieceType type, Couleur couleur) {
        this.type = type;
        this.couleur = couleur;
	}
	
	public PieceType getType() {
        return type;
	}
	
	public Couleur getCouleur() {
        return couleur;
	}
}