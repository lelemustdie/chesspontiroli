public class Square {
    private final int cordX;
    private final int cordY;

    private Piece piece;

    public Square(int x, int y, Piece piece){
        this.cordX = x;
        this.cordY = y;
        this.piece = piece;
    }
    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public Piece getPiece() {
        return piece;
    }
}
