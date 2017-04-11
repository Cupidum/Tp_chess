public abstract class Piece
{
        protected Type piece;
    
        public enum Type{
            WHITE, BLACK, ROI, REINE, FOU, CHEVAL, TOUR, PION
        }
	
	
	public Piece(Type type){
            this.piece = type;
        }
	
	public Type getType(){
            return piece;
        }	
}