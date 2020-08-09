package normCuts;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class NormalizedCuts {

    private static final Logger logger = LogManager.getLogger(NormalizedCuts.class);

    private NormalizedCutsConfig config;

    private int imgWidth;
    private int imgHeight;
    private int numPixels;

    public NormalizedCuts(NormalizedCutsConfig config) {

        logger.info("I LIKE TURTLES");

        this.config     = config;
        this.numPixels  = 1;
    }
}
