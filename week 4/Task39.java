public class Task39 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int diagonalSum = 0;

        for (int index = 0; index < matrix.length; index++) {
            diagonalSum += matrix[index][index];
            diagonalSum += matrix[index][matrix.length - 1 - index];
        }

        if (matrix.length % 2 == 1) {
            diagonalSum -= matrix[matrix.length / 2][matrix.length / 2];
        }

        System.out.println(diagonalSum);
    }
}