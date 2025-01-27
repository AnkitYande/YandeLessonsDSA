# Image Manipulation Assignment

## Introduction

In this assignment, you will learn how images are represented in the RGB color model and how to manipulate them using Java bitwise operations. You will be provided with starter code, and your task is to complete the missing functions in the `ImageManipulator` class.

## RGB Color Model

### Understanding RGB

RGB stands for Red, Green, and Blue. It's a color model where colors are represented by combining these three primary colors at different intensities. Each color channel (Red, Green, and Blue) can have a value between 0 and 255, which makes up a 24-bit color representation (8 bits per channel).

* **Red** : The intensity of the red color.
* **Green** : The intensity of the green color.
* **Blue** : The intensity of the blue color.

### RGB Color Representation

Each pixel in an image is represented as an integer with the following bit structure:

<pre><div class="dark bg-gray-950 rounded-md border-[0.5px] border-token-border-medium"><div class="flex items-center relative text-token-text-secondary bg-token-main-surface-secondary px-4 py-2 text-xs font-sans justify-between rounded-t-md"><div class="flex items-center"><span class="" data-state="closed"><button class="flex gap-1 items-center"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="none" viewBox="0 0 24 24" class="icon-sm"><path fill="currentColor" fill-rule="evenodd" d="M7 5a3 3 0 0 1 3-3h9a3 3 0 0 1 3 3v9a3 3 0 0 1-3 3h-2v2a3 3 0 0 1-3 3H5a3 3 0 0 1-3-3v-9a3 3 0 0 1 3-3h2zm2 2h5a3 3 0 0 1 3 3v5h2a1 1 0 0 0 1-1V5a1 1 0 0 0-1-1h-9a1 1 0 0 0-1 1zM5 9a1 1 0 0 0-1 1v9a1 1 0 0 0 1 1h9a1 1 0 0 0 1-1v-9a1 1 0 0 0-1-1z" clip-rule="evenodd"></path></svg>Copy code</button></span></div></div><div class="overflow-y-auto p-4 text-left undefined" dir="ltr"><code class="!whitespace-pre hljs">0xRRGGBB
</code></div></div></pre>

* **RR** : Red channel (8 bits)
* **GG** : Green channel (8 bits)
* **BB** : Blue channel (8 bits)

For example, the color magenta (255, 0, 255) would be represented as `0xFF00FF`.

## Java Bitwise Operations

Java provides several bitwise operations that you can use to manipulate individual bits within an integer. Here are the key operations you will need:

* **AND (`&`)** : This operation compares each bit of two integers and returns a new integer with bits set to 1 only if both bits were 1 in the original integers.
* **OR (`|`)** : This operation compares each bit of two integers and returns a new integer with bits set to 1 if either bit was 1 in the original integers.
* **XOR (`^`)** : This operation compares each bit of two integers and returns a new integer with bits set to 1 if the bits were different in the original integers.
* **NOT (`~`)** : This operation inverts all the bits of the integer.
* **Left Shift (`<<`)** : This operation shifts all the bits in the integer to the left by a specified number of positions, filling the rightmost bits with zeros.
* **Right Shift (`>>`)** : This operation shifts all the bits in the integer to the right by a specified number of positions, filling the leftmost bits with the sign bit (the leftmost bit).

### Example

<pre><div class="dark bg-gray-950 rounded-md border-[0.5px] border-token-border-medium"><div class="flex items-center relative text-token-text-secondary bg-token-main-surface-secondary px-4 py-2 text-xs font-sans justify-between rounded-t-md"><span>java</span><div class="flex items-center"><span class="" data-state="closed"><button class="flex gap-1 items-center"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="none" viewBox="0 0 24 24" class="icon-sm"><path fill="currentColor" fill-rule="evenodd" d="M7 5a3 3 0 0 1 3-3h9a3 3 0 0 1 3 3v9a3 3 0 0 1-3 3h-2v2a3 3 0 0 1-3 3H5a3 3 0 0 1-3-3v-9a3 3 0 0 1 3-3h2zm2 2h5a3 3 0 0 1 3 3v5h2a1 1 0 0 0 1-1V5a1 1 0 0 0-1-1h-9a1 1 0 0 0-1 1zM5 9a1 1 0 0 0-1 1v9a1 1 0 0 0 1 1h9a1 1 0 0 0 1-1v-9a1 1 0 0 0-1-1z" clip-rule="evenodd"></path></svg>Copy code</button></span></div></div><div class="overflow-y-auto p-4 text-left undefined" dir="ltr"><code class="!whitespace-pre hljs language-java">int a = 0b0101;  // Binary representation of 5
int b = 0b0011;  // Binary representation of 3

