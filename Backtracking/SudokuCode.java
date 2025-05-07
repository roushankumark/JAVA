package Backtracking;

public class SudokuCode {
    public static boolean isSafe(int Sudoku[][], int row, int col, int digit) {
        // Column
        for(int i=0; i<=8; i++) {
            if(Sudoku[i][col] == digit) {
                return false;
            }
        }

        // Row
        for(int j=0; j<=8; j++) {
            if(Sudoku[row][j] == digit) {
                return false;
            }
        }

        // Grid
        int sr = (row/3) * 3;
        int sc = (col/3) * 3;
        //3X3 grid
        for(int i=sr; i<sr+3; i++) {
            for(int j=sc; j<sc+3; j++) {
                if(Sudoku[i][j] == digit) {
                    return false;
                }
            }
        }
        return true;
    }
        

    public static boolean SudokuSolver(int Sudoku[][], int row, int col) {
        // Base Case
        if(row == 9) {
            return true;
        } 

        // Recursion 
        int nextRow = row, nextCol = col+1;
        if(col+1 == 9) {
            nextRow = row+1;
            nextCol = 0;
        }

        if(Sudoku[row][col] != 0) {
            return SudokuSolver(Sudoku, nextRow, nextCol);
        }


        for(int digit=1; digit<=9; digit++) {
            if(isSafe(Sudoku, row, col, digit)) {
                Sudoku[row][col] = digit;
                if(SudokuSolver(Sudoku, nextRow, nextCol)) { // Solution Exists
                    return true;
                }
                Sudoku[row][col] = 0;
            }
        }
        return false;
    }

    public static void printSudoku(int Sudoku[][]) {
        for(int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {
                System.out.print(Sudoku[i][j]+" ");
            }
            System.out.println();
        }

    }

        public static void main(String args[]) {
            int Sudoku[][] = { 
                {0, 0, 8, 0, 0, 0, 0, 0, 0,},
                {4, 9, 0, 1, 5, 7, 0, 0, 2,},
                {0, 0, 3, 0, 0, 4, 1, 9, 0,},
                {1, 8, 5, 0, 6, 0, 0, 2, 0,},
                {0, 0, 0, 0, 2, 0, 0, 6, 0,},
                {9, 6, 0, 4, 0, 5, 3, 0, 0,},
                {0, 3, 0, 0, 7, 2, 0, 0, 4,},
                {0, 4, 9, 0, 3, 0, 0, 5, 7,},
                {8, 2, 7, 0, 0, 9, 0, 1, 3,},
            
            
            };
            if(SudokuSolver(Sudoku, 0, 0)) {
                System.out.println("solution exists");
                printSudoku(Sudoku);
            } else {
                System.out.println("Solution does not exist");
            }
        
    }
    
}
