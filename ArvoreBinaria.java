import java.util.ArrayList;
import java.util.Stack;

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

    // Método para contar e listar nós à esquerda (excluindo a raiz)
    public int contadorElementosEsquerda() {
        if (raiz == null) {
            System.out.println("Árvore vazia.");
            return 0;
        }
        ArrayList<No> esquerda = new ArrayList<>();
        listarNosEsquerda(raiz, esquerda);
        return esquerda.size();
    }

    private void listarNosEsquerda(No atual, ArrayList<No> esquerda) {
        if (atual == null) {
            return;
        }

        // Armazena o nó esquerdo na lista (se existir)
        if (atual.getEsq() != null) {
            esquerda.add(atual.getEsq());
        }

        listarNosEsquerda(atual.getEsq(), esquerda);
        listarNosEsquerda(atual.getDir(), esquerda);
    }

    // Método de impressão da estrutura da Árvore Binária
    public void imprimirArvore() {
        if (raiz == null) {
            System.out.println("Árvore vazia.");
            return;
        }

        Stack<NodeAndLevel> stack = new Stack<>();
        stack.push(new NodeAndLevel(raiz, 0));

        while (!stack.isEmpty()) {
            NodeAndLevel current = stack.pop();
            No currentNode = current.node;
            int level = current.level;

            StringBuilder spaces = new StringBuilder();
            for (int i = 0; i < level; i++) {
                spaces.append("  "); // Adiciona padding esquerda!
            }

            if (currentNode == null) {
                System.out.println(spaces.toString() + "-");
            } else {
                System.out.println(spaces.toString() + currentNode.getId());

                stack.push(new NodeAndLevel(currentNode.getDir(), level + 1));
                stack.push(new NodeAndLevel(currentNode.getEsq(), level + 1));
            }
        }
    }

    // Helper class to store both the node and its level
    private static class NodeAndLevel {
        No node;
        int level;

        public NodeAndLevel(No node, int level) {
            this.node = node;
            this.level = level;
        }
    }
}
