import java.util.*;

public class Solution {

    static final int SIZE = 9;

    static boolean isValid(char[][] board, int row, int col, char num) {
        for (int i = 0; i < SIZE; i++) {
            if (board[row][i] == num) return false;
            if (board[i][col] == num) return false;
        }

        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[startRow + i][startCol + j] == num)
                    return false;
            }
        }
        return true;
    }

    static boolean solveSudoku(char[][] board) {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                if (board[row][col] == '.') {
                    for (char num = '1'; num <= '9'; num++) {
                        if (isValid(board, row, col, num)) {
                            board[row][col] = num;
                            if (solveSudoku(board))
                                return true;
                            board[row][col] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] board = new char[SIZE][SIZE];

        // REQUIRED PROMPT
        System.out.println("Enter the Sudoku grid (9 lines, each 9 characters, use '.' for empty cells):");

        for (int i = 0; i < SIZE; i++) {
            board[i] = sc.nextLine().toCharArray();
        }

        if (solveSudoku(board)) {
            System.out.println("Solved Sudoku:");
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("No solution exists for the given Sudoku puzzle.");
        }
    }
}
