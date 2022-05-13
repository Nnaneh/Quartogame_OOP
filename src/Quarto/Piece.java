package Quarto;

public class Piece {

    public enum PieceColor {WHITE, BLACK}
    public enum PieceHeight{TALL, SHORT}
    public enum PieceShape{CIRCLE, SQUARE}
    public enum PieceTop{FLAT,HALLOW}

    private PieceColor color;
    private PieceHeight height;
    private PieceShape shape;
    private PieceTop top;

    public Piece(PieceColor color,PieceShape shape, PieceHeight height, PieceTop top){
        this.color=color;
        this.shape=shape;
        this.height=height;
        this.top=top;
    }

    public PieceColor getColor(){
        return this.color;
    }
    public PieceShape getShape(){
        return this.shape;
    }
    public PieceHeight getHeight(){
        return this.height;
    }
    public PieceTop getTop(){
        return this.top;
    }

}

