
public class Main {

    public static void main(String[] args) {

        // The user can change the values in the Grid according to the Question

        int[][] board = {
                {3, 0, 6,   5, 0, 8,   4, 0, 0},
                {5, 2, 0,   0, 0, 0,   0, 0, 0},
                {0, 8, 7,   0, 0, 0,   0, 3, 1},

                {0, 0, 3,   0, 1, 0,    0, 8, 0},
                {9, 0, 0,   8, 6, 3,    0, 0, 5},
                {0, 5, 0,   0, 9, 0,    6, 0, 0},

                {1, 3, 0,   0, 0, 0,    2, 5, 0},
                {0, 0, 0,   0, 0, 0,    0, 7, 4},
                {0, 0, 5,   2, 0, 6,    3, 0, 0},
        };





        // This call the 'printSolution' function from the Solution class
        Solution ans = new Solution();

        if(ans.solveSudoku(board)) {
            Solution.printSolution(board);
        }
        else {
            System.out.println("The Sudoku inputs aren't valid, hence can't be solved");
        }


    }
}

