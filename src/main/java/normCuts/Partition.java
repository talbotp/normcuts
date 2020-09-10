package normCuts;

import util.Matrix;

import java.util.Map;

public class Partition {

    protected Matrix similarityMatrix;
    protected Map<Integer, Integer> partition;

    public Partition(Matrix similarityMatrix, Map<Integer, Integer> partition) {
        this.similarityMatrix = similarityMatrix;
        this.partition = partition;
    }
}
