package util;

/**
 * A Diagonal matrix has only non-zero elements when m=n.
 */
public class DiagonalMatrix implements Matrix {

    private double[] matrix;

    public DiagonalMatrix(int size) {
        this.matrix = new double[size];
    }

    public double get(int i, int j) {
        isValidIndicesCheck(i, j);

        if (i != j)
            return 0;

        return matrix[i];
    }

    public void put(int i, int j, double value) {
        isValidIndicesCheck(i, j);

        if (i != j)
            throw new IllegalArgumentException("m=" + i + " and n=" + j + " are not equal, cannot set value on diagonal matrix.");

        matrix[i] = value;
    }

    public Matrix cross(Matrix other) {
        return null;
    }

    public Matrix dot(Matrix other) {
        return null;
    }

    @Override
    public double sumRow(int j) {
        return matrix[j];
    }

    public int size() {
        return matrix.length;
    }

    private void isValidIndicesCheck(int i, int j) {
        if (i < 0 || j < 0 || i > size() || j > size())
            throw new IllegalArgumentException("Invalid values for m=" + i + " or n=" + j + " on diagonal matrix with length=" + size());
    }

}
