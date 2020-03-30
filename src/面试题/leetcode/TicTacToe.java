package 面试题.leetcode;

// # 348 - 判定井字棋胜负
// 执行用时 : 62 ms, 在所有 Java 提交中击败了 12.88% 的用户
// 内存消耗 : 41.8 MB, 在所有 Java 提交中击败了 81.44% 的用户

class TicTacToe {

    private int[][] grid;

    /** Initialize your data structure here. */
    public TicTacToe(int n) {
        this.grid = new int[n][n];
    }

    /** Player {player} makes a move at ({row}, {col}).
     @param row The row of the board.
     @param col The column of the board.
     @param player The player, can be either 1 or 2.
     @return The current winning condition, can be either:
     0: No one wins.
     1: Player 1 wins.
     2: Player 2 wins. */
    public int move(int row, int col, int player) {
        grid[row][col]=player;
        if (vertical(row, col, player)) {
            System.out.println( "player " + player + " vertical win");
            return player;
        } else if (horizontal(row, col, player)) {
            System.out.println( "player " + player + " horizontal win");
            return player;
        } else if (diagonal1(row, col, player)) {
            System.out.println( "player " + player + " diagonal win");
            return player;
        } else if (diagonal2(row, col, player)) {
            System.out.println( "player " + player + " diagonal win");
            return player;
        } else {
            System.out.println("no one win");
            return 0;
        }
    }

    public boolean vertical (int row, int col, int player) {
        for (int i = 0; i < grid.length; i++) {
            if (grid[i][col] != player) {
                // non-player value found, player failed vertical win
                return false;
            }
        }
        return true;
    }

    public boolean horizontal (int row, int col, int player) {
        for (int i = 0; i < grid.length; i++) {
            if (grid[row][i] != player) {
                // non-player value found, player failed horizontal win
                return false;
            }
        }
        return true;
    }

    public boolean diagonal1 (int row, int col, int player) {
        // player diagonal win
        if ((row + col) == grid.length - 1) {
            for (int i = 0; i < grid.length; i++) {
                if (grid[i][grid.length - 1 - i] != player) {
                    // non-player value found, player failed diagonal win
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public boolean diagonal2 (int row, int col, int player) {
        // player diagonal win
        if (row == col) {
            for (int i = 0; i < grid.length; i++) {
                if (grid[i][i] != player) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // 1
//        TicTacToe toe = new TicTacToe(3);
//        toe.move(0,0,1);
//        toe.move(0,2,2);
//        toe.move(2,2,1);
//        toe.move(1,1,2);
//        toe.move(2,0,1);
//        toe.move(1,0,2);
//        toe.move(2,1,1);

        // 2
//        TicTacToe toe = new TicTacToe(2);
//        toe.move(0,0,2);
//        toe.move(0,1,1);
//        toe.move(1,1,2);

        // 3
//        TicTacToe toe = new TicTacToe(2);
//        toe.move(0,0,2);
//        toe.move(1,1,1);
//        toe.move(0,1,2);

        // 4
        TicTacToe toe = new TicTacToe(2);
        toe.move(0,1,1);
        toe.move(1,1,2);
        toe.move(1,0,1);

        for (int i = 0; i < toe.grid.length; i++) {
            for (int j = 0; j < toe.grid[i].length; j++) {
                System.out.print(toe.grid[i][j]);
                if (j < toe.grid[i].length - 1) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
        }
    }
}
