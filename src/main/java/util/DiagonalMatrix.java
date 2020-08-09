package util;

public class DiagonalMatrix implements Matrix {

    private double[] matrix;

    public DiagonalMatrix(int length) {
        this.matrix = new double[length];
    }

    public double get(int m, int n) {
        isValidIndicesCheck(m, n);

        if (m != n)
            return 0;

        return matrix[m];
    }

    public void put(int m, int n, double value) {
        isValidIndicesCheck(m, n);

        if (m != n)
            throw new IllegalArgumentException("m=" + m + " and n=" + n + " are not equal, cannot set value on diagonal matrix.");

        matrix[m] = value;
    }

    public Matrix cross(Matrix other) {
        return null;
    }

    public Matrix dot(Matrix other) {
        return null;
    }

    public int m() {
        return matrix.length;
    }

    public int n() {
        return matrix.length;
    }

    private void isValidIndicesCheck(int m, int n) {
        if (m < 0 || n < 0 || m > matrix.length || n > matrix.length)
            throw new IllegalArgumentException("Invalid values for m=" + m + " or n=" + n + " on diagonal matrix with length=" + matrix.length);
    }

}
