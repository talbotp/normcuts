package util;

public interface Matrix {

    public Matrix dot(Matrix other);

    public Matrix cross(Matrix other);

    public double get(int m, int n);

    public void put(int m, int n, double value);

    public int m();

    public int n();

}
