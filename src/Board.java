import java.util.List;

public class Board {

    private final int columns;
    private final int rows;
    private final Square[] squares;
    private final List<Piece> pieceList;

    public Board(int dimensionX, int dimensionY, List<Piece> pieces){
        this.rows = dimensionX;
        this.columns = dimensionY;
        this.pieceList = pieces;
        this.squares = new Square[dimensionX*dimensionY];
        for (int i = 0; i < dimensionX*dimensionY; i++){
            squares[i] = new Square(i%rows, i/rows, null);
        }

        for (Piece piece: pieceList){
            int initialPositionX = piece.getInitialPositionX();
            int initialPositionY = piece.getInitialPositionY();
            Square square = squares[initialPositionX+initialPositionY*this.rows];
            square.setPiece(piece);

        }
    }

    public Boolean doesExist(Piece piece){
        for(Square square: squares){
            return square.getPiece() == piece;
        }
        return false;
    }

    public int getColumns() {
        return columns;
    }

    public int getRows() {
        return rows;
    }
}
