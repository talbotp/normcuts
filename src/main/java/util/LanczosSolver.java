package util;

public class LanczosSolver {

    private Matrix matrix;
    private double accuracy;
    private int maxIterations;

    public LanczosSolver(Matrix matrix, double accuracy) {
        this.matrix = matrix;
        this.accuracy = accuracy;
        this.maxIterations = matrix.size();
    }

    public double[] solve() {
        
    }

}
