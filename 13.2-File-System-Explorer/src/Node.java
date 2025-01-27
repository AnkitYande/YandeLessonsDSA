public class Node {
  List<Node> children;
  Node parent;
  String name;
  bool isDirectory;
}

// To use do the following in the file system tree class
// Node root
// root.parent = root