import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
/*import java.io.IOException;
import java.util.IllegalFormatException;
import java.util.Scanner;*/

class Game {

    private final UI ui;

    enum State{
        EMPTY, RED, YELLOW
    }

    private final static int ROWS = 6;
    private final static int COLS = 7;
    private State[][] grid = new State[ROWS][COLS];
    private int col_heights[] = new int[COLS];
    private int empty_slots = ROWS*COLS;
    private boolean firstPlayer = true;
    boolean gameOver = false;

    Game(){
        for(int i=0; i<ROWS; i++){
            for(int j=0; j<COLS; j++){
                grid[i][j] = State.EMPTY;
            }
        }
        for(int i=0; i<COLS; i++){
            col_heights[i] = 0;
        }

        ui = new UI(grid,ml);
    }

   /* private int selectCol(){
        int col;
        do {
            System.out.println("Choose a column 1-7 from left to right");
            Scanner sc = new Scanner(System.in);
            try {
                col = sc.nextInt() - 1;
            } catch (IllegalFormatException e) {
                col = -1;
                System.out.println("Selection not a number.");
            }

            if (col < -1 || col > 6)
                col = -1;
            else if (col_heights[col] == ROWS) {
                col = -1;
                System.out.println("That column is full");
            }
        }while(col == -1);
        return col;
    }
*/
    private void dropToken(int col){

        if(firstPlayer){
            grid[col_heights[col]][col] = State.YELLOW;
            col_heights[col]++;
        }
        else{
            grid[col_heights[col]][col] = State.RED;
            col_heights[col]++;
        }
        ui.display();
        //displayBoard();
        empty_slots--;
        firstPlayer = !firstPlayer;

        if(checkWin(col)){
            if(!firstPlayer) {
                ui.finGame("Yellow");
            }
            else{
                ui.finGame("Red");
            }
            gameOver = true;
        }
        else if(empty_slots == 0) {
            System.out.println("It's a draw");
            gameOver = true;
        }
    }

    /*private void displayBoard(){
        for(int i=ROWS-1; i>=0; i--){
            for(int j=0; j<COLS; j++){
                String token;
                if(grid[i][j] == State.YELLOW)
                    token = "Y";
                else if(grid[i][j] == State.RED)
                    token = "R";
                else
                    token = " ";
                System.out.print("|" + token);
            }
            System.out.print("|\n");
        }
    }*/

    private boolean isCol(int i){
        return i >= 0 && i < COLS;
    }

    private boolean isRow(int i){
        return i >= 0 && i < ROWS;
    }

    private boolean checkWin(int last_col){
        int row = col_heights[last_col]-1;
        State token = grid[row][last_col];

        return checkDir(token, row, last_col, 0, 1) || checkDir(token, row, last_col, 1, 0) || checkDir(token, row, last_col, 1, 1) || checkDir(token, row, last_col, -1, 1);
    }

    private boolean checkDir(State token, int row, int col, int i, int j){
        int num_in_row = 1;
        boolean left_check=false, right_check=false;

        //check vertical
        while(num_in_row < 4 && (!left_check || !right_check)){
            if(isRow(row+i) && isCol(col+j) && grid[row+i][col+j] == token && !left_check)
                num_in_row++;
            else
                left_check = true;

            if(isRow(row-i) && isCol(col-j) && grid[row-i][col-j] == token && !right_check)
                num_in_row++;
            else
                right_check = true;

            if(i<0)
                i--;
            else if(i>0)
                i++;

            if(j<0)
                j--;
            else if(j>0)
                j++;
        }

        return !(num_in_row < 4);
    }

    private MouseListener ml = new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
            if(gameOver)
                return;

            int x = ((e.getX()+100)/100) -1;
            if(col_heights[x] == ROWS)
                System.out.println("This column is full");
            else
                dropToken(x);
        }

        @Override
        public void mousePressed(MouseEvent e) { }

        @Override
        public void mouseReleased(MouseEvent e) { }

        @Override
        public void mouseEntered(MouseEvent e) { }

        @Override
        public void mouseExited(MouseEvent e) { }
    };

    /*protected void takeTurns(){
        boolean firstPlayer = true;
        int col;

        do{
            displayBoard();
            col = selectCol();
            dropToken(firstPlayer, col);
            firstPlayer = !firstPlayer;
            ui.display();
        }while(!checkWin(col) && empty_slots > 0);

        displayBoard();
        System.out.println("Game over!");

        if(empty_slots == 0)
            System.out.println("It's a draw!");
        else if(!firstPlayer)
            System.out.println("Yellow wins!");
        else
            System.out.println("Red wins!");

    }*/
}
