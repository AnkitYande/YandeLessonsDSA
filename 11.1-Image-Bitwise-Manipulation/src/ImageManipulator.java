public class ImageManipulator {

  // Get a specific channel (R/G/B)
  // Code provided as an example
  public static Image getChannel(Image image, String channelName) {
    Image result = new Image(image.getWidth(), image.getHeight());
    for (int y = 0; y < image.getHeight(); y++) {
      for (int x = 0; x < image.getWidth(); x++) {
        int color = image.getPixel(x, y);
        if (channelName.equalsIgnoreCase("red")) {
          color &= 0xFF0000;
        }
        if (channelName.equalsIgnoreCase("green")) {
          color &= 0x00FF00;
        }
        if (channelName.equalsIgnoreCase("blue")) {
          color &= 0x0000FF;
        }
        result.setPixel(x, y, color);
      }
    }
    return result;
  }

  // Combine two images using bitwise AND and return a new image
  public static Image bitwiseAnd(Image img1, Image img2) {
    int width = Math.min(img1.getWidth(), img2.getWidth());
    int height = Math.min(img1.getHeight(), img2.getHeight());
    Image result = new Image(width, height);
    // TODO: Loop through pixels and apply operation
    return result;
  }

  // Combine two images using bitwise OR and return a new image
  public static Image bitwiseOr(Image img1, Image img2) {
    int width = Math.min(img1.getWidth(), img2.getWidth());
    int height = Math.min(img1.getHeight(), img2.getHeight());
    Image result = new Image(width, height);
    // TODO: Loop through pixels and apply operation
    return result;
  }

  // Combine two images using bitwise XOR and return a new image
  public static Image bitwiseXor(Image img1, Image img2) {
    int width = Math.min(img1.getWidth(), img2.getWidth());
    int height = Math.min(img1.getHeight(), img2.getHeight());
    Image result = new Image(width, height);
    // TODO: Loop through pixels and apply operation
    return result;
  }


  // Convert to Grayscale
  public static Image grayscale(Image image) {
    Image result = new Image(image.getWidth(), image.getHeight());
    //TODO: loop through pixels
    //TODO: separate channels
    //TODO: calculate the gray value using the NTSC formula (0.299 ∙ Red + 0.587 ∙ Green + 0.114 ∙ Blue)
    //TODO: set gray value to all three channels
    return result;
  }

  // Invert the colors of the image and return a new image
  public static Image invertColors(Image image) {
    Image result = new Image(image.getWidth(), image.getHeight());
    //TODO: loop through pixels and invert each color
    return result;
  }

  // Adjust brightness by a factor using bitwise shift and return a new image
  public static Image adjustBrightness(Image image, int shift) {
    Image result = new Image(image.getWidth(), image.getHeight());
    //TODO: loop through pixels
    //TODO: separate each channel
    //TODO: Adjust brightness by bit shifting (shift factor of 1 is equivalent to multiplying by 2)
    //TODO: Remember to handel positive and negative shifts
    return result;
  }
}
