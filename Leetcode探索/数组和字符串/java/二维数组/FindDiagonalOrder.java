package Leetcode探索.数组和字符串.java.二维数组;

import java.util.ArrayList;

class FindDiagonalOrder {
    public static int[] findDiagonalOrder(int[][] matrix) {
        // 对角线遍历规律：
        // 同一对角线内元素序列的索引[i][j]中的i和j正好相反
        // 如在 n=8 的矩阵中，最长对角线的遍历，i的序列为 01234567，而j的序列为 76543210
        // 因此矩阵的对角线序列，由长度为1开始到长度为 n-1，先递增再递减，i为递增时j为递减，反之亦然


        // 对角线的初始方向为 [0][0]至[0][1]，先向右再向左，因此i先递减再递增再递减，以此类推，而j正好相反，先递增再递减

        int[][] iMatrix = new int [matrix.length * 2 - 1][]; //存储遍历的每一行
        int[][] jMatrix = new int [matrix.length * 2 - 1][];

        // 第n行之前
        for (int i = 0; i < matrix.length; i++) {
            iMatrix[i] = new int[i+1];
            jMatrix[i] = new int[i+1];
            if (i % 2 == 0) { // 偶数行
                for (int j = 0; j < i + 1; j++) {
                    iMatrix[i][j] = i - j;
                    jMatrix[i][j] = j;
                }
            } else { // 奇数行
                for (int j = 0; j < i + 1; j++) {
                    iMatrix[i][j] = j;
                    jMatrix[i][j] = i - j;
                }
            }
        }

        // 第n行之后
        for (int i = matrix.length; i < matrix.length * 2 - 1; i++) {
            iMatrix[i] = new int[matrix.length * 2 - i - 1];
            jMatrix[i] = new int[matrix.length * 2 - i - 1];
            if (i % 2 == 0) { // 偶数行
                for (int j = 0; j < iMatrix[i].length; j++) {
                    iMatrix[i][j] = matrix.length - j - 1;
                    jMatrix[i][j] = i + 1 - matrix.length + j;
                }
            } else { // 奇数行
                for (int j = 0; j < iMatrix[i].length; j++) {
                    iMatrix[i][j] = i + 1 - matrix.length + j;
                    jMatrix[i][j] = matrix.length - j - 1;
                }
            }
        }

        // System.out.println();
        // System.out.println();
        // System.out.println("iMatrix: " + iMatrix.length);
        // printMatrix(iMatrix);
        // System.out.println();
        // System.out.println("jMatrix: " + jMatrix.length);
        // printMatrix(jMatrix);


        ArrayList<Integer> seq = new ArrayList<>();
        for (int i = 0; i < matrix.length * 2 - 1; i++) {
            for (int j = 0; j < iMatrix[i].length; j ++) {
                System.out.println(matrix[iMatrix[i][j]][jMatrix[i][j]] + " (i=" + i + " j=" + j + ")");
                seq.add(matrix[iMatrix[i][j]][jMatrix[i][j]]);
            }
        }

        int[] sequence = new int[seq.size()];
        for (int i = 0; i < seq.size(); i++) {
            sequence[i] = seq.get(i);
        }
        return sequence;
    }
    
    public static void printArray (int[] array) {
        System.out.println();
        System.out.println("This is the array: ");
        for (int i = 0; i < array.length; ++i) {
            System.out.println(array[i]);
        }
        System.out.println();
    }
    
    private static void printMatrix(int[][] matrix) {
        System.out.println();
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; matrix[i] != null && j < matrix[i].length; ++j) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("                             length: " + matrix[i].length);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println(); System.out.println();
        int[][] matrix3 = {{1, 2, 3} , {4, 5, 6}, {7, 8, 9} };
        printArray(findDiagonalOrder(matrix3));

        // int[][] matrix7 = {
        //     { 0,  1,  2,  3,  4,  5,  6,  7},
        //     {10, 11, 12, 13, 14, 15, 16, 17},
        //     {20, 21, 22, 23, 24, 25, 26, 27},
        //     {30, 31, 32, 33, 34, 35, 36, 37},
        //     {40, 41, 42, 43, 44, 45, 46, 47},
        //     {50, 51, 52, 53, 54, 55, 56, 57},
        //     {60, 61, 62, 63, 64, 65, 66, 67},
        //     {70, 71, 72, 73, 74, 75, 76, 77}
        // };
        // findDiagonalOrder(matrix7);
    }
}