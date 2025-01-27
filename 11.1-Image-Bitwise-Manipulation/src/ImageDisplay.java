import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class ImageDisplay extends JPanel {
    private BufferedImage image;

    public ImageDisplay(BufferedImage img) {
        this.image = img;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this);
    }

    public static void displayImage(BufferedImage img, String title) {
        JFrame frame = new JFrame(title);
        frame.getContentPane().add(new ImageDisplay(img));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(img.getWidth(), img.getHeight() + 25);
        frame.setVisible(true);
    }
}
