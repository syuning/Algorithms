package Leetcode题库;

public class GameOfLife {
    public void gameOfLife(int[][] board) {

    }

    public int[] getNeighbours(int[][] board, int x, int y) {
        // 输入矩阵和一个坐标，返回该坐标周围的8个邻居坐标
        int[] neighbours = new int[8];
                                           
        if(board[x][y] == 0) { // 若该细胞当前为死，则当周围有3个活细胞时，下一轮变活，否则保持死亡

        } else if (board[x][y] == 1) { // 若该细胞当前为活，则当周围有2或3个活细胞时，下一轮保持活，否则变死亡

        }

        return neighbours;

    }
}