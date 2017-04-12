public class Game {
    public static void main(String[] args) {
        Piece[] pions = new Piece[16];
        Piece[] rois = new Piece[2];
        Piece[] tours = new Piece[4];
        Piece[] fous = new Piece[4];
        Piece[] chevaux = new Piece[4];
        Piece[] reines = new Piece[2];

        for (int i = 0; i < 8; i++)
            pions[i] = new Piece(Couleur.BLANC, PieceType.PION);
        for (int i = 0; i < 8; i++)
            pions[i] = new Piece(Couleur.NOIR, PieceType.PION);

        rois[0] = new Piece(Couleur.BLANC, PieceType.ROI);
        rois[1] = new Piece(Couleur.NOIR, PieceType.ROI);

        for (int i = 0; i < 2; i++)
            tours[i] = new Piece(Couleur.BLANC, PieceType.TOUR);
        for (int i = 0; i < 2; i++)
            tours[i] = new Piece(Couleur.NOIR, PieceType.TOUR);
        
        for (int i = 0; i < 2; i++)
            fous[i] = new Piece(Couleur.BLANC, PieceType.FOU);
        for (int i = 0; i < 2; i++)
            fous[i] = new Piece(Couleur.NOIR, PieceType.FOU);

        for (int i = 0; i < 2; i++)
            chevaux[i] = new Piece(Couleur.BLANC, PieceType.CHEVAL);
        for (int i = 0; i < 2; i++)
            chevaux[i] = new Piece(Couleur.NOIR, PieceType.CHEVAL);

        reines[0] = new Piece(Couleur.BLANC, PieceType.REINE);
        reines[1] = new Piece(Couleur.NOIR, PieceType.REINE);
    }
}
