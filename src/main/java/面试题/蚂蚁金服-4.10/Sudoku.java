
public class Sudoku {

    // 第三题
    public boolean isSudoku (int[][] matrix) {

        // check rows
        for (int i = 0; i < matrix.length; i++) {
            String row = "" + matrix[i][0];
            int current = matrix[i][0];
            for (int j = 1; j < matrix[i].length; j++) {
                if (current < matrix[i][j]) {
                    row = row + matrix[i][j];
                } else {
                    row = matrix[i][j] + row;
                }
            }
            if (!row.equals("123456789")) {
                return false;
            }
    }

    // check column
    for (int i = 0; i < matrix.length; i++) {
        String column = "" + matrix[i][0];
        int current = matrix[i][0];
        for (int j = 1; i < matrix.length; j++) {
            if (current < matrix[j][i]) {
                column  = column + matrix[j][i];
            } else {
                column = matrix[j][i] + column;
            }
        }
        if (!column.equals("123456789")) {
            return false;
        }
    }

    // check small matrix
    // if (smallMatrix.equals("123456789")) { return false; } ---这里想不出好办法了

    // 其实已知九宫格结构，可以直接把index写死，这样可以不用循环，但是有点像作弊，这里还是选择放弃，之后继续思考有没有好办法

    return true;
}


}