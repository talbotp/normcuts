package normCuts;

import util.Matrix;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import util.SparseMatrix;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.io.File;
import java.io.IOException;

/**
 * Main class which uses the provided config to run the clustering algorithm.
 */
public class NormalizedCuts {

//    private static final Logger logger = LogManager.getLogger(NormalizedCuts.class);
//
//    private NormalizedCutsConfig config;
//    private BufferedImage img;
//    private byte[] pixels;
//    private int[] clusters;
//
//    public NormalizedCuts(NormalizedCutsConfig config) {
//        this.config = config;
//    }
//
//    public int[] cluster(String imgPath) {
//        try {
//            img = ImageIO.read(new File(imgPath));
//        } catch (IOException e) {
//            logger.error("Error when accessing img=" + imgPath);
//            System.exit(-1);
//        }
//
//        logger.info("Successfully loaded img to be clustered, imgPath=" + imgPath);
//
//        pixels = ((DataBufferByte) img.getRaster().getDataBuffer()).getData();
//
//        // Initialize our array which stores the cluster value for pixels.
//        clusters = new int[img.getWidth() * img.getHeight()];
//
//        Matrix similarityMatrix = getSimilarityMatrix();
//
//        cut();
//
//        return clusters;
//    }
//
//    /**
//     * Main loop.
//     *
//     * @param partitions -> the list of partitions which are maybe valid for repartitioning.
//     */
//    private void cut(BiPartition... partitions) {
//        partitions.
//
//    }
//
//    /**
//     * Compute the similarity matrix W.
//     * @return
//     */
//    private Matrix getSimilarityMatrix() {
//        int n = numberOfPixels();
//        Matrix similarityMatrix = new SparseMatrix(n);
//
//        for (int i = 0; i < n; i ++) {
//            for (int j = i; j < n; j++) {
//                double w = getWeight(i, j);
//                similarityMatrix.put(i, j, w);
//                similarityMatrix.put(j, i, w);
//            }
//        }
//
//        return similarityMatrix;
//    }
//
//    public double getWeight(int i, int j) {
//        // Get the pixel coordinates for point i.
//        int i_x = i % img.getWidth();
//        int i_y = i / img.getWidth();
//
//        // Get the pixel coordinates for point j.
//        int j_x = j % img.getHeight();
//        int j_y = j / img.getHeight();
//
//        double euclideanDistance = euclideanDistance(new int[] {i_x, i_y}, new int[] {j_x, j_y});
//
//        if (euclideanDistance < config.r) {
//            // Fetch the brightness image intensity at each pixel.
//            double intensity_i = pixels[i];
//            double intensity_j = pixels[j];
//
//            double featureWeight = Math.exp( - Math.pow(intensity_i - intensity_j, 2) / Math.pow(config.sigmaI, 2) );
//
//            double spatialWeight = Math.exp( - Math.pow(euclideanDistance, 2) / Math.pow(config.sigmaX, 2) );
//
//            return featureWeight * spatialWeight;
//        } else {
//            return 0;
//        }
//    }
//
//    // Require a.length == b.length
//    private static double euclideanDistance(int[] a, int[] b) {
//        double sum = 0;
//        for (int i = 0; i < a.length; i++) {
//            sum += Math.pow(a[i] - b[i], 2);
//        }
//        return Math.sqrt(sum);
//    }
//
//    private int numberOfPixels() {
//        return clusters.length;
//    }

}