int andResult = a & b; // Result: 0b0001 (1)
int orResult = a | b;  // Result: 0b0111 (7)
int xorResult = a ^ b; // Result: 0b0110 (6)
int notResult = ~a;    // Result: 0b1010 (10 in 2's complement form)
</code></div></div></pre>

## Starter Code

**Here is the provided starter code for your assignment. Your task is to fill in the missing functions in the `ImageManipulator` class.**

### Main Class

The `Main` class initializes three images: two with patterns and one loaded from a file. It then displays the images and applies various bitwise operations and filters.

### ImageManipulator Class

You need to complete the following functions in the `ImageManipulator` class:

1. **getChannel** : Extracts a specific color channel (Red, Green, or Blue) from an image.
2. **bitwiseAnd** : Combines two images using the bitwise AND operation.
3. **bitwiseOr** : Combines two images using the bitwise OR operation.
4. **bitwiseXor** : Combines two images using the bitwise XOR operation.
5. **grayscale** : Converts an image to grayscale using the NTSC formula.
6. **invertColors** : Inverts the colors of an image.
7. **adjustBrightness** : Adjusts the brightness of an image by a specified factor using bitwise shifts.

### Image Class

The `Image` class represents an image and provides methods to set and get pixel values, as well as to load an image from a file.

### ImageDisplay Class

The `ImageDisplay` class displays images in a window.

## Example Method

Here is an example of how you might implement the `getChannel` function:

<pre><div class="dark bg-gray-950 rounded-md border-[0.5px] border-token-border-medium"><div class="flex items-center relative text-token-text-secondary bg-token-main-surface-secondary px-4 py-2 text-xs font-sans justify-between rounded-t-md"><span>java</span><div class="flex items-center"><span class="" data-state="closed"><button class="flex gap-1 items-center"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="none" viewBox="0 0 24 24" class="icon-sm"><path fill="currentColor" fill-rule="evenodd" d="M7 5a3 3 0 0 1 3-3h9a3 3 0 0 1 3 3v9a3 3 0 0 1-3 3h-2v2a3 3 0 0 1-3 3H5a3 3 0 0 1-3-3v-9a3 3 0 0 1 3-3h2zm2 2h5a3 3 0 0 1 3 3v5h2a1 1 0 0 0 1-1V5a1 1 0 0 0-1-1h-9a1 1 0 0 0-1 1zM5 9a1 1 0 0 0-1 1v9a1 1 0 0 0 1 1h9a1 1 0 0 0 1-1v-9a1 1 0 0 0-1-1z" clip-rule="evenodd"></path></svg>Copy code</button></span></div></div><div class="overflow-y-auto p-4 text-left undefined" dir="ltr"><code class="!whitespace-pre hljs language-java">public static Image getChannel(Image image, String channelName) {
    Image result = new Image(image.getWidth(), image.getHeight());
    for (int y = 0; y < image.getHeight(); y++) {
        for (int x = 0; x < image.getWidth(); x++) {
            int color = image.getPixel(x, y);
            if (channelName.equalsIgnoreCase("red")) {
                color &= 0xFF0000;
            } else if (channelName.equalsIgnoreCase("green")) {
                color &= 0x00FF00;
            } else if (channelName.equalsIgnoreCase("blue")) {
                color &= 0x0000FF;
            }
            result.setPixel(x, y, color);
        }
    }
    return result;
}
</code></div></div></pre>

## Submission

Submit your completed `ImageManipulator` class. Ensure that all the functions are correctly implemented and tested using the provided `Main` class.

What pattern do you observe in the image resulting from the bitwise AND OR and XOR operation? Why do certain areas appear as they do?
Explain what you see and you best explaination in a new markdown file and submit it with this assignment.
