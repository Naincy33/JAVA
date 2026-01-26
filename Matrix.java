class MatrixOperations {

    // 1️⃣ Add two 2x2 matrices
    void addMatrices(int[][] a, int[][] b) {
        int[][] sum = new int[2][2];
        System.out.println("Addition of 2x2 matrices:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sum[i][j] = a[i][j] + b[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }

    // 2️⃣ Add two 3x3 matrices
    void addMatrices(int[][] a, int[][] b, int n) {
        int[][] sum = new int[n][n];
        System.out.println("Addition of 3x3 matrices:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum[i][j] = a[i][j] + b[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }

    // 3️⃣ Add two matrices of any dimension
    void addMatrices(int[][] a, int[][] b, int rows, int cols) {
        int[][] sum = new int[rows][cols];
        System.out.println("Addition of matrices of any dimension:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = a[i][j] + b[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// Main class
public class Matrix {
    public static void main(String[] args) {

        MatrixOperations m = new MatrixOperations();

        int[][] a2 = {{1, 2}, {3, 4}};
        int[][] b2 = {{5, 6}, {7, 8}};

        int[][] a3 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] b3 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

        int[][] ax = {{1, 2, 3}, {4, 5, 6}};
        int[][] bx = {{6, 5, 4}, {3, 2, 1}};

        m.addMatrices(a2, b2);
        m.addMatrices(a3, b3, 3);
        m.addMatrices(ax, bx, 2, 3);
    }
}
