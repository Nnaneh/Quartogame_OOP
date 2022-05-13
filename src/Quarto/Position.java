package Quarto;
public class Position {

    private int row;
    private int column;



    public Position(int row,int column) throws Exception{
        if(row<0 || row>3 || column<0 || column>3) throw new Exception("SquareNumber can be an integer from [0,15] .");
        this.row=row;
        this.column=column;

    }

    public int getRow(){
        return this.row;
    }

    public int getColumn(){
        return this.column;
    }

}
