public abstract class Piece {
    protected Piece piece;
    

	
	
    public Piece(Type type) {
        this.piece = type;
    }
	
	public Type getType() {
        return piece;
    }	
}