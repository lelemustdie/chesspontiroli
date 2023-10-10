public class MoveValidator {
    private final Board board;
    private final int finalPositionX;
    private final int finalPositionY;

    public MoveValidator(Board board, int X, int Y){
        this.board = board;
        this.finalPositionX = X;
        this.finalPositionY = Y;
    }

    public isValid(Board board, int X, int Y, Piece piece){
        board.doesExist(piece);
        board.getRows() <= X && board.getColumns() <= Y && X >0 && Y>0
    }
}
