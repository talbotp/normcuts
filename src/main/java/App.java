import normCuts.NormalizedCutsConfig;
import normCuts.CutType;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.FileNotFoundException;

/**
 * Entry point to Normalized Cuts.
 */
public class App {

    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main(String[] args) throws FileNotFoundException {

        logger.info("Starting Normalized Cuts");

        NormalizedCutsConfig config = NormalizedCutsConfig.buildFromProperties();

    }

}
