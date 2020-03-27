package Leetcode探索.二维数组.java;

class FindDiagonalOrder {
    public static int[] findDiagonalOrder (int[][] matrix) {

        if (matrix == null || matrix.length == 0) {
            return new int[0];
        } else if (matrix.length == 1) {
            return matrix[0];
        }

        int width;
        int height;
        if (matrix.length > matrix[0].length) { // 较长的一边作为width
            width = matrix.length;
            height = matrix[0].length;
        } else {
            width = matrix[0].length;
            height = matrix.length;
        }
        int numOfDia = (width + height) - 1;

        //遍历前半部分对角线元素：
        String seqOfJ = "", seqOfI = "";
        for (int indOfDia = 0;  indOfDia < (numOfDia % 2 == 0 ? numOfDia / 2 : numOfDia / 2 + 1); indOfDia++) {
            String indOfI = "", indOfJ = "";
            if (indOfDia % 2 == 0) { // 偶数行：i递减-，j递增+
                for (int diaLen = 0; diaLen < indOfDia + 1; diaLen++) { // 对角线的长度小于矩阵的较长边
                    indOfI = diaLen + indOfI;
                    indOfJ = indOfJ + diaLen;
                }
            } else { // 奇数行：i递增+，j递减
                for (int diaLen = indOfDia; diaLen >= 0 ; diaLen--) { // 对角线的长度小于矩阵的较长边  
                    indOfI = diaLen + indOfI;
                    indOfJ = indOfJ + diaLen;  
                }
            }
            seqOfI += indOfI;
            seqOfJ += indOfJ;
        }

        //遍历后半部分对角线元素：
        for (int indOfDia = numOfDia / 2 + 1;  indOfDia < numOfDia; indOfDia++) {
            // System.out.println("indOfDia" + indOfDia);
            String indOfI = "", indOfJ = "";
                if (indOfDia % 2 == 0) {  // 偶数行：i递减-，j递增+
                    for (int diaLen = width - 1; diaLen > indOfDia - width; diaLen--) {
                    indOfI = indOfI + diaLen;
                    indOfJ = diaLen + indOfJ;
                }
                } else { // 奇数行：i递增+，j递减
                    for (int diaLen = indOfDia - width + 1; diaLen < width; diaLen++) {
                    indOfI = indOfI + diaLen;
                    indOfJ = diaLen + indOfJ;
                }
            }
            seqOfI += indOfI;
            seqOfJ += indOfJ;
        }
        System.out.println("seqOfI = " + seqOfI);
        System.out.println("seqOfJ = " + seqOfJ);

        int[] result = new int[seqOfI.length()];
        for (int i = 0; i < seqOfI.length(); i++) {
            result[i] = matrix[seqOfI.charAt(i)-48][seqOfJ.charAt(i)-48];
        }
        printArray(result);

        return result;
    }

    public static void printArray (int[] array) {
        System.out.println();
        System.out.println("This is the array: ");
        for (int i = 0; i < array.length; ++i) {
            System.out.println(array[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println(); System.out.println();

        // int[][] matrix3 = {{1, 2, 3} , {4, 5, 6}, {7, 8, 9} };
        // printArray(findDiagonalOrder(matrix3));
        // [1,2,4,7,5,3,6,8,9]

        int[][] matrix55 = {
            { 1,  2,  3,  4,  5}, 
            { 6,  7,  8,  9, 10}, 
            {11, 12, 13, 14, 15}, 
            {16, 17, 18, 19, 20}
        };
        findDiagonalOrder(matrix55);
        // 1, 2, 6, 3, 7, 11, 4, 8, 12, 16, 5, 9, 13, 17, 10, 14, 18, 15, 19, 20

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

        // int[][] matrix0 = {};
        // printArray(findDiagonalOrder(matrix0));

        // int[][] matrix23 = {{2, 3}};
        // printArray(findDiagonalOrder(matrix23));

        // int[][] matrix32 = { {3}, {2}};
        // findDiagonalOrder(matrix32);

        
    }
}