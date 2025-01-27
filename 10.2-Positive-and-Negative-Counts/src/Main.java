class Main {

  // Implementation of a recursive binary search
  // WE WILL DO THIS TOGETHER AS A CLASS
  // key = value you are searching for
  // low and high = start and end index respectively
  // returns index of key or -1 if key is not found
  // modify this for your solution if needed
  public static int binarySearch(int[] sortedArray, int key, int low, int high) {
    return -1;
  }

  // Implement your solution here
  // This code will be called for your tests. Edit the method however you see fit.
  public static int maximumCount(int[] nums) {
    System.out.println("implement this by modifying binary search");
    System.out.println("Testing binary search method:");
    System.out.println("The index of 2 is: " + binarySearch(nums, 2, 0, nums.length - 1));
    return -1;
  }

  public static int maximumCountNaive(int[] nums) {
    int neg = 0;
    int pos = 0;
    for (int num : nums) {
      if (num < 0)
        neg++;
      if (num > 0)
        pos++;
    }
    System.out.println("negatives: " + neg + " positives: " + pos);
    return Math.max(neg, pos);
  }

  public static void main(String[] args) {
    // long lists for visualizing efficiency
    int[] l1 = Consts.LONG_ARR1;
    int[] l2 = Consts.LONG_ARR2;

    int[] list = { -2, -1, -1, 1, 2, 3 };
    long startTime;
    long endTime;
    double duration;

    startTime = System.nanoTime();
    int naiveRes = maximumCountNaive(list);
    endTime = System.nanoTime();
    duration = (endTime - startTime) / 1000000.0;
    System.out.println("naive res: " + naiveRes + " time taken: " + duration + "ms\n");

    startTime = System.nanoTime();
    int optimizedRes = maximumCount(list);
    endTime = System.nanoTime();
    duration = (endTime - startTime) / 1000000.0;
    System.out.println("optimized res: " + optimizedRes + " time taken: " + duration + "ms\n");
  }
}
