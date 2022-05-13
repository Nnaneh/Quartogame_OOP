package Quarto;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class JBoard extends JFrame {

    private JButton[] squares;
    private static final int numberOfSquares = 32;
    private int clickedPiece = -1;
    private int clickedSquare=-1;
    private Board board;



    public JBoard() {


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        board= new Board();

        int i;

            JButton[] squares = new JButton[numberOfSquares];

            for (i = 0; i < 32; i++) {
                int j = i;
                if(i<16) {
                    if (i == 0) {
                        squares[i] = new JButton(new ImageIcon("src/White_Square_Short_Flat.png"));
                        this.add(squares[i]);
                    }
                    else if (i == 1) {
                        squares[i] = new JButton(new ImageIcon("src/White_Circle_Short_Flat.png"));
                        this.add(squares[i]);
                    }
                    else if (i == 2) {
                        squares[i] = new JButton(new ImageIcon("src/White_Square_Short_Hollow.png"));
                        this.add(squares[i]);
                    }
                    else if (i == 3) {
                        squares[i] = new JButton(new ImageIcon("src/White_Circle_Short_Hollow.png"));
                        this.add(squares[i]);
                    }

                    else if (i == 4) {
                        squares[i] = new JButton(new ImageIcon("src/White_Square_Tall_Flat.png"));
                        this.add(squares[i]);
                    }
                    else if (i == 5) {
                        squares[i] = new JButton(new ImageIcon("src/White_Circle_Tall_Flat.png"));
                        this.add(squares[i]);
                    }
                    else if (i == 6) {
                        squares[i] = new JButton(new ImageIcon("src/White_Square_Tall_Hollow.png"));
                        this.add(squares[i]);
                    }
                    else if (i == 7) {
                        squares[i] = new JButton(new ImageIcon("src/White_Circle_Tall_Hollow.png"));
                        this.add(squares[i]);
                    }
                    else if (i == 8) {
                        squares[i] = new JButton(new ImageIcon("src/Black_Square_Short_Flat.png"));
                        this.add(squares[i]);
                    }
                    else if (i == 9) {
                        squares[i] = new JButton(new ImageIcon("src/Black_Circle_Short_Flat.png"));
                        this.add(squares[i]);
                    }
                    else if (i == 10) {
                        squares[i] = new JButton(new ImageIcon("src/Black_Square_Short_Hollow.png"));
                        this.add(squares[i]);
                    }
                    else if (i == 11) {
                        squares[i] = new JButton(new ImageIcon("src/Black_Circle_Short_Hollow.png"));
                        this.add(squares[i]);
                    }
                    else if (i == 12) {
                        squares[i] = new JButton(new ImageIcon("src/Black_Square_Tall_Flat.png"));
                        this.add(squares[i]);
                    }
                    else if (i == 13) {
                        squares[i] = new JButton(new ImageIcon("src/Black_Circle_Tall_Flat.png"));
                        this.add(squares[i]);
                    }
                    else if (i == 14) {
                        squares[i] = new JButton(new ImageIcon("src/Black_Square_Tall_Hollow.png"));
                        this.add(squares[i]);
                    }
                    else if (i == 15) {
                        squares[i] = new JButton(new ImageIcon("src/Black_Circle_Tall_Hollow.png"));
                        this.add(squares[i]);
                    }

                    squares[i].addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            clickedPiece = j;

                        }
                    });
                }
                else{
                    squares[i] = new JButton();
                    this.add(squares[i]);
                    squares[i].setBackground(Color.PINK);
                    squares[i].addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            clickedSquare = j;
                            if (clickedPiece != -1) {
                                squares[j].setIcon(squares[clickedPiece].getIcon());
                                squares[clickedPiece].setBackground(Color.RED);
                                clickedPiece = -1;
                                clickedSquare=-1;
                            }
                        }
                    });
                }
            }


        this.setLayout(new GridLayout(8,4));
        this.setSize(500,1900);

        this.setVisible(true);



    }

    public boolean itIsTie(){
        int i;
        for(i=0;i<16;i++){
            if(squares[i].getBackground()==Color.RED || board.winning())
                return true;
        }
        return false;
    }



    public static void main (String[] args) {
        JBoard b = new JBoard();

    }


}


