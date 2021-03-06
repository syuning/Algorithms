package main.java.algorithm;

public class GameOfLife {
    public static void gameOfLife(int[][] board) {
        int[][] newBoard = new int[board.length][board[0].length];
        for (int x = 0; x < board.length; x++) {
            for (int y = 0; y < board[x].length; y++) {
                // 输入矩阵和一个坐标，返回该坐标周围的8个邻居坐标
                int liveCellNum = 0;
                liveCellNum += (x-1) >= 0 && (y-1) >= 0 ? board[x-1][y-1] : 0;
                liveCellNum += (x-1) >= 0 ? board[x-1][y] : 0;
                liveCellNum += (x-1) >= 0 && (y+1) < board[0].length ? board[x-1][y+1] : 0;
                liveCellNum += (y-1) >= 0 ? board[x][y-1] : 0;
                liveCellNum += (y+1) < board[0].length ? board[x][y+1] : 0;
                liveCellNum += (x+1) < board.length && (y-1) >= 0 ? board[x+1][y-1] : 0;
                liveCellNum += (x+1) < board.length ? board[x+1][y] : 0;
                liveCellNum += (x+1) < board.length && (y+1) < board[0].length? board[x+1][y+1] : 0;
                if (board[x][y] == 1) {
                    if (liveCellNum >= 2 && liveCellNum <= 3) {
                        newBoard[x][y] = 1;
                    } else {
                        newBoard[x][y] = 0;
                    }

                } else if (board[x][y] == 0 && liveCellNum == 3) {
                    newBoard[x][y] = 1;
                }
                System.out.print(newBoard[x][y] + " ");
            }
            System.out.println();
        }

    }
    
    public static void main(String[] args){
        int[][] board = {
            {0, 1, 0},
            {0, 0, 1},
            {1, 1, 1},
            {0, 0, 0}
        };
        System.out.println("*** Game Of Life 生命游戏 ***");
        gameOfLife(board);
        System.out.println("****************************");
    }
}