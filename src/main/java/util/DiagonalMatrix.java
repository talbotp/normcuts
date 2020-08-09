package util;

public class DiagonalMatrix implements Matrix {

    private double[] matrix;

    public Matrix dot() {
        return null;
    }

    public Matrix cross() {
        return null;
    }

    public double get(int m, int n) {
        if (m > matrix.length || n > matrix.length)
            throw new IllegalArgumentException("Either m=" + m + " or n=" + n + " are larger than length=" + matrix.length);

        if (m != n)
            return 0;

        return matrix[m];
    }

    public int m() {
        return 0;
    }

    public int n() {
        return 0;
    }
}
