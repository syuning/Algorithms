package test.java.array;
import main.java.array.UpdateMatrix;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UpdateMatrixTest {

    public void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length;j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    @Test
    public void testUpdateMatrix1() {
        UpdateMatrix updateMatrix = new UpdateMatrix();

        int[][] matrix1 = new int[3][3];
        matrix1[0][0] = 0; matrix1[0][1] = 0; matrix1[0][2] = 0;
        matrix1[1][0] = 0; matrix1[1][1] = 1; matrix1[1][2] = 0;
        matrix1[2][0] = 0; matrix1[2][1] = 0; matrix1[2][2] = 0;
        System.out.println("输入：");
        printMatrix(matrix1);
        System.out.println("\n输出：");
        printMatrix(updateMatrix.updateMatrix(matrix1));

        assertEquals(0, updateMatrix.updateMatrix(matrix1)[0][0]);
        assertEquals(0, updateMatrix.updateMatrix(matrix1)[0][1]);
        assertEquals(0, updateMatrix.updateMatrix(matrix1)[0][2]);
        assertEquals(0, updateMatrix.updateMatrix(matrix1)[1][0]);
        assertEquals(1, updateMatrix.updateMatrix(matrix1)[1][1]);
        assertEquals(0, updateMatrix.updateMatrix(matrix1)[1][2]);
        assertEquals(0, updateMatrix.updateMatrix(matrix1)[2][0]);
        assertEquals(0, updateMatrix.updateMatrix(matrix1)[2][1]);
        assertEquals(0, updateMatrix.updateMatrix(matrix1)[2][2]);

    }

    @Test
    public void testUpdateMatrix2() {
        UpdateMatrix updateMatrix = new UpdateMatrix();

        int[][] matrix2 = new int[3][3];
        matrix2[0][0] = 0; matrix2[0][1] = 0; matrix2[0][2] = 0;
        matrix2[1][0] = 0; matrix2[1][1] = 1; matrix2[1][2] = 0;
        matrix2[2][0] = 1; matrix2[2][1] = 1; matrix2[2][2] = 1;

        System.out.println("输入：");
        printMatrix(matrix2);
        System.out.println("\n输出：");
        printMatrix(updateMatrix.updateMatrix(matrix2));

        assertEquals(0, updateMatrix.updateMatrix(matrix2)[0][0]);
        assertEquals(0, updateMatrix.updateMatrix(matrix2)[0][1]);
        assertEquals(0, updateMatrix.updateMatrix(matrix2)[0][2]);
        assertEquals(0, updateMatrix.updateMatrix(matrix2)[1][0]);
        assertEquals(1, updateMatrix.updateMatrix(matrix2)[1][1]);
        assertEquals(0, updateMatrix.updateMatrix(matrix2)[1][2]);
        assertEquals(1, updateMatrix.updateMatrix(matrix2)[2][0]);
        assertEquals(2, updateMatrix.updateMatrix(matrix2)[2][1]);
        assertEquals(1, updateMatrix.updateMatrix(matrix2)[2][2]);

    }

    @Test
    public void testUpdateMatrix3() {
        UpdateMatrix updateMatrix = new UpdateMatrix();

        int[][] matrix = { {0}, {0}, {0}, {0}, {0} };

        System.out.println("输入：");
        printMatrix(matrix);
        System.out.println("\n输出：");
        printMatrix(updateMatrix.updateMatrix(matrix));

        assertEquals(0, updateMatrix.updateMatrix(matrix)[0][0]);
        assertEquals(0, updateMatrix.updateMatrix(matrix)[1][0]);
        assertEquals(0, updateMatrix.updateMatrix(matrix)[2][0]);
        assertEquals(0, updateMatrix.updateMatrix(matrix)[3][0]);
        assertEquals(0, updateMatrix.updateMatrix(matrix)[4][0]);

    }

    @Test
    public void testUpdateMatrix4() {
        UpdateMatrix updateMatrix = new UpdateMatrix();
        int[][] matrix = {
                {0,0,1,0,1,1,1,0,1,1}, {1,1,1,1,0,1,1,1,1,1}, {1,1,1,1,1,0,0,0,1,1}, {1,0,1,0,1,1,1,0,1,1}, {0,0,1,1,1,0,1,1,1,1},
                {1,0,1,1,1,1,1,1,1,1}, {1,1,1,1,0,1,0,1,0,1}, {0,1,0,0,0,1,0,0,1,1}, {1,1,1,0,1,1,0,1,0,1}, {1,0,1,1,1,0,1,1,1,0}
        };
        System.out.println("输入：");
        printMatrix(matrix);
        int[][] expect = {{0,0,1,0,1,2,1,0,1,2},{1,1,2,1,0,1,1,1,2,3},{2,1,2,1,1,0,0,0,1,2},{1,0,1,0,1,1,1,0,1,2},{0,0,1,1,1,0,1,1,2,3},{1,0,1,2,1,1,1,2,1,2},{1,1,1,1,0,1,0,1,0,1},{0,1,0,0,0,1,0,0,1,2},{1,1,1,0,1,1,0,1,0,1},{1,0,1,1,1,0,1,2,1,0}};
        System.out.println("\n期望输出：");
        printMatrix(expect);
        System.out.println("\n实际输出：");
        printMatrix(updateMatrix.updateMatrix(matrix));
    }
}
