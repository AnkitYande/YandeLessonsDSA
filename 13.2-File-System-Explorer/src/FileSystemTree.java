public class FileSystemTree {
  public Node root;
  public Node currentDir;

  public FileSystemTree() {
    // create root (named "/")
    // set current to root
  }

  // abs example: "/home/folder1/folder2"
  // relative example: "./folder1/folder2" or "folder1/folder2"
  // parent example: "../folder1/folder2"
  public void changeDirectory(String path) {
    // change current dir
    // make sure you can process both relative and abs paths
    // split path by '/'
    // make sure path is valid
  }

  public void listFiles() {
    // list children
  }

  public void makeFile(String name) {
    // add child file to current
  }

  public void makeDirectory(String name) {
    // add child dir to current
  }
}