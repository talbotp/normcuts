package normCuts;

/**
 * Object to store data needed to run normalized cuts.
 *
 * This is a WIP, find a clean way to order this.
 */
public class NormalizedCutsConfig {

    public double sigmaI;
    public double sigmaX;
    public double r;
    public double l;
    public double nCutThreshold;
    public double accuracy;

    public int nCutType;
    public int nClusters;

    public boolean useEigenvectors;

    public boolean drawClusters;



}
