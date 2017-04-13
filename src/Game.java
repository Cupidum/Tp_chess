public class Game {
    public static void main(String[] args){
        Square[][] squares = new Square[8][8];
        squares[7][0] = new Square(new Piece(Couleur.NOIR, PieceType.TOUR), 7, 0);
        squares[7][1] = new Square(new Piece(Couleur.NOIR, PieceType.CHEVAL), 7, 1);
        squares[7][2] = new Square(new Piece(Couleur.NOIR, PieceType.FOU), 7, 2);
        squares[7][3] = new Square(new Piece(Couleur.NOIR, PieceType.REINE), 7, 3);
        squares[7][4] = new Square(new Piece(Couleur.NOIR, PieceType.ROI), 7, 4);
        squares[7][5] = new Square(new Piece(Couleur.NOIR, PieceType.FOU), 7, 5);
        squares[7][6] = new Square(new Piece(Couleur.NOIR, PieceType.CHEVAL), 7, 6);
        squares[7][7] = new Square(new Piece(Couleur.NOIR, PieceType.TOUR), 7, 7);

        for (int i = 0; i < 8; i++) {
            squares[6][i] = new Square(new Piece(Couleur.NOIR, PieceType.PION), 6, i);
        }

        squares[0][0] = new Square(new Piece(Couleur.BLANC, PieceType.TOUR), 0, 0);
        squares[0][1] = new Square(new Piece(Couleur.BLANC, PieceType.CHEVAL), 0, 1);
        squares[0][2] = new Square(new Piece(Couleur.BLANC, PieceType.FOU), 0, 2);
        squares[0][3] = new Square(new Piece(Couleur.BLANC, PieceType.REINE), 0, 3);
        squares[0][4] = new Square(new Piece(Couleur.BLANC, PieceType.ROI), 0, 4);
        squares[0][5] = new Square(new Piece(Couleur.BLANC, PieceType.FOU), 0, 5);
        squares[0][6] = new Square(new Piece(Couleur.BLANC, PieceType.CHEVAL), 0, 6);
        squares[0][7] = new Square(new Piece(Couleur.BLANC, PieceType.TOUR), 0, 7);

        for (int i = 0; i < 8; i++) {
            squares[1][i] = new Square(new Piece(Couleur.BLANC, PieceType.PION), 1, i);
        }

        Board board = new Board(squares);
        System.out.println(board);
    }
}
