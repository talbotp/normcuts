package util;

/******************************************************************************
 *  Compilation:  javac SparseMatrix.java
 *  Execution:    java SparseMatrix
 *
 *  A sparse, square matrix, implementing using two arrays of sparse
 *  vectors, one representation for the rows and one for the columns.
 *
 *  For matrix-matrix product, we might also want to store the
 *  column representation.
 *
 ******************************************************************************/

public class SparseMatrix implements Matrix {
    private final int n;           // n-by-n matrix
    private SparseVector[] rows;   // the rows, each row is a sparse vector

    // initialize an n-by-n matrix of all 0s
    public SparseMatrix(int n) {
        this.n = n;
        rows = new SparseVector[n];
        for (int i = 0; i < n; i++)
            rows[i] = new SparseVector(n);
    }

    // put A[i][j] = value
    public void put(int i, int j, double value) {
        if (i < 0 || i >= n) throw new RuntimeException("Illegal index");
        if (j < 0 || j >= n) throw new RuntimeException("Illegal index");
        rows[i].put(j, value);
    }

    @Override
    public int size() {
        return this.n;
    }

    @Override
    public Matrix dot(Matrix other) {
        return null;
    }

    @Override
    public Matrix cross(Matrix other) {
        return null;
    }

    // return A[i][j]
    public double get(int i, int j) {
        if (i < 0 || i >= n) throw new RuntimeException("Illegal index");
        if (j < 0 || j >= n) throw new RuntimeException("Illegal index");
        return rows[i].get(j);
    }

    // return the number of nonzero entries (not the most efficient implementation)
    public int nnz() {
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += rows[i].nnz();
        return sum;
    }

    // return the matrix-vector product b = Ax
    public SparseVector times(SparseVector x) {
        if (n != x.size()) throw new IllegalArgumentException("Dimensions disagree");
        SparseVector b = new SparseVector(n);
        for (int i = 0; i < n; i++)
            b.put(i, this.rows[i].dot(x));
        return b;
    }

    // return this + that
    public SparseMatrix plus(SparseMatrix that) {
        if (this.n != that.n) throw new IllegalArgumentException("Dimensions disagree");
        SparseMatrix result = new SparseMatrix(n);
        for (int i = 0; i < n; i++)
            result.rows[i] = this.rows[i].plus(that.rows[i]);
        return result;
    }

    public double sumRow(int rowNumber) {
        if (rowNumber > n) throw new IllegalArgumentException("row=" + rowNumber + " is larger than n=" + n + ".");
        SparseVector row = rows[rowNumber];
        double sum = 0;
        for (int i = 0; i < row.size(); i++)
            sum += row.get(i);
        return sum;
    }

    // return a string representation
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("n = " + n + ", nonzeros = " + nnz() + "\n");
        for (int i = 0; i < n; i++) {
            s.append(i + ": " + rows[i] + "\n");
        }
        return s.toString();
    }

}
