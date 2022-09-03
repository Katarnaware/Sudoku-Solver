public class Solution {

    public boolean isSafe(int[][] board, int row, int col, int number) {
        //column
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == number) {
                return false;
            }
        }

        //row
        for (int j = 0; j < board.length; j++) {
            if (board[row][j] == number) {
                return false;
            }
        }

        //grid
        int sr = 3 * (row / 3);
        int sc = 3 * (col / 3);

        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == number) {
                    return false;
                }
            }
        }

        return true;
    }


    public boolean helper(int[][] board, int row, int col) {
        if (row == board.length) {
            return true;
        }

        int new_row = 0;
        int new_col = 0;

        if (col == board.length - 1) {
            new_row = row + 1;
            new_col = 0;

        } else {
            new_row = row;
            new_col = col + 1;
        }

        if (board[row][col] != 0) {
            if (helper(board, new_row, new_col)) {
                return true;
            }
        } else {

            //fill the place
            for (int i = 1; i <= 9; i++) {
                if (isSafe(board, row, col, i)) {
                    board[row][col] = i;
                    if (helper(board, new_row, new_col))
                        return true;
                    else
                        board[row][col] = 0;
                }
            }
        }

        return false;
    }


    public boolean solveSudoku(int[][] board) {

        return helper(board, 0, 0);
    }



    public static void printSolution(int[][] board) {

        for(int i = 0; i < board.length; i++) {

            if(i%3 == 0 && i!= 0)
                System.out.println();

            for(int j = 0; j < board.length; j++) {
                if(j%3 == 0 && j!= 0)
                    System.out.print(" " + " " + " ");

                System.out.print(board[i][j] + " ");
            }

            System.out.println();
        }
    }



}

