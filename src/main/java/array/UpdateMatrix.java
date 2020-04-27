package main.java.array;

public class UpdateMatrix {
    public int[][] updateMatrix(int[][] matrix) {

        int[][] result = new int[matrix.length][matrix[0].length];

        int totalRound = matrix.length + matrix[0].length - 2;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    result[i][j] = 0;
                } else {
                    result[i][j] = totalRound;
                }
            }
        }

        // 广度优先搜索

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {

                    int round = 1;
                    while (round < totalRound) {
                        if ( i - round >= 0
                                && i - round < matrix.length
                                && j >= 0
                                && j < matrix[i].length
                                && round < result[i-round][j] ) {
                            result[i-round][j] = round;
                        }
                        if ( i >= 0
                                && i < matrix.length
                                && j - round >= 0
                                && j - round < matrix[i].length
                                && round < result[i][j-round] ) {
                            result[i][j-round] = round;
                        }
                        if ( i + round >= 0
                                && i + round < matrix.length
                                && j >= 0
                                && j < matrix[i].length
                                && round < result[i+round][j] ) {
                            result[i+round][j] = round;
                        }
                        if ( i >= 0
                                && i < matrix.length
                                && j + round >= 0
                                && j + round < matrix[i].length
                                && round < result[i][j+round] ) {
                            result[i][j+round] = round;
                        }
                        round ++;
                    }
                }
            }
        }

        return result;
    }
}
