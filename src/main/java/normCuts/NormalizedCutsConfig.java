package normCuts;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Object to store data needed to run normalized cuts.
 *
 * This is a WIP, find a clean way to order this.
 *
 * TODO Maybe add default values.
 */
public class NormalizedCutsConfig {

    protected double sigmaI;
    protected double sigmaX;
    protected double r;
    protected double l;
    protected double nCutThreshold;
    protected double accuracy;

    protected CutType nCutType;
    protected int maxNumberOfClusters;

    protected boolean useEigenvectors;

    protected boolean drawClusters;

    private static final String PROPERTIES_FILE = "config.properties";
    private static final Logger logger = LogManager.getLogger(NormalizedCutsConfig.class);

    public NormalizedCutsConfig(double sigmaI, double sigmaX, double r, double l, double nCutThreshold,
                                double accuracy, CutType nCutType, int maxNumberOfClusters, boolean useEigenvectors,
                                boolean drawClusters) {
        this.sigmaI = sigmaI;
        this.sigmaX = sigmaX;
        this.r = r;
        this.l = l;
        this.nCutThreshold = nCutThreshold;
        this.accuracy = accuracy;

        this.nCutType = nCutType;
        this.maxNumberOfClusters = maxNumberOfClusters;

        this.useEigenvectors = useEigenvectors;
        this.drawClusters = drawClusters;

        logger.debug("Successfully built object " + toString());
    }

    public static NormalizedCutsConfig buildFromProperties() throws FileNotFoundException {
        Properties properties = new Properties();
        InputStream inputStream = NormalizedCuts.class.getClassLoader().getResourceAsStream(PROPERTIES_FILE);

        if (inputStream != null) {
            try {
                properties.load(inputStream);
            } catch (IOException e) {
                logger.error("Error loading input stream into properties.");
            }
        } else {
            throw new FileNotFoundException("Cannot find property file=" + PROPERTIES_FILE + " in the classpath.");
        }

        try {
            inputStream.close();
        } catch (IOException e) {
            logger.error("Error closing inputStream when building config from properties.");
        }

        double sigmaI           = getDouble("sigmaI",           properties);
        double sigmaX           = getDouble("sigmaX",           properties);
        double r                = getDouble("r",                properties);
        double l                = getDouble("l",                properties);
        double nCutThreshold    = getDouble("nCutThreshold",    properties);
        double accuracy         = getDouble("accuracy",         properties);

        CutType nCutType        = getCutType("nCutType",        properties);
        int maxNumberOfClusters = getInt("maxNumberOfClusters", properties);
        boolean useEigenvectors = getBoolean("useEigenvectors", properties);
        boolean drawClusters    = getBoolean("drawClusters",    properties);

        return new NormalizedCutsConfig(sigmaI, sigmaX, r, l, nCutThreshold, accuracy,
                nCutType, maxNumberOfClusters, useEigenvectors, drawClusters);
    }

    @Override
    public String toString() {
        return "NormalizedCutsConfig{" +
                "sigmaI=" + sigmaI +
                ", sigmaX=" + sigmaX +
                ", r=" + r +
                ", l=" + l +
                ", nCutThreshold=" + nCutThreshold +
                ", accuracy=" + accuracy +
                ", nCutType=" + nCutType +
                ", maxNumberOfClusters=" + maxNumberOfClusters +
                ", useEigenvectors=" + useEigenvectors +
                ", drawClusters=" + drawClusters +
                "}.";
    }

    private static CutType getCutType(String propName, Properties properties) {
        return CutType.valueOf(properties.getProperty(propName));
    }

    private static double getDouble(String propName, Properties properties) {
        return Double.parseDouble(properties.getProperty(propName));
    }

    private static int getInt(String propName, Properties properties) {
        return Integer.parseInt(properties.getProperty(propName));
    }

    private static String getString(String propName, Properties properties) {
        return properties.getProperty(propName);
    }

    private static boolean getBoolean(String propName, Properties properties) {
        return Boolean.parseBoolean(properties.getProperty(propName));
    }

}
