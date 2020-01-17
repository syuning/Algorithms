package com.bs;

public class TicTacToe {

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
        this.grid[row][col]=player;
        return isWinning(row, col, player);
    }

    /** Everytime a Player makes a move, check this move causes a win and thus end the game.
     */
    public int isWinning(int row, int col, int player) {

        // player diagonal win
        if ((row+col)==this.grid.length) {
            for (int i = 0; i < grid.length; i++) {
                if (grid[i][grid.length-1-i] != player) {
                    // non-player value found, player failed diagonal win
                    return 0;
                }
            }
            return player;
        } else {
            // player horizontal win
            for ( int i = 0; i < this.grid.length; i++) {
                if (grid[row][i] != player){
                    // non-player value found, player failed horizontal win
                    return 0;
                }
            }

            // player vertical win
            for( int i = 0; i < this.grid.length; i++) {
                if (grid[i][col] != player){
                    // non-player value found, player failed vertical win
                    return 0;
                }
            }
            return player;
        }
    }

    public static void main(String[] args) {
        TicTacToe toe = new TicTacToe(3);
        toe.move(0,0,1);
        toe.move(0,2,2);
        toe.move(2,2,1);
        toe.move(1,1,2);
        toe.move(2,0,1);
        toe.move(1,0,2);
        toe.move(2,1,1);
        for (int i = 0; i < toe.grid.length; i++) {
            for (int j = 0; j < toe.grid[i].length; j++) {
                System.out.print(toe.grid[i][j] + ' ');
                System.out.println();
            }
        }
    }
}
