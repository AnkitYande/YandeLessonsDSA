class Main {

  public static int firstUniqCharNaive(String s) {
    return -1;
  }

  public static int firstUniqCharOptimized(String s) {
    return -1;
  }

  public static void main(String[] args) {
    // this are long strings that you can use to test the efficiency of your code
    String longString1 = Consts.LONG_STR1;
    String longString2 = Consts.LONG_STR2;

    // code to test and time your solutions
    long startTime = System.nanoTime();
    int res = firstUniqCharNaive("leetcode");
    long endTime = System.nanoTime();
    double duration = (endTime - startTime) / 1000000.0;
    System.out.println("Naive Result: " + res + " Time Taken: " + duration + "ms");

    startTime = System.nanoTime();
    res = firstUniqCharOptimized("leetcode");
    endTime = System.nanoTime();
    duration = (endTime - startTime) / 1000000.0;
    System.out.println("Optimized Result: " + res + " Time Taken: " + duration + "ms");
  }

}