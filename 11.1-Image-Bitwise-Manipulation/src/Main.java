import java.awt.Color;
import java.io.File;


public class Main {
    public static void main(String[] args) {
        
        Image img1 = new Image(100, 100);
        Image img2 = new Image(100, 100);
        Image img3 = Image.loadImage("./src/portrait.jpg");

        // Initialize the first image with black and magenta horizontal stripes
        for (int y = 0; y < 100; y++) {
            int stripeHeight = 100 / 10; // Divide the height into 10 equal parts
            int stripeIndex = y / stripeHeight;

            for (int x = 0; x < 100; x++) {
                int color;
                if (stripeIndex % 2 == 0) { // alternate colors by even and odd
                    color = new Color(0, 255, 255).getRGB(); // Magenta color
                } else {
                    color = new Color(0, 0, 0).getRGB(); // Black color
                }
                img1.setPixel(x, y, color);
            }
        }

        // Initialize the second image with black and cyan vertical stripes
        for (int x = 0; x < 100; x++) {
            int stripeWidth = 100 / 10; // Divide the width into 10 equal parts
            int stripeIndex = x / stripeWidth;
            
            for (int y = 0; y < 100; y++) {
                int color;
                if (stripeIndex % 2 == 0) { // alternate colors by even and odd
                    color = new Color(0, 0, 0).getRGB(); // Black color
                } else {
                    color = new Color(255, 0, 255).getRGB(); // Cyan color
                }
                img2.setPixel(x, y, color);
            }
        }

        // Display the original images
        ImageDisplay.displayImage(img1.getBufferedImage(), "Image 1");
        ImageDisplay.displayImage(img2.getBufferedImage(), "Image 2");
        ImageDisplay.displayImage(img3.getBufferedImage(), "Image 3");

        // Perform bitwise operations and display the results
        Image andImage = ImageManipulator.bitwiseAnd(img1, img2);
        ImageDisplay.displayImage(andImage.getBufferedImage(), "Bitwise AND of Images");

        Image orImage = ImageManipulator.bitwiseOr(img1, img2);
        ImageDisplay.displayImage(orImage.getBufferedImage(), "Bitwise OR of Images");

        Image xorImage = ImageManipulator.bitwiseXor(img1, img2);
        ImageDisplay.displayImage(xorImage.getBufferedImage(), "Bitwise XOR of Images");

        // Apply Filters
        Image bluescale = ImageManipulator.getChannel(img3, "blue");
        ImageDisplay.displayImage(bluescale.getBufferedImage(), "Blue Channel Image 3");

        Image grayscale = ImageManipulator.grayscale(img3);
        ImageDisplay.displayImage(grayscale.getBufferedImage(), "Grayscale Image 3");

        Image adjustedImg = ImageManipulator.adjustBrightness(img3, 2);
        ImageDisplay.displayImage(adjustedImg.getBufferedImage(), "Brightness Adjusted Image 3");

        Image invertedImg = ImageManipulator.invertColors(img3);
        ImageDisplay.displayImage(invertedImg.getBufferedImage(), "Inverted Image 3");
    }
}
