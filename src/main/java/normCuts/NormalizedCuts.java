package normCuts;

import util.Matrix;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class NormalizedCuts {

    private static final Logger logger = LogManager.getLogger(NormalizedCuts.class);

    private NormalizedCutsConfig config;

    private BufferedImage img;

    public NormalizedCuts(NormalizedCutsConfig config) {
        this.config = config;

        try {
            this.img = ImageIO.read(new File(config.imgPath));
        } catch (IOException e) {
            logger.error("An error has occurred when building from path=" + config.imgPath);
        }


    }

    public int[] cluster() {
        return null;
    }

    /**
     * Compute the similarity matrix W.
     * @return
     */
    private Matrix getSimilarityMatrix() {

        return null;
    }

}
