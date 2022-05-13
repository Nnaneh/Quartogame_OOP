package Quarto;
public class Board {

    private Piece[][] board;
    public static final int row=4;
    public static final int column=4;
    private Piece[] pool;
    private Piece[] figures={new Piece(Piece.PieceColor.WHITE, Piece.PieceShape.SQUARE, Piece.PieceHeight.SHORT, Piece.PieceTop.FLAT),
            new Piece(Piece.PieceColor.WHITE, Piece.PieceShape.CIRCLE, Piece.PieceHeight.SHORT, Piece.PieceTop.FLAT),
            new Piece(Piece.PieceColor.WHITE, Piece.PieceShape.SQUARE, Piece.PieceHeight.SHORT, Piece.PieceTop.HALLOW),
            new Piece(Piece.PieceColor.WHITE, Piece.PieceShape.CIRCLE, Piece.PieceHeight.SHORT, Piece.PieceTop.HALLOW),
            new Piece(Piece.PieceColor.WHITE, Piece.PieceShape.SQUARE, Piece.PieceHeight.TALL, Piece.PieceTop.FLAT),
            new Piece(Piece.PieceColor.WHITE, Piece.PieceShape.CIRCLE, Piece.PieceHeight.TALL, Piece.PieceTop.FLAT),
            new Piece(Piece.PieceColor.WHITE, Piece.PieceShape.SQUARE, Piece.PieceHeight.TALL, Piece.PieceTop.HALLOW),
            new Piece(Piece.PieceColor.WHITE, Piece.PieceShape.CIRCLE, Piece.PieceHeight.TALL, Piece.PieceTop.HALLOW),
            new Piece(Piece.PieceColor.BLACK, Piece.PieceShape.SQUARE, Piece.PieceHeight.SHORT, Piece.PieceTop.FLAT),
            new Piece(Piece.PieceColor.BLACK, Piece.PieceShape.CIRCLE, Piece.PieceHeight.SHORT, Piece.PieceTop.FLAT),
            new Piece(Piece.PieceColor.BLACK, Piece.PieceShape.SQUARE, Piece.PieceHeight.SHORT, Piece.PieceTop.HALLOW),
            new Piece(Piece.PieceColor.BLACK, Piece.PieceShape.CIRCLE, Piece.PieceHeight.SHORT, Piece.PieceTop.HALLOW),
            new Piece(Piece.PieceColor.BLACK, Piece.PieceShape.SQUARE, Piece.PieceHeight.TALL, Piece.PieceTop.FLAT),
            new Piece(Piece.PieceColor.BLACK, Piece.PieceShape.CIRCLE, Piece.PieceHeight.TALL, Piece.PieceTop.FLAT),
            new Piece(Piece.PieceColor.BLACK, Piece.PieceShape.SQUARE, Piece.PieceHeight.TALL, Piece.PieceTop.HALLOW),
            new Piece(Piece.PieceColor.BLACK, Piece.PieceShape.CIRCLE, Piece.PieceHeight.TALL, Piece.PieceTop.HALLOW),};


    public Board(){
        board=new Piece[row][column];
        pool=new Piece[16];
    }


    public boolean winningByRows(){
        int i;
        for(i=0;i<row;i++){
            if(board[i][0].getColor()==board[i][1].getColor() &&
                    board[i][0].getColor()==board[i][2].getColor() &&
                    board[i][0].getColor()==board[i][3].getColor())
                return true;
            else if(board[i][0].getHeight()==board[i][1].getHeight() &&
                    board[i][0].getHeight()==board[i][2].getHeight() &&
                    board[i][0].getHeight()==board[i][3].getHeight())
                return true;
            else if(board[i][0].getShape()==board[i][1].getShape() &&
                    board[i][0].getShape()==board[i][2].getShape() &&
                    board[i][0].getShape()==board[i][3].getShape())
                return true;
            else if(board[i][0].getTop()==board[i][1].getTop() &&
                    board[i][0].getTop()==board[i][2].getTop() &&
                    board[i][0].getTop()==board[i][3].getTop())
                return true;
        }
        return false;
    }

    public boolean winningByColumns(){
        int j;
        for(j=0;j<column;j++){
            if(board[0][j].getColor()==board[1][j].getColor() &&
                    board[0][j].getColor()==board[2][j].getColor() &&
                    board[0][j].getColor()==board[3][j].getColor())
                return true;
            else if(board[0][j].getHeight()==board[1][j].getHeight() &&
                    board[0][j].getHeight()==board[2][j].getHeight() &&
                    board[0][j].getHeight()==board[3][j].getHeight())
                return true;
            else if(board[0][j].getShape()==board[1][j].getShape() &&
                    board[0][j].getShape()==board[2][j].getShape() &&
                    board[0][j].getShape()==board[3][j].getShape())
                return true;
            else if(board[0][j].getTop()==board[1][j].getTop() &&
                    board[0][j].getTop()==board[2][j].getTop() &&
                    board[0][j].getTop()==board[3][j].getTop())
                return true;
        }
        return false;
    }

    public boolean winningByDiagonals(){
        if(board[0][0].getColor()==board[1][1].getColor() &&
                board[0][0].getColor()==board[2][2].getColor() &&
                board[0][0].getColor()==board[3][3].getColor())
            return true;
        else if(board[0][0].getHeight()==board[1][1].getHeight() &&
                board[0][0].getHeight()==board[2][2].getHeight() &&
                board[0][0].getHeight()==board[3][3].getHeight())
            return true;
        else if(board[0][0].getShape()==board[1][1].getShape() &&
                board[0][0].getShape()==board[2][2].getShape() &&
                board[0][0].getShape()==board[3][3].getShape())
            return true;
        else if(board[0][0].getTop()==board[1][1].getTop() &&
                board[0][0].getTop()==board[2][2].getTop() &&
                board[0][0].getTop()==board[3][3].getTop())
            return true;
        else if(board[3][0].getColor()==board[2][1].getColor() &&
                board[3][0].getColor()==board[1][2].getColor() &&
                board[3][0].getColor()==board[0][3].getColor())
            return true;
        else if(board[3][0].getHeight()==board[2][1].getHeight() &&
                board[3][0].getHeight()==board[1][2].getHeight() &&
                board[3][0].getHeight()==board[0][3].getHeight())
            return true;
        else if(board[3][0].getShape()==board[2][1].getShape() &&
                board[3][0].getShape()==board[1][2].getShape() &&
                board[3][0].getShape()==board[0][3].getShape())
            return true;
        else if(board[3][0].getTop() == board[2][1].getTop() &&
                board[3][0].getTop() == board[1][2].getTop() &&
                board[3][0].getTop() == board[0][3].getTop())
            return true;
        return false;

    }

    public boolean winning(){
        return winningByDiagonals() || winningByColumns() || winningByRows();
    }

    public void setPieceOnBoard(Position position,Piece piece) {
        board[position.getRow()][position.getColumn()]= piece;
    }







}

