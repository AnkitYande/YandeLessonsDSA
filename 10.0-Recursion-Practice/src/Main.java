class Main {

  // Implement your functions from the practice phase here


  // Pascal's Triangle
  public static void printPascals(int n) {
    for (int i = 0; i <= n; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print(pascals(i, j) + " ");
      }
      System.out.println();
    }
  }
  public static int pascals(int row, int column) {
    // TODO: Impliment
    return -1;
  }

  public static void main(String[] args) {
    // Test your functions from the practice phase here
    printPascals(10);
  }
}