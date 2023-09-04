public class Main {
    public static void main(String[] args) {
        ArvoreBinaria tree = new ArvoreBinaria();

        // Insert elements into the binary tree
        tree.insert(555);
        tree.insert(333);
        tree.insert(111);
        tree.insert(444);
        tree.insert(888);
        tree.insert(999);

        // Perform preorder traversal to display the tree
        System.out.println("Preorder Traversal:");
        tree.preorderTraversal();

        // Count the number of elements on the left side (excluding the root)
        int contaEsquerda = tree.contadorElementosEsquerda();
        System.out.println("\nNúmero de elementos à esquerda (excluindo a raiz): " + contaEsquerda);

        // Print the binary tree structure
        System.out.println("Estrutura da Árvore Binária:");
        tree.imprimirArvore();
    }
}
