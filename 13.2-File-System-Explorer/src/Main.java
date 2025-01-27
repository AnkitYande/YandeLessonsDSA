import java.util.Scanner;

public class Main {
  public static final String ANSI_GREEN = "\u001B[32m";
  public static final String ANSI_RESET = "\u001B[0m";

  public static void main(String[] args) {
    FileSystemTree fileSystemTree = new FileSystemTree();
    Scanner scanner = new Scanner(System.in);
    boolean isRunning = true;
    while (isRunning) {
      System.out.print(ANSI_GREEN + "$ " + ANSI_RESET);
      String command = scanner.nextLine();
      String[] commandParts = command.split(" ");
      switch (commandParts[0]) {
        case "exit":
          isRunning = false;
          System.out.println("Goodbye!");
          break;
        case "ls":
          fileSystemTree.listFiles();
          break;
        case "cd":
          if (commandParts.length >= 2) {
            fileSystemTree.changeDirectory(commandParts[1]);
          }
          break;
        case "mkdir":
          if (commandParts.length >= 2) {
            fileSystemTree.makeDirectory(commandParts[1]);
          } else {
            System.out.println("Invalid usage: provide name");
          }
          break;
        case "touch":
          if (commandParts.length >= 2) {
            fileSystemTree.makeFile(commandParts[1]);
          } else {
            System.out.println("Invalid usage: provide name");
          }
          break;
        default:
          System.out.println("Invalid command.");
          break;
      }
    }
  }
}