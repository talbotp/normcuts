package util;

public interface Matrix {

    public Matrix dot(Matrix other);

    public Matrix cross(Matrix other);

    public double get(int i, int j);

    public void put(int i, int j, double value);

    public double sumRow(int j);

    public int size();

}
