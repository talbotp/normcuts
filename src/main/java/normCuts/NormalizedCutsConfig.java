package normCuts;

/**
 * Object to store data needed to run norm cuts.
 */
public class NormalizedCutsConfig {

    public String imgPath;

    public double sigmaI;
    public double sigmaX;
    public double r;
    public double l;
    public double nCutThreshold;
    public double accuracy;

    public int nCutType;
    public int nClusters;

    public boolean useEigenvectors;

}
