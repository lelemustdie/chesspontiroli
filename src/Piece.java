public class Piece {

    private final String name;
    private final String color;

    private final PieceType type;
    private final int initialPositionX;

    private final int initialPositionY;

    public Piece(String name, String color, int X, int Y, PieceType type){
        this.name = name;
        this.color = color;
        this.initialPositionX = X;
        this.initialPositionY = Y;
        this.type = type;
    }
    public int getInitialPositionX() {
        return initialPositionX;
    }
    public int getInitialPositionY() {
        return initialPositionY;
    }
}
