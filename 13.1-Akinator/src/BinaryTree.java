class BinaryTree {
    TreeNode root;

    public BinaryTree(TreeNode rootData) {
        root = rootData;
    }

    ////
    // TODO: add any function you need to help you with the assignment such as adding nodes and traversing
    ////
    
    public String getLeafNodes() {
        return getLeafNodes(root);
    }
    public String getLeafNodes(TreeNode node) {
        // TODO: Implement this method.
    }

    // This function prints out the binary tree
    // It is here to help you debug your code.
    public void printTree() {
        printSubTree(root, "", true);
    }
    private void printSubTree(TreeNode node, String prefix, boolean isTail) {
        if (node == null) return;

        System.out.println(prefix + (isTail ? "└── " : "├── ") + node.data);
        if (node.yes != null || node.no != null) {
            if (node.yes != null) {
                printSubTree(node.yes, prefix + (isTail ? "    " : "│   "), false);
            }
            if (node.no != null) {
                printSubTree(node.no, prefix + (isTail ? "    " : "│   "), true);
            }
        }
    }
}
