import java.util.LinkedList;
import java.util.Queue;

public class Example {
  
public class ArvoreBinaria {
    private No raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    // Method to insert a new node into the binary tree
    public void insert(long id) {
        raiz = insertRec(raiz, id);
    }

    private No insertRec(No root, long id) {
        if (root == null) {
            root = new No(id, null, null);
            return root;
        }

        if (id < root.getId()) {
            root.setEsq(insertRec(root.getEsq(), id));
        } else if (id > root.getId()) {
            root.setDir(insertRec(root.getDir(), id));
        }

        return root;
    }

    // Method to perform preorder traversal of the binary tree
    public void preorderTraversal() {
        preorderTraversal(raiz);
    }

    private void preorderTraversal(No root) {
        if (root != null) {
            System.out.print(root.getId() + " ");
            preorderTraversal(root.getEsq());
            preorderTraversal(root.getDir());
        }
    }

        // Method to count the number of elements on the left side (excluding the root)
    public int contadorElementosEsquerda() {
        return contadorElementosEsquerda(raiz.getEsq());
    }

    private int contadorElementosEsquerda(No root) {
        if (root == null) {
            return 0;
        }

        int leftCount = contadorElementosEsquerda(root.getEsq());
        int rightCount = contadorElementosEsquerda(root.getDir());

        return leftCount + rightCount + 1; // 1 for the current node
    }

  // Method to print the binary tree structure
    public void printTree() {
        if (raiz == null) {
            System.out.println("The tree is empty.");
            return;
        }

        Queue<No> queue = new LinkedList<>();
        queue.add(raiz);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();

            for (int i = 0; i < levelSize; i++) {
                No current = queue.poll();

                if (current == null) {
                    System.out.print("- ");
                } else {
                    System.out.print(current.getId() + " ");
                    queue.add(current.getEsq());
                    queue.add(current.getDir());
                }
            }

            System.out.println(); // Move to the next level
        }
    }
}


public class BigTree {
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

              // Add more elements for a larger tree
        tree.insert(10);
        tree.insert(5);
        tree.insert(45);
        tree.insert(55);
        tree.insert(75);
        tree.insert(85);

        // Perform preorder traversal to display the tree
        System.out.println("Preorder Traversal:");
        tree.preorderTraversal();

        // Count the number of elements on the left side (excluding the root)
        int leftCount = tree.contadorElementosEsquerda();
        System.out.println("\nNumber of elements on the left side (excluding root): " + leftCount);
    }
}
}