public class Main {
    public static void main(String[] args) {
        ArvoreBinaria tree = new ArvoreBinaria();

        // Insert elements into the binary tree
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // Perform preorder traversal to display the tree
        System.out.println("Preorder Traversal:");
        tree.preorderTraversal();

        // Count the number of elements on the left side (excluding the root)
        int leftCount = tree.contadorElementosEsquerda();
        System.out.println("\nNumber of elements on the left side (excluding root): " + leftCount);

        // Print the binary tree structure
        System.out.println("Binary Tree Structure:");
        tree.printTree();
    }
}
