package Backtracking;

public class NQueens {

    public static boolean isSafe(char board[][], int row, int col) {
        // Vertical Up
        for(int i=row-1; i>=0; i--) {
            if(board[i][col] == 'Q') {
                return false;
            }
        }
    
        // Diagonaly left Up
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }
    
        // Diagonaly Right Up
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--,j++) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }
    return true;
    }


    public static void nQueen(char board[][], int row) {
        // Base
        if(row == board.length) {
            printBoard(board);
            return;
        }
        // Column loop 
        for(int j=0; j<board.length; j++) {
            if(isSafe(board, row, j)) {
            board[row] [j] = 'Q';
            nQueen(board, row+1); // Function Call 
            board[row][j] = '.'; // Backtracking Step
        }
        }
    }

        public static void printBoard(char board[][]) {
            System.out.println("----------- chess board -----------");
            for(int i=0; i<board.length; i++) {
                for(int j=0; j<board.length; j++) {
                    System.out.print(board[i][j] + " ");
                    // System.out.println(board[i][j] + " ");
                }
                System.out.println();
            }
        }


    public static void main(String[] args) {
        int n = 5;
        char board[] [] = new char [n] [n];
        // Initialize
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
               board[i][j] = '.';
            }
        }
        nQueen(board, 0);
    }

}

