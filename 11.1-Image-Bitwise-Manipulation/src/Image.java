import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


public class Image {
    private BufferedImage bufferedImage;

    public Image(int width, int height) {
        bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    }

    public void setPixel(int x, int y, int color) {
        bufferedImage.setRGB(x, y, color);
    }

    public int getPixel(int x, int y) {
        return bufferedImage.getRGB(x, y);
    }

    public int getWidth() {
        return bufferedImage.getWidth();
    }

    public int getHeight() {
        return bufferedImage.getHeight();
    }

    public BufferedImage getBufferedImage() {
        return bufferedImage;
    }

    public Image copy() {
        BufferedImage copyImage = new BufferedImage(bufferedImage.getWidth(), bufferedImage.getHeight(), BufferedImage.TYPE_INT_RGB);
        int[] sourcePixels = ((DataBufferInt) bufferedImage.getRaster().getDataBuffer()).getData();
        int[] targetPixels = ((DataBufferInt) copyImage.getRaster().getDataBuffer()).getData();
        System.arraycopy(sourcePixels, 0, targetPixels, 0, sourcePixels.length);
        Image imageCopy = new Image(bufferedImage.getWidth(), bufferedImage.getHeight());
        imageCopy.bufferedImage = copyImage;
        return imageCopy;
    }

    public static Image loadImage(String filePath) {
        try {
            File file = new File(filePath);
            BufferedImage image = ImageIO.read(file);
            return new Image(image.getWidth(), image.getHeight(), image);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    // Constructor for loading image directly from BufferedImage
    public Image(int width, int height, BufferedImage image) {
        bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        bufferedImage.getGraphics().drawImage(image, 0, 0, null);
    }
}
