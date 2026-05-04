import java.util.Scanner;

public class TicTacToe {

    private static final int ROW = 3;
    private static final int COL = 3;
    private static String board[][] = new String[ROW][COL];

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        boolean playAgain = true;

        System.out.println("=================================");
        System.out.println("   Welcome to Tic Tac Toe!");
        System.out.println("=================================");

        while (playAgain) {

            clearBoard();
            String player = "X";
            boolean gameOver = false;
            int turnCount = 0;

            while (!gameOver) {

                display();

                int row, col;
                do {
                    System.out.println("Player " + player + "'s turn.");
                    row = SafeInput.getRangedInt(console, "  Enter row   ", 1, ROW) - 1;
                    col = SafeInput.getRangedInt(console, "  Enter column", 1, COL) - 1;

                    if (!isValidMove(row, col)) {
                        System.out.println("  *** That cell is already taken! Choose another. ***\n");
                    }
                } while (!isValidMove(row, col));

                board[row][col] = player;
                turnCount++;

                if (turnCount >= 5 && isWin(player)) {
                    display();
                    System.out.println("*** Player " + player + " WINS! Congratulations! ***\n");
                    gameOver = true;
                } else if (turnCount == ROW * COL || isTie()) {
                    display();
                    System.out.println("*** It's a TIE! Well played! ***\n");
                    gameOver = true;
                } else {
                    player = player.equals("X") ? "O" : "X";
                }
            }

            playAgain = SafeInput.getYNConfirm(console, "Would you like to play again?");
            System.out.println();
        }

        System.out.println("Thanks for playing Tic Tac Toe. Goodbye!");
        console.close();
    }

    private static void clearBoard() {
        for (int r = 0; r < ROW; r++) {
            for (int c = 0; c < COL; c++) {
                board[r][c] = " ";
            }
        }
    }

    private static void display() {
        System.out.println();
        System.out.println("      Col  1   2   3");
        String divider = "         +---+---+---+";

        for (int r = 0; r < ROW; r++) {
            System.out.print("  Row " + (r + 1) + "  ");
            for (int c = 0; c < COL; c++) {
                System.out.print("| " + board[r][c] + " ");
            }
            System.out.println("|");
            System.out.println(divider);
        }
        System.out.println();
    }

    private static boolean isValidMove(int row, int col) {
        return board[row][col].equals(" ");
    }

    private static boolean isWin(String player) {
        return isRowWin(player) || isColWin(player) || isDiagonalWin(player);
    }

    private static boolean isRowWin(String player) {
        for (int r = 0; r < ROW; r++) {
            boolean rowWin = true;
            for (int c = 0; c < COL; c++) {
                if (!board[r][c].equals(player)) {
                    rowWin = false;
                    break;
                }
            }
            if (rowWin) return true;
        }
        return false;
    }

    private static boolean isColWin(String player) {
        for (int c = 0; c < COL; c++) {
            boolean colWin = true;
            for (int r = 0; r < ROW; r++) {
                if (!board[r][c].equals(player)) {
                    colWin = false;
                    break;
                }
            }
            if (colWin) return true;
        }
        return false;
    }

    private static boolean isDiagonalWin(String player) {
        boolean diagWin = true;
        for (int i = 0; i < ROW; i++) {
            if (!board[i][i].equals(player)) {
                diagWin = false;
                break;
            }
        }
        if (diagWin) return true;

        diagWin = true;
        for (int i = 0; i < ROW; i++) {
            if (!board[i][COL - 1 - i].equals(player)) {
                diagWin = false;
                break;
            }
        }
        return diagWin;
    }

    private static boolean isTie() {

        int[][][] vectors = {
            // 3 rows
            {{0,0},{0,1},{0,2}},
            {{1,0},{1,1},{1,2}},
            {{2,0},{2,1},{2,2}},
            // 3 columns
            {{0,0},{1,0},{2,0}},
            {{0,1},{1,1},{2,1}},
            {{0,2},{1,2},{2,2}},
            // 2 diagonals
            {{0,0},{1,1},{2,2}},
            {{0,2},{1,1},{2,0}}
        };

        for (int[][] vector : vectors) {
            boolean hasX = false;
            boolean hasO = false;
            for (int[] cell : vector) {
                if (board[cell[0]][cell[1]].equals("X")) hasX = true;
                if (board[cell[0]][cell[1]].equals("O")) hasO = true;
            }
            if (!(hasX && hasO)) {
                return false;
            }
        }
        return true;
    }
}
