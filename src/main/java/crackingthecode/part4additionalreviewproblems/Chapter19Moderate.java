package crackingthecode.part4additionalreviewproblems;

public class Chapter19Moderate {

    /**
     * 19.1 - Write a function to swap a number in place without temporary variables.
     */
    // Time - O(1), Space - O(1)
    public static void swapVar(int a, int b) {
        a ^= b;
        b ^= a;
        a ^= b;
    }

    // Time - O(1), Space - O(1)
    public static void swapVar2(int a, int b) {
        a = b - a; // 4 = 9 - 5
        b = b - a; // 5 = 9 - 4
        a = a + b; // 9 = 4 + 5
    }

    /**
     * 19.2 - Design an algorithm to figure out if someone has won in a game of tic-tac-toe.
     */
    // Outcomes - X - Player 1, O - Player 2, no one
    // Time - O(1), Space - O(1) (since we know it is 3x3 array)
    public static int checkTicTacToe(int[][] board) {
        if (board == null) {
            return -1;
        }

        // Rows
        for (int i = 0; i < board.length; i++) {
            if (board[0][i] != 0
                    && board[0][i] == board[1][i]
                    && board[1][i] == board[2][i]) {
                return board[0][i];
            }
        }

        // Cols
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] != 0
                    && board[i][0] == board[i][1]
                    && board[i][1] == board[i][2]) {
                return board[i][0];
            }
        }

        // Diagnol Cases
        if (board[0][0] != 0
                && board[0][0] == board[1][1]
                && board[1][1] == board[2][2]) {
            return board[0][0];
        }

        if (board[0][2] != 0
                && board[0][2] == board[1][1]
                && board[1][1] == board[2][0]) {
            return board[0][2];
        }

        return -1;
    }

    /**
     * 19.3 - Write an algorithm which computes the number of trailing zeros in n factorial.
     */
    // 5 * 2 = 10
    public static int numZeros(int num) {
        int count = 0;
        if (num < 0) {
            return 0;
        }

        for (int i = 5; num / i > 0; i *= 5) {
            count += num / i;
        }

        return count;
    }

    // misinterpreted the question, I thought we were given the factorial
    public static long getTrailingZeros(long number) {

        long numZeros = 0;

        while (number != 0) {
            long temp = number % 10;
            number /= 10;
            if (temp == 0) {
                numZeros++;
            } else {
                break;
            }
        }

        return numZeros;
    }
}